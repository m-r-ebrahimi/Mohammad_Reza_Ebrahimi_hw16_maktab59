package service.impl;

import dao.BallDao;
import entity.Ball;
import service.base.CrudService;

public class BallService extends CrudService<Ball, Integer> {
    private static BallService ballService;

    public static BallService getInstance() {
        if (ballService == null) {
            synchronized (BallService.class) {
                if (ballService == null) {
                    ballService = new BallService();
                }
            }
        }
        return ballService;
    }

    private BallService() {
        setBaseDao(new BallDao(getEntityManager()));
    }

    public BallDao getBaseDao() {
        return (BallDao) super.getBaseDao();
    }
}
