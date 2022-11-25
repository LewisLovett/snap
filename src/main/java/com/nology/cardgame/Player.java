package com.nology.cardgame;

public class Player {

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    private String playerName;


}
