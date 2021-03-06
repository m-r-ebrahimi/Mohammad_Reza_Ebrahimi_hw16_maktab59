package entity.core;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity implements BaseEntityInterface<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    public BaseEntity() {
    }

    @Override
    public String toString() {
        return "\n"+
                getClassName() + "{" +
                "id=" + id+
                ", ";
    }

    @Override
    public void setId(Integer integer) {
        this.id = integer;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public abstract String getClassName();
}
