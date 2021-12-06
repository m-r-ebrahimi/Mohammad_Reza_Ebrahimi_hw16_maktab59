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
    /*@OneToMany( cascade = CascadeType.ALL)
    private List<Match> match;*/


    @Override
    public String getClassName() {
        return Stadium.class.getSimpleName();
    }
}
