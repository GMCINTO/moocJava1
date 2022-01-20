/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glene
 */
public class Game {

    private String team1;
    private String team2;
    private int team1Score;
    private int team2Score;


public Game (String team1, String team2, int team1Score, int team2Score){
    this.team1= team1;
    this.team2= team2;
    this.team1Score = team1Score;
    this.team2Score = team2Score;
    

}
public String getTeam1() {
    
    return team1;
    
}
public String getTeam2() {
    
    return team2;
    
}
public int getTeam1Score() {
    
    return team1Score;
    
}
public int getTeam2Score() {
    
    return team2Score;
    
}
public String winner(){
    if (team1Score > team2Score){
        return team1;
    }else{
        return team2;
    }
}
}