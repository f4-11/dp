package com.test.dp.structural.adapter;

// 对象适配器
public class Adaptor2 implements Itarget {
    private Adaptee adaptee;

    public Adaptor2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void f1() {
        adaptee.fa();
    }
    public void f2() {}
    public void fc() {
        adaptee.fc();
    }
}
