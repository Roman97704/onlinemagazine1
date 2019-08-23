package com.roman.onlinemagazine.serviceImplement;

import com.roman.onlinemagazine.DTO.MatchDTO;
import com.roman.onlinemagazine.model.Match;
import com.roman.onlinemagazine.repository.MatchRepository;
import com.roman.onlinemagazine.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MatchServiceImplement implements MatchService  {
    @Autowired
    private MatchRepository matchRepository;

    @Override
    public List<MatchDTO> parseMatches() {
        return null;
    }

    @Override
    public void saveAll(List<MatchDTO> list) {

    }

    @Override
    public List<Match> findAll() {
        return null;
    }

    @Override
    public Optional<Match> find(Long id) {
        return Optional.empty();
    }
}
