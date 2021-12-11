package service.impl;

import dao.PlayerDao;
import entity.Player;
import service.base.CrudService;

import java.util.List;

public class PlayerService extends CrudService<Player,Integer> {

    private static PlayerService playerService;

    public static PlayerService getInstance() {
        if (playerService == null) {
            synchronized (PlayerService.class) {
                if (playerService == null) {
                    playerService = new PlayerService();
                }
            }
        }
        return playerService;
    }


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
