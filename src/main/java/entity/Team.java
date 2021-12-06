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
    @Column
    private int score;
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<PlaySoccer> homeGames;
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<PlaySoccer> awayGames;
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

    @Override
    public String toString() {
        return super.toString()+
                "name='" + name + '\'' +
                ", cityName='" + cityName + '\'' +
                ", score=" + score +
                ", homeGames=" + homeGames +
                ", awayGames=" + awayGames +
                ", players=" + players +
                ", coach=" + coach +
                '}'+ "\n";
    }
}
