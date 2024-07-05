package com.test.dp.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerater3 {
    private AtomicLong id = new AtomicLong(0);

    private IdGenerater3(){}

    private static class SingletonHolder{ // 使用内部类 -- 由jvm保证 延迟加载 和 并发安全
        private static final IdGenerater3 instance = new IdGenerater3();
    }
    public static IdGenerater3 getInstance(){
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
