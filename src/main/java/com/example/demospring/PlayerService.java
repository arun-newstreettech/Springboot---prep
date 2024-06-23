package com.example.demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayersDAO playersDAO;

    @Autowired
    PlayerStatsDAO playersstatsDAO;

    @Autowired
    Battingplayerrankings_testDAO playerTestBatRankDAO;

    @Autowired
    Bowlingplayerrankings_allformatDAO bowlingplayerrankingsAllformatDAO;


    public List<Players> getAllPlayers() {

        return playersDAO.findAll();
    }

    public List<Players> getPlayersByRole(String playerRole){

        return playersDAO.findByPlayerRole(playerRole);
    }
    public List<Players> getPlayersByNationality(String nationality){

        return playersDAO.findByNationality(nationality);
    }


    public Players createPlayer(Players players){
        return playersDAO.save(players);
    }

    public List<Players> getPlayersByRoleAndNationality(String nationality, String playerRole) {
        return playersDAO.findByPlayerRoleAndNationality(nationality,playerRole);
    }

    public List<PlayersStats> getPlayersByPlayerName(String playerName) {
        return playersstatsDAO.findByPlayerName(playerName);
    }

    public List<PlayersStats> getAllPlayersStats() {
        return playersstatsDAO.findAll();
    }

    public List<Battingplayerrankings_test> getAllBattingplayerrankings_test() {
        return playerTestBatRankDAO.findBysort();
    }

    public List<Battingplayerrankings_test> getAllBattingplayerrankings_testwithLimit(Integer limit) {
        return playerTestBatRankDAO.findWithLimit(limit);
    }

    public List<Bowlingplayerrankings_allformat> getBowlersRankByFormat(String format,Integer limit) {
        return bowlingplayerrankingsAllformatDAO.findBowlersRankByFormat(format,limit);
    }

    public List<Bowlingplayerrankings_allformat> getAllBowlersRankByFormat(String format) {
        return bowlingplayerrankingsAllformatDAO.findAllBowlersRankByFormat(format);
    }
}
