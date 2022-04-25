package cn.edu.hbuas.scene.task.state;

import cn.edu.hbuas.scene.task.ActionType;
import cn.edu.hbuas.scene.task.State;
import cn.edu.hbuas.scene.task.Task;

public class TaskPaused implements State {

    @Override
    public void update(Task task, ActionType actionType) {
        if (actionType == ActionType.START) {
            task.setState(new TaskOngoing());
        } else if (actionType == ActionType.EXPIRE) {
            task.setState(new TaskExpired());
        }
    }
}
