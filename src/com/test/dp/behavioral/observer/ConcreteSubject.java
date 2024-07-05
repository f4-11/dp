package com.test.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
// 然后继承observer实现多个类自己的update函数，在收到message时就会执行各自的逻辑了, 这里实现的是同步阻塞的模式,
// 可以在notify项新启动一个线程池实现异步非阻塞的操作，但是代码耦合度高且复用性差
//
// 可以使用eventbus框架来进行简单的实现
// register/remove 相当于 attach/detach
// 跨进程的观察者模式可以采用消息队列来实现