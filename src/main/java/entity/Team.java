package entity;

import entity.core.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Team extends BaseEntity {
    @Column
    private String name;
    @Column
    private String cityName;
    /*@OneToMany(cascade = CascadeType.ALL)
    private List<Match> match;*/
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Result> results;
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Player> players;
    @OneToOne(mappedBy = "team", cascade = CascadeType.ALL)
    private Coach coach;

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }



    @Override
    public String getClassName() {
        return Team.class.getSimpleName();
    }
}
