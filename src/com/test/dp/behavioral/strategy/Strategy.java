package com.test.dp.behavioral.strategy;

public interface Strategy {
    public void algorithmInterface();
}
// 然后实现几个具体的stragety类 public class ConcreteStrategyA...
// 使用StrategyFactory创建一个hashmap按string映射具体方法类的实例/按照类型动态的选择具体的方法类现场创建对象，将判断逻辑转移到工厂类中
// 将条件中的每一种情况抽象为一个类型
