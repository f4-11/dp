package com.test.dp.structural.adapter;

// 类适配器
public class Adaptor1 extends Adaptee implements Itarget {
    @Override
    public void f1() {
        super.fa();
    }
    public void f2() {}
}
