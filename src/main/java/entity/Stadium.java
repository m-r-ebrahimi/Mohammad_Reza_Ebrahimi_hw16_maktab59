package entity;

import entity.core.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Stadium extends BaseEntity {
    @Column
    private String name;
    @Column
    private String cityName;
    @OneToMany(mappedBy = "stadium", cascade = CascadeType.ALL)
    private List<PlaySoccer> games;

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

    public List<PlaySoccer> getGames() {
        return games;
    }

    public void setGames(List<PlaySoccer> games) {
        this.games = games;
    }

    @Override
    public String getClassName() {
        return Stadium.class.getSimpleName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "name='" + name + '\'' +
                ", cityName='" + cityName + '\'' +
                '}'+
                "\n";
    }
}
