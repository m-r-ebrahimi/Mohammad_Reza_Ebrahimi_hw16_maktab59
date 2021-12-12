package menu;

import entity.Coach;
import entity.Team;
import menu.base.CrudMenu;
import menu.base.Menu;

import java.util.Date;

public class CoachMenu extends Menu implements CrudMenu {
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
    public void add() throws IllegalAccessException {
        System.out.println("Enter coach name:");
        String name = scanner.nextLine();
        System.out.println("Enter salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter hire date");
        Date hireDate = new Date(scanner.nextLine());
        System.out.println("Enter hire expiry date");
        Date hireExpiryDate = new Date(scanner.nextLine());
        System.out.println("Enter team id");
        int teamId = scanner.nextInt();
        scanner.nextLine();

        Coach coach =
                Coach.coachBuilder()
                        .setName(name)
                        .setSalary(salary)
                        .setHireDate(hireDate)
                        .setHireExpiryDate(hireExpiryDate)
                        .setTeam((Team) teamServiceInstance.loadById(teamId)).createCoach();


        coachServiceInstance.saveOrUpdate(coach);
    }

    @Override
    public void update() throws IllegalAccessException {
        System.out.println("Enter id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new name:");
        String name = scanner.nextLine();
        System.out.println("Enter new salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter hire date");
        Date hireDate = new Date(scanner.nextLine());
        System.out.println("Enter hire expiry date");
        Date hireExpiryDate = new Date(scanner.nextLine());
        System.out.println("Enter new team id");
        int teamId = scanner.nextInt();
        scanner.nextLine();

        Coach coach = (Coach) coachServiceInstance.loadById(id);
        coach.setName(name);
        coach.setSalary(salary);
        coach.setHireDate(hireDate);
        coach.setHireExpiryDate(hireExpiryDate);
        coach.setTeam((Team) teamServiceInstance.loadById(teamId));

        coachServiceInstance.saveOrUpdate(coach);
    }

    @Override
    public void delete() throws IllegalAccessException {
        System.out.println("Enter id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        coachServiceInstance.delete(id);
    }

    @Override
    public void loadById() throws IllegalAccessException {
        System.out.println("Enter coach id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(coachServiceInstance.loadById(id));
    }

    @Override
    public void loadAll() {
        System.out.println(coachServiceInstance.loadAll());
    }
}
