package cn.edu.hbuas.scene.reward.strategy;


import cn.edu.hbuas.scene.reward.AbstractStrategy;
import cn.edu.hbuas.scene.reward.Strategy;

public class WineTourStrategy extends AbstractStrategy implements Strategy {

    private static final WineTourStrategy instance = new WineTourStrategy();

    private WineTourStrategy() {
        register();
    }

    public static WineTourStrategy getInstance() {
        return instance;
    }

    @Override
    public void issue(Object... params) {
        System.out.println("酒旅策略类执行-------------------------");
    }
}
