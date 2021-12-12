package service.impl;

import dao.BallDao;
import entity.Ball;
import service.base.CrudService;

public class BallService extends CrudService<Ball, Integer> {

    private static final class BallServiceHolder {
        private static final BallService ballService = new BallService();
    }

    public static BallService getInstance() {
        return BallServiceHolder.ballService;
    }

    private BallService() {
        setBaseDao(new BallDao(getEntityManager()));
    }

    public BallDao getBaseDao() {
        return (BallDao) super.getBaseDao();
    }
}
