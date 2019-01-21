package com.alpha.state;

import com.alpha.Task;

public class Reopened extends State {

    public Reopened(Task task) {
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
        throw new RuntimeException("Incorrect method");
    }

    @Override
    public void toReopened() {
        throw new RuntimeException("Incorrect method");
    }
}
