package com.test.dp.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

// 懒汉式 延迟加载 但有锁，不并发
public class IdGenerater2 {
    private AtomicLong id2 = new AtomicLong(0);
//    private static IdGenerater2 instance;
// 防止指令重排
    private static volatile IdGenerater2 instance;

    private IdGenerater2() {}

//    public static synchronized IdGenerater2 getInstance() {
//        if (instance == null) {
//            return new IdGenerater2();
//        }
//        return instance;
//    }
// 使用 双重检测 解决并发问题
    public static IdGenerater2 getInstance() {
        if (instance == null) {
            synchronized (IdGenerater2.class) { // 相当于类级别的锁, 传入this时是对象级别的锁，显然在这里并不合适(没什么卵用)
                if (instance == null) {
                    instance = new IdGenerater2();
                }

            }
        }
        return instance;
    }

    public long getId() {
        return id2.incrementAndGet();
    }

}
