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

    public PlaySoccer(Date matchDate, Stadium stadium, Team teamHome, Team teamAway, Ball ball, int teamHomeGoals, int teamAwayGoals, int teamHomePoints, int teamAwayPoints) {
        super();
        this.matchDate = matchDate;
        this.stadium = stadium;
        this.teamHome = teamHome;
        this.teamAway = teamAway;
        this.ball = ball;
        this.teamHomeGoals = teamHomeGoals;
        this.teamAwayGoals = teamAwayGoals;
        this.teamHomePoints = teamHomePoints;
        this.teamAwayPoints = teamAwayPoints;
    }

    public PlaySoccer() {
        super();
    }

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

    public static PlaySoccerBuilder playSoccerBuilder() {
        return new PlaySoccerBuilder();
    }
    public static class PlaySoccerBuilder {
        private Date matchDate;
        private Stadium stadium;
        private Team teamHome;
        private Team teamAway;
        private Ball ball;
        private int teamHomeGoals;
        private int teamAwayGoals;
        private int teamHomePoints;
        private int teamAwayPoints;

        public PlaySoccerBuilder setMatchDate(Date matchDate) {
            this.matchDate = matchDate;
            return this;
        }

        public PlaySoccerBuilder setStadium(Stadium stadium) {
            this.stadium = stadium;
            return this;
        }

        public PlaySoccerBuilder setTeamHome(Team teamHome) {
            this.teamHome = teamHome;
            return this;
        }

        public PlaySoccerBuilder setTeamAway(Team teamAway) {
            this.teamAway = teamAway;
            return this;
        }

        public PlaySoccerBuilder setBall(Ball ball) {
            this.ball = ball;
            return this;
        }

        public PlaySoccerBuilder setTeamHomeGoals(int teamHomeGoals) {
            this.teamHomeGoals = teamHomeGoals;
            return this;
        }

        public PlaySoccerBuilder setTeamAwayGoals(int teamAwayGoals) {
            this.teamAwayGoals = teamAwayGoals;
            return this;
        }

        public PlaySoccerBuilder setTeamHomePoints(int teamHomePoints) {
            this.teamHomePoints = teamHomePoints;
            return this;
        }

        public PlaySoccerBuilder setTeamAwayPoints(int teamAwayPoints) {
            this.teamAwayPoints = teamAwayPoints;
            return this;
        }

        public PlaySoccer createPlaySoccer() {
            return new PlaySoccer(matchDate, stadium, teamHome, teamAway, ball, teamHomeGoals, teamAwayGoals, teamHomePoints, teamAwayPoints);
        }
    }
}
