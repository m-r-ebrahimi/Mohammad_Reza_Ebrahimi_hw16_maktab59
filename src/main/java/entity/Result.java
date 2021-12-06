package entity;

import entity.core.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Result extends BaseEntity {
    @Column
    private int teamId;
    @Column
    private int matchId;
    @Column
    private int point;
    @Column
    private int goalFor;
    @Column
    private int goalAgainst;

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getGoalFor() {
        return goalFor;
    }

    public void setGoalFor(int goalFor) {
        this.goalFor = goalFor;
    }

    public int getGoalAgainst() {
        return goalAgainst;
    }

    public void setGoalAgainst(int goalAgainst) {
        this.goalAgainst = goalAgainst;
    }

    @Override
    public String toString() {
        return super.toString() +
                "teamId=" + teamId +
                ", matchId=" + matchId +
                ", point=" + point +
                ", goalFor=" + goalFor +
                ", goalAgainst=" + goalAgainst +
                '}';
    }

    @Override
    public String getClassName() {
        return Result.class.getSimpleName();
    }
}
