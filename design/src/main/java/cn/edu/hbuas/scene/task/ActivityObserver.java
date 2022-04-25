package cn.edu.hbuas.scene.task;

/**
 *  活动观察者
 */
public class ActivityObserver implements Observer {

    private ActivityService activityService;

    @Override
    public void response(Long taskId) {
        activityService.notifyFinished(taskId);
    }
}
