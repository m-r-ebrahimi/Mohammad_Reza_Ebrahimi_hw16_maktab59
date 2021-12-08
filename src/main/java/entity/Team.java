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

    @OneToMany
    private List<PlaySoccer> games;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Player> players;
    @OneToOne(mappedBy = "team", cascade = CascadeType.ALL)
    private Coach coach;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<PlaySoccer> getGames() {
        return games;
    }

    public void setGames(List<PlaySoccer> games) {
        this.games = games;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

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
                ", games=" + games +
                ", players=" + players +
                ", coach=" + coach +
                '}'+
                "\n";
    }
}
