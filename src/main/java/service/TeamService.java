package service;

import dao.PlayerDao;
import dao.TeamDao;
import entity.Player;
import entity.Team;
import service.base.CrudService;

import java.util.List;

public class TeamService extends CrudService<Team,Integer> {
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
