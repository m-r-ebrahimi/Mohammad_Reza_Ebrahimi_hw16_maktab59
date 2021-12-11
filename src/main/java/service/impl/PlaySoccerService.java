package service.impl;

import dao.PlaySoccerDao;
import entity.PlaySoccer;
import service.base.CrudService;

public class PlaySoccerService extends CrudService<PlaySoccer,Integer> {

    private static PlaySoccerService playSoccerService;

    public static PlaySoccerService getInstance() {
        if (playSoccerService == null) {
            synchronized (PlaySoccerService.class) {
                if (playSoccerService == null) {
                    playSoccerService = new PlaySoccerService();
                }
            }
        }
        return playSoccerService;
    }
    public PlaySoccerService() {
        setBaseDao(new PlaySoccerDao(getEntityManager()));
    }

    public PlaySoccerDao getBaseDao() {
        return (PlaySoccerDao) super.getBaseDao();
    }
}
