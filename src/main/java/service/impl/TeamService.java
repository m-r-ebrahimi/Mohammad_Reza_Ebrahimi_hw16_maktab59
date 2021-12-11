package service.impl;

import dao.TeamDao;
import entity.Team;
import service.base.CrudService;

import java.util.List;

public class TeamService extends CrudService<Team,Integer> {

    private static TeamService teamService;

    public static TeamService getInstance() {
        if (teamService == null) {
            synchronized (TeamService.class) {
                if (teamService == null) {
                    teamService = new TeamService();
                }
            }
        }
        return teamService;
    }

    public TeamService() {
        setBaseDao(new TeamDao(getEntityManager()));
    }

    public TeamDao getBaseDao() {
        return (TeamDao) super.getBaseDao();
    }

    public List<Object[]> getCitiesTeams(){
        return new TeamDao(getEntityManager()).getCitiesTeams();
    }

    public List<Object[]> getTeamsPoints(){
        return new TeamDao(getEntityManager()).getTeamsPoints();
    }

    public Team getChampion(){
        return new TeamDao(getEntityManager()).getChampionTeam();
    }
}
