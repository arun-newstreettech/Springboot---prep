package com.example.demospring;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "battingplayerrankings_test")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Battingplayerrankings_test {

    @Id private String playerName;
    private int playerRatings;
    private int playerRank;
    private String playerNationality;

}
