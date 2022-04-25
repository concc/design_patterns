package cn.edu.hbuas.scene.task.state;

import cn.edu.hbuas.scene.task.*;

public class TaskOngoing extends Subject implements State {


    private TaskManager taskManager;

    @Override
    public void update(Task task, ActionType actionType) {
        if (actionType == ActionType.ACHIEVE) {
            task.setState(new TaskFinished());
            // 通知
            System.out.println("通知服务--------------------");
            notifyObserver(task.getTaskId());
            taskManager.release(task.getTaskId());
        } else if (actionType == ActionType.STOP) {
            task.setState(new TaskPaused());
        } else if (actionType == ActionType.EXPIRE) {
            task.setState(new TaskExpired());
        }
    }
}
