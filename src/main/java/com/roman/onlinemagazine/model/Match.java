package com.roman.onlinemagazine.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
public class Match {


    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment",strategy = "increment")
    private Long id;
    private Time time;
    private Date date;
    private String firstTeam;
    private String secondTeam;
    private String nameTournament;
    private String typeMatch;
    private double coefficient1;
    private double coefficient2;


    @OneToMany(mappedBy = "match",fetch = FetchType.EAGER)
    private List<Bet> betList;


    public Match() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public double getCoefficient1() {
        return coefficient1;
    }

    public void setCoefficient1(double coefficient1) {
        this.coefficient1 = coefficient1;
    }

    public double getCoefficient2() {
        return coefficient2;
    }

    public void setCoefficient2(double coefficient2) {
        this.coefficient2 = coefficient2;
    }

    public List<Bet> getBetList() {
        return betList;
    }

    public void setBetList(List<Bet> betList) {
        this.betList = betList;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                ", firstTeam='" + firstTeam + '\'' +
                ", secondTeam='" + secondTeam + '\'' +
                ", nameTournament='" + nameTournament + '\'' +
                ", typeMatch='" + typeMatch + '\'' +
                ", coefficient1='" + coefficient1 + '\'' +
                ", coefficient2='" + coefficient2 + '\'' +
                '}';
    }
}
