package com.roman.onlinemagazine.serviceImplement;

import com.roman.onlinemagazine.DTO.MatchDTO;
import com.roman.onlinemagazine.exception.MatchesNotFoundException;
import com.roman.onlinemagazine.model.Match;
import com.roman.onlinemagazine.repository.MatchRepository;
import com.roman.onlinemagazine.service.MatchService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class MatchServiceImplement implements MatchService {


    @Autowired
    private MatchRepository matchRepository;

    private static final String PARSE_URL = "https://www.hltv.org/matches";

    @Override
    public List<MatchDTO> parseMatches() throws IOException {
        List<MatchDTO> matchModelList = new ArrayList<>();

        Document doc = Jsoup.connect(PARSE_URL)
                .userAgent("Chrome/4.0.249.0 Safari/532.5")
                .referrer("http://google.com").get();

        Elements elements = doc.getElementsByClass("match-day");

        for (Element element : elements) {
            if (!element.getElementsByClass("map-text").text().equalsIgnoreCase("")) {
                String time = element
                        .getElementsByAttribute("data-time-format")
                        .get(0).text();
                String teams[] = element.getElementsByClass("team")
                        .stream().map(Element::text)
                        .collect(Collectors.toList()).toArray(new String[]{});

                String obtainedDate = elements.get(0).getElementsByClass("standard-headline").text();

                MatchDTO model = new MatchDTO();
                model.setTime(formatTime(time));
                model.setTypeMatch(element.getElementsByClass("map-text").text());
                model.setNameTournament(element.getElementsByClass("event-name").text());
                model.setDate(formatDate(obtainedDate));

                try {
                    model.setFirstTeam(teams[0]);
                    model.setSecondTeam(teams[1]);
                } catch (IndexOutOfBoundsException e) {
                    model.setFirstTeam("No data");
                    model.setSecondTeam("No data");
                }

                matchModelList.add(model);
            }
        }


        return matchModelList.isEmpty()?null:matchModelList;
    }

    @Override
    public void saveAll(List<MatchDTO> list) {
        if (list != null) {
            List<Match> matches = new ArrayList<>();
            list.forEach(matchDTO -> {
                Match match = new Match();
                match.setFirstTeam(matchDTO.getFirstTeam());
                match.setSecondTeam(matchDTO.getSecondTeam());
                match.setTime(matchDTO.getTime());
                match.setNameTournament(matchDTO.getNameTournament());
                match.setTypeMatch(matchDTO.getTypeMatch());
                matches.add(match);
            });
            matches.forEach(System.out::println);
            matchRepository.saveAll(matches);
        } else {
            throw new MatchesNotFoundException();
        }
    }

    @Override
    public List<Match> findAll() {
        return null;
    }

    @Override
    public Optional<Match> find(Long id) {
        return Optional.empty();
    }

    private Time formatTime(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        int millieSec = hours * 3600 * 1000 + minutes * 60 * 1000;

        return new Time(millieSec);
    }

    private Date formatDate(String date){
        String year = date.substring(0,4);
        String month = date.substring(5,7);
        String day = date.substring(8,10);

        return new Date(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
    }
}
