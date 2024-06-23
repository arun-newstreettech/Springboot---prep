package com.example.demospring;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Table(name = "players")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayersStats{
    @Id
    private int playerId;

    private String playerName;
    private String playerRole;
    private String battingStyle;
    private String bowlingStyle;
    private Date dateOfBirth;
    private String nationality;
    private String url;

    //@OneToMany(targetEntity = Playerbattingstats.class,cascade = CascadeType.ALL)
   // @JoinColumn(name = "playerId",referencedColumnName = "playerId")

    @OneToMany(mappedBy = "playerId", cascade = CascadeType.ALL)
    private List<Playerbattingstats> playerbattingstats;


}
