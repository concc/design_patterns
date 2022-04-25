package cn.edu.hbuas.scene.reward.strategy;

import cn.edu.hbuas.scene.reward.AbstractStrategy;
import cn.edu.hbuas.scene.reward.Strategy;

/**
 *  外卖策略类
 */
public class TakeOutStrategy extends AbstractStrategy implements Strategy {

    private static final TakeOutStrategy instance = new TakeOutStrategy();

    private TakeOutStrategy() {
        register();
    }

    public static TakeOutStrategy getInstance() {
        return instance;
    }

    @Override
    public void issue(Object... params) {
        System.out.println("外卖策略类执行-------------------------");
    }
}
