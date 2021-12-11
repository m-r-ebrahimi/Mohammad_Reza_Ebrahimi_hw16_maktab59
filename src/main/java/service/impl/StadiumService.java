package service.impl;

import dao.StadiumDao;
import entity.Stadium;
import service.base.CrudService;

public class StadiumService extends CrudService<Stadium,Integer> {

    private static StadiumService stadiumService;

    public static StadiumService getInstance() {
        if (stadiumService == null) {
            synchronized (StadiumService.class) {
                if (stadiumService == null) {
                    stadiumService = new StadiumService();
                }
            }
        }
        return stadiumService;
    }

    public StadiumService() {
        setBaseDao(new StadiumDao(getEntityManager()));
    }

    public StadiumDao getBaseDao() {
        return (StadiumDao) super.getBaseDao();
    }
}
