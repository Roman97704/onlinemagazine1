package com.roman.onlinemagazine.repository;

import com.roman.onlinemagazine.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
}
