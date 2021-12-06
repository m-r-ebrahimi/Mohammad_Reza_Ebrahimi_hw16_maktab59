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
    @Override
    public String getClassName() {
        return Stadium.class.getSimpleName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "name='" + name + '\'' +
                ", cityName='" + cityName + '\'' +
                ", games=" + games +
                '}'+ "\n";
    }
}
