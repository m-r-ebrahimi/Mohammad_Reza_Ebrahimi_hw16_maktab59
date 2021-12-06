package entity;

import entity.core.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Match extends BaseEntity {
    @Column
    private int matchId;
    @Column
    private Date matchDate;
    @Column
    private int stadiumId;
    @Column
    private int teamHomeId;
    @Column
    private int teamAwayId;
    @Column
    private int ballId;
    @Column
    private int teamHomeGoals;
    @Column
    private int teamAwayGoals;
    @Column
    private int refereeId;
    @Column
    private int teamHomePoints;
    @Column
    private int teamAwayPoints;

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public int getStadiumId() {
        return stadiumId;
    }

    public void setStadiumId(int stadiumId) {
        this.stadiumId = stadiumId;
    }

    public int getTeamHomeId() {
        return teamHomeId;
    }

    public void setTeamHomeId(int teamHomeId) {
        this.teamHomeId = teamHomeId;
    }

    public int getTeamAwayId() {
        return teamAwayId;
    }

    public void setTeamAwayId(int teamAwayId) {
        this.teamAwayId = teamAwayId;
    }

    public int getBallId() {
        return ballId;
    }

    public void setBallId(int ballId) {
        this.ballId = ballId;
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

    public int getRefereeId() {
        return refereeId;
    }

    public void setRefereeId(int refereeId) {
        this.refereeId = refereeId;
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
    }

    @Override
    public String toString() {
        return super.toString() +
                "matchId=" + matchId +
                ", matchDate=" + matchDate +
                ", stadiumId=" + stadiumId +
                ", teamHomeId=" + teamHomeId +
                ", teamAwayId=" + teamAwayId +
                ", ballId=" + ballId +
                ", teamHomeGoals=" + teamHomeGoals +
                ", teamAwayGoals=" + teamAwayGoals +
                ", refereeId=" + refereeId +
                ", teamHomePoints=" + teamHomePoints +
                ", teamAwayPoints=" + teamAwayPoints +
                '}' + "\n";
    }

    @Override
    public String getClassName() {
        return Match.class.getSimpleName();
    }
}
