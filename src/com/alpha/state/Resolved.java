package com.alpha.state;

import com.alpha.Task;

public class Resolved extends State {
    public Resolved(Task task) {
        super(task);
    }

    @Override
    public void toOpened() {
        throw new RuntimeException("Incorrect method");
    }

    @Override
    public void toInProgress() {
        throw new RuntimeException("Incorrect method");
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
        task.setCurrentState(new Reopened(task));

    }
}
