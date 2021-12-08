package service;

import dao.StadiumDao;
import entity.Stadium;
import service.base.CrudService;

public class StadiumService extends CrudService<Stadium,Integer> {
    public StadiumService() {
        setBaseDao(new StadiumDao(getEntityManager()));
    }

    public StadiumDao getBaseDao() {
        return (StadiumDao) super.getBaseDao();
    }
}
