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
    private Team teamHomeId;
    @ManyToOne
    private Team teamAwayId;
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

    @Override
    public String getClassName() {
        return PlaySoccer.class.getSimpleName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "matchDate=" + matchDate +
                ", stadium=" + stadium +
                ", teamHomeId=" + teamHomeId +
                ", teamAwayId=" + teamAwayId +
                ", ball=" + ball +
                ", teamHomeGoals=" + teamHomeGoals +
                ", teamAwayGoals=" + teamAwayGoals +
                ", teamHomePoints=" + teamHomePoints +
                ", teamAwayPoints=" + teamAwayPoints +
                '}'+ "\n";
    }
}
