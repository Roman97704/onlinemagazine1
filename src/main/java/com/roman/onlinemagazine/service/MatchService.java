package com.roman.onlinemagazine.service;

import com.roman.onlinemagazine.DTO.MatchDTO;
import com.roman.onlinemagazine.model.Match;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface MatchService {

    List<MatchDTO> parseMatches() throws IOException;
    void saveAll (List<MatchDTO> list);
    List<Match> findAll();
    Optional<Match> find(Long id);


}
