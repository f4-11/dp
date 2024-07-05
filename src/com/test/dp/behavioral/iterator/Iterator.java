package com.test.dp.behavioral.iterator;

public interface Iterator<E> {
    boolean hasNext();
    void next();
    E currentElement();
} // 这种实现方式更加灵活，所以这里使用这种
//public interface Iterator<E> {
//    boolean hasNext();
//    E next();
//}