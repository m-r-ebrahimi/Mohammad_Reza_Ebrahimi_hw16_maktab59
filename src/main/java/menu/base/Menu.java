package menu.base;

import menu.*;
import service.ServiceFactory;
import service.base.CrudService;

import java.util.Scanner;

public class Menu {
    protected static Scanner scanner = new Scanner(System.in);
    protected static int selected = 0;

    protected static final CrudService ballServiceInstance = ServiceFactory.getInstance(CrudService.Type.BALL);
    protected static final CrudService coachServiceInstance = ServiceFactory.getInstance(CrudService.Type.COACH);
    protected static final CrudService playerServiceInstance = ServiceFactory.getInstance(CrudService.Type.PLAYER);
    protected static final CrudService playSoccerServiceInstance = ServiceFactory.getInstance(CrudService.Type.PLAY_SOCCER);
    protected static final CrudService stadiumServiceInstance = ServiceFactory.getInstance(CrudService.Type.STADIUM);
    protected static final CrudService teamServiceInstance = ServiceFactory.getInstance(CrudService.Type.TEAM);

    public static void runMenu() throws IllegalAccessException {
        System.out.println("Welcome to league :)");
        while (selected != 8) {
            System.out.println("""
                    1) Ball
                    2) Stadium
                    3) Team
                    4) Coach
                    5) Player
                    6) Game
                    7) League Info
                    8) EXIT""");
            selected = scanner.nextInt();
            scanner.nextLine();
            switch (selected) {
                case 1:
                    new BallMenu().menu();
                    break;
                case 2:
                    new StadiumMenu().menu();
                    break;
                case 3:
                    new TeamMenu().menu();
                    break;
                case 4:
                    new CoachMenu().menu();
                    break;
                case 5:
                    new PlayerMenu().menu();
                    break;
                case 6:
                    new PlaySoccerMenu().menu();
                    break;
                case 7:
                    new CriteriaMenu().menu();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Try again :/");
            }
        }
    }

}
