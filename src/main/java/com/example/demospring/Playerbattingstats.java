package com.example.demospring;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "playerbattingstats")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Playerbattingstats {


    private int playerId;

    private int matches;
    private int innings;
    private int notouts;
    private int runs;
    private int highscore;
    private float average;
    private int ballsfaced;
    private float strikerate;
    private int fifties;
    private int hundreds;
    private int fours;
    private int sixes;
    private String format;
    @Id private String playerFormat;
}