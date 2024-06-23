package com.example.demospring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PlayersDAO extends JpaRepository<Players,Integer> {

    List<Players> findByPlayerRole(String playerRole);

    List<Players> findByNationality(String nationality);

    @Query(value = "SELECT * FROM players WHERE player_role = :playerRole AND nationality = :nationality", nativeQuery = true)
    List<Players> findByPlayerRoleAndNationality(@Param("nationality") String nationality, @Param("playerRole") String playerRole);



}
