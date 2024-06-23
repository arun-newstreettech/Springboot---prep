package com.example.demospring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Battingplayerrankings_testDAO extends JpaRepository<Battingplayerrankings_test,Integer> {


    @Query(value = "SELECT * FROM Battingplayerrankings_test ORDER BY player_rank ASC",nativeQuery = true)
    List<Battingplayerrankings_test> findBysort();

    @Query(value = "SELECT * FROM Battingplayerrankings_test ORDER BY player_rank ASC LIMIT :limit", nativeQuery = true)
    List<Battingplayerrankings_test> findWithLimit(@Param("limit") Integer limit);


}
