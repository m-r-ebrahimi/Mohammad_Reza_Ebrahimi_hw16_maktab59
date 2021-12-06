package entity;

import entity.core.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Match extends BaseEntity {

    @Column
    private String name;


    /*@Column
    private Date matchDate;
    @ManyToOne
    private Stadium stadium;
    @ManyToOne
    private Team teamHome;
    @ManyToOne
    private Team teamAway;
    @OneToOne
    private Ball ball;
    @Column
    private int teamHomeGoals;
    @Column
    private int teamAwayGoals;
    @Column
    private int teamHomePoints;
    @Column
    private int teamAwayPoints;


    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public Team getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(Team teamHome) {
        this.teamHome = teamHome;
    }

    public Team getTeamAway() {
        return teamAway;
    }

    public void setTeamAway(Team teamAway) {
        this.teamAway = teamAway;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public int getTeamHomeGoals() {
        return teamHomeGoals;
    }

    public void setTeamHomeGoals(int teamHomeGoals) {
        this.teamHomeGoals = teamHomeGoals;
    }

    public int getTeamAwayGoals() {
        return teamAwayGoals;
    }

    public void setTeamAwayGoals(int teamAwayGoals) {
        this.teamAwayGoals = teamAwayGoals;
    }

    public int getTeamHomePoints() {
        return teamHomePoints;
    }

    public void setTeamHomePoints(int teamHomePoints) {
        this.teamHomePoints = teamHomePoints;
    }

    public int getTeamAwayPoints() {
        return teamAwayPoints;
    }

    public void setTeamAwayPoints(int teamAwayPoints) {
        this.teamAwayPoints = teamAwayPoints;
    }*/


    @Override
    public String getClassName() {
        return Match.class.getSimpleName();
    }
}
