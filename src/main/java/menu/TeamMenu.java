package menu;

import entity.Team;
import menu.base.CrudMenu;
import menu.base.Menu;

public class TeamMenu extends Menu implements CrudMenu {

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
        Team team = new Team();
        team.setName(name);
        team.setCityName(city);
        teamServiceInstance.saveOrUpdate(team);
    }

    @Override
    public void update() throws IllegalAccessException {
        System.out.println("Enter team id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new name:");
        String name=scanner.nextLine();
        System.out.println("Enter new city name:");
        String city=scanner.nextLine();
        Team team = (Team) teamServiceInstance.loadById(id);
        team.setName(name);
        team.setCityName(city);
        teamServiceInstance.saveOrUpdate(team);
    }

    @Override
    public void delete() throws IllegalAccessException {
        System.out.println("Enter team id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        teamServiceInstance.delete(id);
    }

    @Override
    public void loadById() throws IllegalAccessException {
        System.out.println("Enter team id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(teamServiceInstance.loadById(id));
    }

    @Override
    public void loadAll() {
        System.out.println(teamServiceInstance.loadAll());
    }
}
