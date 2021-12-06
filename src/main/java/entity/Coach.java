package entity;

import entity.core.Person;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Coach extends Person {
    @OneToOne
    private Team team;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String getClassName() {
        return Coach.class.getSimpleName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "team=" + team +
                '}' + "\n";
    }
}
