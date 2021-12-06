package entity.core;

public interface BaseEntityInterface<ID> {
    void setId(ID id);
    ID getId();
}
