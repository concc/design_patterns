package cn.edu.hbuas.scene.task;

import cn.edu.hbuas.scene.task.state.TaskInit;

public class Task {
    private long taskId;

    // 初始化为初始态
    private State state = new TaskInit();

    // 更新状态
    public void updateState(ActionType actionType) {
        state.update(this, actionType);
    }

    public Task(long taskId, State state) {
        this.taskId = taskId;
        this.state = state;
    }


    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
