package org.hibernate.OneToMany.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player { //Player Name
    @Column(name = "pOrigin")
    private String playerOrigin;
    @Column(name = "pName")
    private String playerName;
    @Id
    @Column(name = "pId")
    private int playerId;

    public Player(){

    }

    public Player(int playerId, String playerName, String playerOrigin){
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerOrigin = playerOrigin;
    }

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


    @Override
    public String toString() {
        return "Player{" +
                "playerOrigin='" + playerOrigin + '\'' +
                ", playerName='" + playerName + '\'' +
                ", playerId=" + playerId +
                '}';
    }
}
