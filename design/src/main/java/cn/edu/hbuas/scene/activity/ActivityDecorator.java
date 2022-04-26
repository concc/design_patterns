package cn.edu.hbuas.scene.activity;

/**
 *  抽象装饰者
 */
public abstract class ActivityDecorator implements ActivityInterface{
    protected ActivityInterface activity;

    public ActivityDecorator(ActivityInterface activity) {
        this.activity = activity;
    }

    public abstract void participate(Long userId);
}

