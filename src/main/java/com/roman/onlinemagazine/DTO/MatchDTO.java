package com.roman.onlinemagazine.DTO;

import java.sql.Date;
import java.sql.Time;

public class MatchDTO {


    private Time time;
    private Date date;
    private String firstTeam;
    private String secondTeam;
    private String nameTournament;
    private String typeMatch;

    public MatchDTO() {
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(String firstTeam) {
        this.firstTeam = firstTeam;
    }

    public String getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(String secondTeam) {
        this.secondTeam = secondTeam;
    }

    public String getNameTournament() {
        return nameTournament;
    }

    public void setNameTournament(String nameTournament) {
        this.nameTournament = nameTournament;
    }

    public String getTypeMatch() {
        return typeMatch;
    }

    public void setTypeMatch(String typeMatch) {
        this.typeMatch = typeMatch;
    }

    @Override
    public String toString() {
        return "MatchDTO{" +
                "time=" + time +
                ", date=" + date +
                ", firstTeam='" + firstTeam + '\'' +
                ", secondTeam='" + secondTeam + '\'' +
                ", nameTournament='" + nameTournament + '\'' +
                ", typeMatch='" + typeMatch + '\'' +
                '}';
    }
}
