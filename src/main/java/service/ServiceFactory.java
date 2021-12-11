package service;

import service.base.CrudService;
import service.impl.*;

public class ServiceFactory {
    public static CrudService getInstance(CrudService.Type type) {
        return switch (type) {
            case BALL -> BallService.getInstance();
            case COACH -> CoachService.getInstance();
            case PLAYER -> PlayerService.getInstance();
            case PLAY_SOCCER -> PlaySoccerService.getInstance();
            case STADIUM -> StadiumService.getInstance();
            case TEAM -> TeamService.getInstance();
            default -> throw new IllegalArgumentException();
        };
    }
}
