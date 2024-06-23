package com.example.demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PlayerController {

   @Autowired
   PlayerService playersService;

    @GetMapping
    public String hello(){
        return "hello world";
    }

    @GetMapping("/listOfPlayers")
    @CrossOrigin(origins = "http://localhost:3001")
    public List<Players> getPlayers(@RequestParam(required = false) String playerRole,@RequestParam(required = false) String nationality){

        if (playerRole != null && !playerRole.isEmpty() && nationality != null && !nationality.isEmpty()) {
            return playersService.getPlayersByRoleAndNationality(nationality, playerRole);
        }

        else if (nationality !=null && !nationality.isEmpty()) {
            return playersService.getPlayersByNationality(nationality);
        }
        else if (playerRole != null && !playerRole.isEmpty()) {

            return playersService.getPlayersByRole(playerRole);
        }


        else {

            return playersService.getAllPlayers();
        }

    }


    @PostMapping("/createPlayer")
    @CrossOrigin(origins = "http://localhost:3001")
    public ResponseEntity<Players> createUser(@RequestBody Players players) {
        Players createdPlayer = playersService.createPlayer(players);
        return new ResponseEntity<>(createdPlayer, HttpStatus.CREATED);
    }


    @GetMapping("/listOfPlayersStats")
    @CrossOrigin(origins = "http://localhost:3001")
    public List<PlayersStats> getPlayersStats(@RequestParam(required = false) String playerName){

        if(playerName!=null){
            return playersService.getPlayersByPlayerName(playerName);
        }
        else{
            return playersService.getAllPlayersStats();
        }

    }


    @GetMapping ("/playerrankingsbatting/test")
    @CrossOrigin(origins = "http://localhost:3001")
    public List<Battingplayerrankings_test> getTestBatRank(@RequestParam(required = false)Integer limit){

        if(limit!=null){
            return playersService.getAllBattingplayerrankings_testwithLimit(limit);
        }
        else{
        return playersService.getAllBattingplayerrankings_test();
        }
    }

    @GetMapping ("/playerrankingsbowling")
    @CrossOrigin(origins = "http://localhost:3001")
    public List<Bowlingplayerrankings_allformat> getBowlersRank(@RequestParam(required = true)String format,@RequestParam(required = false)Integer limit){

        if(format!=null && limit!=null){
            return playersService.getBowlersRankByFormat(format,limit);
        }
        else if(format!=null){
            return playersService.getAllBowlersRankByFormat(format);
        }
        else{
            throw new IllegalArgumentException("'format' parameter is required.");

        }
    }

}
