package menu.base;

import menu.*;

import java.util.Scanner;

public class Menu {
    protected static Scanner scanner = new Scanner(System.in);
    protected static int selected = 0;

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
