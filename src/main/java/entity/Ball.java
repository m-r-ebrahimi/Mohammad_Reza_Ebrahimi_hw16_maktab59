package entity;

import entity.core.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Objects;

@Entity
public class Ball extends BaseEntity {
    @Column
    private String ballName;

    /*@OneToOne
    private Match match;*/

    public Ball(String ballName) {
        this.ballName = ballName;
    }

    public Ball() {

    }


    public String getBallName() {
        return ballName;
    }

    public void setBallName(String ballName) {
        this.ballName = ballName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Objects.equals(ballName, ball.ballName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballName);
    }



    @Override
    public String getClassName() {
        return Ball.class.getSimpleName();
    }
}
