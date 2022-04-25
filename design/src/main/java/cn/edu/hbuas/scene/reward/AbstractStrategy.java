package cn.edu.hbuas.scene.reward;

/**
 *  抽象策略类
 */
public abstract class AbstractStrategy implements Strategy{

    // 类注册方法
    public void register() {
        StrategyContext.registerStrategy(getClass().getTypeName(), this);
    }
}
