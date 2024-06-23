package com.example.demospring;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "bowlingplayerrankings_allformat")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bowlingplayerrankings_allformat {

    @Id private int sno;
    private String playerName;
    private String playerRatings;
    private int playerRank;
    private String playerNationality;
    private String format;
    
}
