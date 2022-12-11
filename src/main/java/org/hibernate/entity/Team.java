package org.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "team")

public class Team {

    @Id
    @Column(name = "teamId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teamId;


    @Column(name = "teamCoach")
    private String teamCoach;

    @Column(name = "teamName")
    private String teamName;

    public Team(){

    }
    public Team( String teamName, String teamCoach){
        this.teamName = teamName;
        this.teamCoach = teamCoach;
    }
    public Team(int teamId, String teamName, String teamCoach){
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamCoach = teamCoach;
    }



    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }


    public String getTeamCoach() {
        return teamCoach;
    }

    public void setTeamCoach(String teamCoach) {
        this.teamCoach = teamCoach;
    }


}
