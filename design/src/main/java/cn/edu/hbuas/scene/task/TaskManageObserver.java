package cn.edu.hbuas.scene.task;
/**
 *  任务管理观察者
 */
public class TaskManageObserver implements Observer{

    private TaskManager taskManager;

    @Override
    public void response(Long taskId) {
        taskManager.release(taskId);
    }

}
