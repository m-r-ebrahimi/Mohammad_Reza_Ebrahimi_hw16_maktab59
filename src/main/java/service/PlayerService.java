package service;

import dao.PlayerDao;
import entity.Player;
import service.base.CrudService;

public class PlayerService extends CrudService<Player,Integer> {
    public PlayerService() {
        setBaseDao(new PlayerDao(getEntityManager()));
    }

    public PlayerDao getBaseDao() {
        return (PlayerDao) super.getBaseDao();
    }
}
