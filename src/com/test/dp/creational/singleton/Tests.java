package com.test.dp.creational.singleton;

public class Tests {
    public static void main(String[] args) {
        long id = IdGenerater.getInstance().getId();
        long id2 = IdGenerater2.getInstance().getId();
        long id3 = IdGenerater3.getInstance().getId();
        long id4 = IdGenerater4.INSTANCE.getId();

        System.out.println(id);
        System.out.println(id2);
        System.out.println(id3);
        System.out.println(id4);
    }
}
