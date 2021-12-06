package entity;

import entity.core.Person;

import javax.persistence.Entity;

@Entity
public class Coach extends Person {
    private int coachId;

    public int getCoachId() {
        return coachId;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    @Override
    public String getClassName() {
        return Coach.class.getSimpleName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "coachId=" + coachId +
                '}' + "\n";
    }
}
