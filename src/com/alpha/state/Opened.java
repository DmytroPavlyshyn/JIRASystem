package com.alpha.state;

import com.alpha.Task;

public class Opened extends State {
    public Opened(Task task) {
        super(task);
    }

    @Override
    public void toOpened() {
        throw new RuntimeException("Incorrect method");
    }

    @Override
    public void toInProgress() {
        task.setCurrentState(new InProgress(task));
    }

    @Override
    public void toResolved() {
        throw new RuntimeException("Incorrect method");
    }

    @Override
    public void toClosed() {
        task.setCurrentState(new Closed(task));
    }

    @Override
    public void toReopened() {
        throw new RuntimeException("Incorrect method");

    }
}
