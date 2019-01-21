package com.alpha.state;

public interface ChangeState {
    void toOpened();

    void toInProgress();

    void toResolved();

    void toClosed();

    void toReopened();
}
