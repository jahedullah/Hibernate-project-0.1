package org.hibernate;

public class Player {
    private String playerOrigin;
    private String playerName;
    private int playerId;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


    public String getPlayerOrigin() {
        return playerOrigin;
    }

    public void setPlayerOrigin(String playerOrigin) {
        this.playerOrigin = playerOrigin;
    }


}
