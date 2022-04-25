package cn.edu.hbuas.scene.reward;

import java.util.HashMap;
import java.util.Map;

/**
 *   策略模式上下文
 */
public class StrategyContext {
    private static final Map<String, Strategy> registerMap = new HashMap<>();


    // 注册策略
    public static void registerStrategy(String rewardType, Strategy strategy) {
        registerMap.put(rewardType, strategy);
    }

    // 获取策略
    public static void getStrategy(String rewardTYpe) {
        registerMap.get(rewardTYpe);
    }
}
