package menu;

import entity.Stadium;
import menu.base.CrudMenu;
import menu.base.Menu;
import service.BallService;
import service.StadiumService;

public class StadiumMenu extends Menu implements CrudMenu {

    public void menu() throws IllegalAccessException {
        selected=0;
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
        System.out.println("Enter name:");
        String name=scanner.nextLine();
        System.out.println("Enter city name:");
        String city=scanner.nextLine();
        Stadium stadium = new Stadium();
        stadium.setName(name);
        stadium.setCityName(city);
        new StadiumService().saveOrUpdate(stadium);
    }

    @Override
    public void update() throws IllegalAccessException {
        System.out.println("Enter stadium id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new name:");
        String name=scanner.nextLine();
        System.out.println("Enter new city name:");
        String city=scanner.nextLine();
        Stadium stadium = new StadiumService().loadById(id);
        stadium.setName(name);
        stadium.setCityName(city);
        new StadiumService().saveOrUpdate(stadium);
    }

    @Override
    public void delete() throws IllegalAccessException {
        System.out.println("Enter stadium id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        new StadiumService().delete(id);
    }

    @Override
    public void loadById() throws IllegalAccessException {
        System.out.println("Enter stadium id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(new StadiumService().loadById(id));
    }

    @Override
    public void loadAll() {
        System.out.println(new StadiumService().loadAll());
    }
}
