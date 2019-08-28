package com.roman.onlinemagazine.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class MatchServiceImplementTest {

    private static final String PARSE_URL = "https://www.hltv.org/matches";

    @Test
    public void parseMatches() throws Exception{
        Document doc = Jsoup.connect(PARSE_URL)
                .userAgent("Chrome/4.0.249.0 Safari/532.5")
                .referrer("http://google.com").get();

        Elements elements = doc.getElementsByClass("match-day");

        String obtainedDate = elements.get(0).getElementsByClass("standard-headline").text();
        System.out.println(obtainedDate);
        Date date = new Date(0);

        String year = obtainedDate.substring(0,4);
        String mounth = obtainedDate.substring(5,7);
        String day = obtainedDate.substring(8,10);
        System.out.println(year);
        System.out.println(mounth);
        System.out.println(day);





//        elements.forEach(e -> System.out.println(e.getElementsByClass("standard-headline")));
    }
}