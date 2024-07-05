package com.test.dp.behavioral.chainofresponsibility;

import com.sun.net.httpserver.Request;

public class HandlerA extends Handler {
    @Override
    public boolean doHandle() {
        boolean handled = false;
        return handled;
    }
}
