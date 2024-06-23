package com.example.demospring;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Players {

    @Id
    private int playerId;

    private String playerName;
    private String playerRole;
    private String battingStyle;
    private String bowlingStyle;
    private Date dateOfBirth;
    private String nationality;
    private String url;




}