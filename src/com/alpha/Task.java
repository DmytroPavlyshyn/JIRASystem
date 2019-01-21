package com.alpha;

import com.alpha.state.*;

public class Task {
    String name;
    State currentState;

    public Task(String name) {
        this.name = name;
        this.currentState = new Opened(this);
    }
    void changeState(String method) {
        switch (method) {
            case "toOpened":
                currentState.toOpened();
                break;
            case "toInProgress":
                currentState.toInProgress();
                break;
            case "toResolved":
                currentState.toResolved();
                break;
            case "toClosed":
                currentState.toClosed();
                break;
            case "toReopened":
                currentState.toReopened();
                break;
            default:
                throw new RuntimeException("Incorrect input");
        }
    }
    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", currentState=" + currentState +
                '}';
    }
}
