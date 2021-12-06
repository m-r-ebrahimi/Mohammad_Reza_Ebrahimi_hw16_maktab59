package entity;

import entity.core.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Refree extends BaseEntity {
    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String getClassName() {
        return Refree.class.getSimpleName();
    }
}
