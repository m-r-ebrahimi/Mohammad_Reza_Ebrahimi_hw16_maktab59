package entity;

import entity.core.BaseEntity;

import javax.persistence.*;

@Entity
public class Result extends BaseEntity {
    @ManyToOne
    private Team team;
    @Column
    private int point;
    @Column
    private int goalFor;
    @Column
    private int goalAgainst;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
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
    public String getClassName() {
        return Result.class.getSimpleName();
    }
}
