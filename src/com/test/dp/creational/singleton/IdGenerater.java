package com.test.dp.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

// 饿汉式
public class IdGenerater {
    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerater instance = new IdGenerater();

    private IdGenerater() {}
    public static IdGenerater getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}

// 解决资源竞争问题可以使用 类级别的锁， 分布式锁， 并发队列， 最简单的当然是单例模式
// 缺点：
// 隐藏类之间依赖关系， 影响拓展性（假如一天我不想只有一个单例）， 测试困难， 构造函数没有参数

// 添加参数方法
// 1. 使用一个public的init函数接受参数再调用构造函数
// 2. 放进getInstance 但是只能赋值一次
// 3. 参数放进
// public class Config {
//    public static final int param;
//}

// 保证全局唯一除了单例模式 也可以使用
// 静态方法/工厂方法/di容器

// 单例类 一个类对应一个对象，进程唯一
// 我们可以使用一个concurrentmap制作 线程唯一的单例模式
// 使用 集群唯一的单例模式 需要使用分布式锁

// 多例模式 类似枚举类  和工厂模式的区别：多例模式是一个类的多个对象，工厂模式是多个类的对象
// 创建有限多个对象，使用map来映射no和instances，根据no选择实例