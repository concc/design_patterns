package cn.edu.hbuas.scene.reward.strategy;

import cn.edu.hbuas.scene.reward.AbstractStrategy;
import cn.edu.hbuas.scene.reward.Strategy;

public class FoodStrategy extends AbstractStrategy implements Strategy {

    private static final FoodStrategy instance = new FoodStrategy();

    private FoodStrategy() {
        register();
    }

    public static FoodStrategy getInstance() {
        return instance;
    }

    @Override
    public void issue(Object... params) {
        System.out.println("美食策略类执行-------------------------");
    }

}
