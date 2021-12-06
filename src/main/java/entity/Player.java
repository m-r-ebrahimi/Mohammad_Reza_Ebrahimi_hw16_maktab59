package entity;

import entity.core.Person;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Player extends Person {
    @Column
    private int playerId;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    @Override
    public String getClassName() {
        return Player.class.getSimpleName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "playerId=" + playerId +
                '}' + "\n";
    }
}
