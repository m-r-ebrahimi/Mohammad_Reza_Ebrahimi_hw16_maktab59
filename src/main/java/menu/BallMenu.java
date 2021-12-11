package menu;

import entity.Ball;
import menu.base.CrudMenu;
import menu.base.Menu;

public class BallMenu extends Menu implements CrudMenu {
    public void menu() throws IllegalAccessException {
        selected = 0;
        while (selected != 6) {
            System.out.println("""
                    1) Add
                    2) Update
                    3) Delete
                    4) Load by id
                    5) Load all
                    6) Back""");
            selected = scanner.nextInt();
            scanner.nextLine();
            switch (selected) {
                case 1:
                    add();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    loadById();
                    break;
                case 5:
                    loadAll();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Try again :/");
            }
        }
    }


    @Override
    public void add() {
        System.out.println("Enter ball name:");
        String name = scanner.nextLine();
        Ball ball = new Ball();
        ball.setBallName(name);
        ballServiceInstance.saveOrUpdate(ball);
    }

    @Override
    public void update() throws IllegalAccessException {
        System.out.println("Enter ball id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new name:");
        String newName = scanner.nextLine();
        Ball ball = (Ball) ballServiceInstance.loadById(id);
        ball.setBallName(newName);
        ballServiceInstance.saveOrUpdate(ball);
    }

    @Override
    public void delete() throws IllegalAccessException {
        System.out.println("Enter ball id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        ballServiceInstance.delete(id);
    }

    @Override
    public void loadById() throws IllegalAccessException {
        System.out.println("Enter ball id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(ballServiceInstance.loadById(id));
    }

    @Override
    public void loadAll() {
        System.out.println(ballServiceInstance.loadAll());
    }
}
