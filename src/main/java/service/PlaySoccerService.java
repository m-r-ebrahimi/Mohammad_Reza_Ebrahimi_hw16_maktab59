package service;

import dao.PlaySoccerDao;
import entity.PlaySoccer;
import service.base.CrudService;

public class PlaySoccerService extends CrudService<PlaySoccer,Integer> {
    public PlaySoccerService() {
        setBaseDao(new PlaySoccerDao(getEntityManager()));
    }

    public PlaySoccerDao getBaseDao() {
        return (PlaySoccerDao) super.getBaseDao();
    }
}
