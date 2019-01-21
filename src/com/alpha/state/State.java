package com.alpha.state;

import com.alpha.Task;

public abstract class State implements ChangeState {
    Task task;

    public State(Task task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
