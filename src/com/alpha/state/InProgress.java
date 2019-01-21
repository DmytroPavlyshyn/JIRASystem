package com.alpha.state;

import com.alpha.Task;

public class InProgress extends State {
    public InProgress(Task task) {
        super(task);
    }


    @Override
    public void toOpened() {
        task.setCurrentState(new Opened(task));
    }

    @Override
    public void toInProgress() {
        throw new RuntimeException("Incorrect method");

    }

    @Override
    public void toResolved() {
        task.setCurrentState(new Resolved(task));
    }


    @Override
    public void toClosed() {
        throw new RuntimeException("Incorrect method");

    }

    @Override
    public void toReopened() {
        throw new RuntimeException("Incorrect method");

    }
}
