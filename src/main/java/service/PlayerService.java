package service;

import dao.CoachDao;
import dao.PlayerDao;
import entity.Coach;
import entity.Player;
import service.base.CrudService;

import java.util.List;

public class PlayerService extends CrudService<Player,Integer> {
    public PlayerService() {
        setBaseDao(new PlayerDao(getEntityManager()));
    }

    public PlayerDao getBaseDao() {
        return (PlayerDao) super.getBaseDao();
    }

    public List<Player> getExpensivePlayers(){
        return new PlayerDao(getEntityManager()).getExpensivePlayers();
    }

}
