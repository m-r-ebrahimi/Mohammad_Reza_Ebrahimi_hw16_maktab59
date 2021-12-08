package service;

import dao.BallDao;
import entity.Ball;
import service.base.CrudService;

public class BallService extends CrudService<Ball,Integer> {
    public BallService() {
        setBaseDao(new BallDao(getEntityManager()));
    }

    public BallDao getBaseDao() {
        return (BallDao) super.getBaseDao();
    }
}
