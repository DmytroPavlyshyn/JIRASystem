package com.alpha.state;

import com.alpha.Task;

public class Closed extends State {
    public Closed(Task task) {
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
        throw new RuntimeException("Incorrect method");

    }

    @Override
    public void toReopened() {
        throw new RuntimeException("Incorrect method");
    }
}
