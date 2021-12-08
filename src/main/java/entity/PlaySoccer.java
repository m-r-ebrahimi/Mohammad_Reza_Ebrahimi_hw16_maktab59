package entity;

import entity.core.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class PlaySoccer extends BaseEntity {
    @Column
    private Date matchDate;
    @ManyToOne
    private Stadium stadium;
    @ManyToOne
    private Team teamHome;
    @ManyToOne
    private Team teamAway;
    @ManyToOne
    private Ball ball;
    @Column
    private int teamHomeGoals;
    @Column
    private int teamAwayGoals;

    @Column
    private int teamHomePoints;
    @Column
    private int teamAwayPoints;

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public void setTeamHome(Team teamHome) {
        this.teamHome = teamHome;
    }

    public void setTeamAway(Team teamAway) {
        this.teamAway = teamAway;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public void setTeamHomeGoals(int teamHomeGoals) {
        this.teamHomeGoals = teamHomeGoals;
    }

    public void setTeamAwayGoals(int teamAwayGoals) {
        this.teamAwayGoals = teamAwayGoals;
    }

    public void setTeamHomePoints(int teamHomePoints) {
        this.teamHomePoints = teamHomePoints;
    }

    public void setTeamAwayPoints(int teamAwayPoints) {
        this.teamAwayPoints = teamAwayPoints;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public Team getTeamHome() {
        return teamHome;
    }

    public Team getTeamAway() {
        return teamAway;
    }

    public Ball getBall() {
        return ball;
    }

    public int getTeamHomeGoals() {
        return teamHomeGoals;
    }

    public int getTeamAwayGoals() {
        return teamAwayGoals;
    }

    public int getTeamHomePoints() {
        return teamHomePoints;
    }

    public int getTeamAwayPoints() {
        return teamAwayPoints;
    }

    @Override
    public String getClassName() {
        return PlaySoccer.class.getSimpleName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "matchDate=" + matchDate +
                ", stadium=" + stadium +
                ", teamHomeId=" + teamHome+
                ", teamAwayId=" + teamAway+
                ", ball=" + ball +
                ", teamHomeGoals=" + teamHomeGoals +
                ", teamAwayGoals=" + teamAwayGoals +
                ", teamHomePoints=" + teamHomePoints +
                ", teamAwayPoints=" + teamAwayPoints +
                '}'+
                "\n";
    }
}
