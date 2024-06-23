package com.example.demospring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Bowlingplayerrankings_allformatDAO extends JpaRepository<Bowlingplayerrankings_allformat,Integer> {

    @Query(value = "SELECT * FROM bowlingplayerrankings_allformat WHERE format = :format ORDER BY player_rank ASC LIMIT :limit", nativeQuery = true)
    List<Bowlingplayerrankings_allformat> findBowlersRankByFormat(@Param("format") String format, @Param("limit") Integer limit);


    @Query(value = "SELECT * FROM bowlingplayerrankings_allformat WHERE format = :format ORDER BY player_rank ASC", nativeQuery = true)
    List<Bowlingplayerrankings_allformat> findAllBowlersRankByFormat(@Param("format") String format);
}
