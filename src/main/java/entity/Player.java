package entity;

import entity.core.Person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Player extends Person {
    @ManyToOne
    private Team team;

    @Override
    public String getClassName() {
        return Player.class.getSimpleName();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
