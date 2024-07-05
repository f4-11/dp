package com.test.dp.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

// 利用枚举自身的性质
public enum IdGenerater4 {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
