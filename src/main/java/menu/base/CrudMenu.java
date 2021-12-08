package menu.base;

public interface CrudMenu {
    void add() throws IllegalAccessException;
    void update() throws IllegalAccessException;
    void delete() throws IllegalAccessException;
    void loadById() throws IllegalAccessException;
    void loadAll();
}
