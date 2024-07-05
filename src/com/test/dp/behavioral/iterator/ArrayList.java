package com.test.dp.behavioral.iterator;

public class ArrayList<E> implements List<E> {

    @Override
    public Iterator iterator() {
        return new ArrayIterator(this);
    }
}
