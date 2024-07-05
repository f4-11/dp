package com.test.dp.behavioral.chainofresponsibility;

import com.sun.net.httpserver.Request;

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        boolean handled = doHandle();
        if (successor != null && !handled) {
            successor.handle();
        }
    }
    public abstract boolean doHandle();
}
