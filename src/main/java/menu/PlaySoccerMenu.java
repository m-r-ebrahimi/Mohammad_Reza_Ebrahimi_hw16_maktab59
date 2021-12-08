package menu;

import entity.Ball;
import entity.PlaySoccer;
import entity.Stadium;
import entity.Team;
import menu.base.CrudMenu;
import menu.base.Menu;
import service.*;

import java.util.Date;

public class PlaySoccerMenu extends Menu implements CrudMenu {

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
        System.out.println("Enter match date:");
        Date date = new Date(scanner.nextLine());
        System.out.println("Enter stadium id:");
        Stadium stadium = new StadiumService().loadById(scanner.nextInt());
        System.out.println("Enter team (home) id:");
        Team teamHome = new TeamService().loadById(scanner.nextInt());
        System.out.println("Enter team (away) id:");
        Team teamAway = new TeamService().loadById(scanner.nextInt());
        System.out.println("Enter ball id:");
        Ball ball = new BallService().loadById(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter team home - away goals:");
        String goals = scanner.nextLine();
        String[] goal = goals.split(" - ");
        int teamHomeGoal = Integer.parseInt(goal[0]);
        int teamAwayGoal = Integer.parseInt(goal[1]);
        int teamHomePoint;
        int teamAwayPoint;

        if (teamHomeGoal - teamAwayGoal > 0) {
            teamHomePoint = 3;
            teamAwayPoint = 0;
        } else if (teamHomeGoal - teamAwayGoal < 0) {
            teamHomePoint = 0;
            teamAwayPoint = 3;
        } else {
            teamHomePoint = 1;
            teamAwayPoint = 1;
        }
        PlaySoccer playSoccer = new PlaySoccer();
        playSoccer.setMatchDate(date);
        playSoccer.setStadium(stadium);
        playSoccer.setTeamHome(teamHome);
        playSoccer.setTeamAway(teamAway);
        playSoccer.setBall(ball);
        playSoccer.setTeamHomeGoals(teamHomeGoal);
        playSoccer.setTeamAwayGoals(teamAwayGoal);
        playSoccer.setTeamHomePoints(teamHomePoint);
        playSoccer.setTeamAwayPoints(teamAwayPoint);
        new PlaySoccerService().saveOrUpdate(playSoccer);
        teamHome.setScore(teamHome.getScore() + teamHomePoint);
        teamAway.setScore(teamAway.getScore() + teamAwayPoint);
        new TeamService().saveOrUpdate(teamHome);
        new TeamService().saveOrUpdate(teamAway);
    }

    @Override
    public void update() throws IllegalAccessException {

    }

    @Override
    public void delete() throws IllegalAccessException {
        System.out.println("Enter match id:");
        int id=scanner.nextInt();
        scanner.nextLine();
        PlaySoccer playSoccer = new PlaySoccerService().loadById(id);
        Team teamHome = playSoccer.getTeamHome();
        int teamHomePoints = playSoccer.getTeamHomePoints();
        Team teamAway = playSoccer.getTeamAway();
        int teamAwayPoints = playSoccer.getTeamAwayPoints();
        teamHome.setScore(teamHome.getScore() - teamHomePoints);
        teamAway.setScore(teamAway.getScore() - teamAwayPoints);
        new TeamService().saveOrUpdate(teamHome);
        new TeamService().saveOrUpdate(teamAway);
        new PlaySoccerService().delete(id);
    }

    @Override
    public void loadById() throws IllegalAccessException {
        System.out.println("Enter match id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(new PlaySoccerService().loadById(id));
    }

    @Override
    public void loadAll() {
        System.out.println(new PlaySoccerService().loadAll());
    }
}