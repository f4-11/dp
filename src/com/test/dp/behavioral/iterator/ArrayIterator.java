//package com.test.dp.behavioral.iterator;
//
//
//public class ArrayIterator<E> implements Iterator {
//    private int cursor;
//    private ArrayList<E> arrayList;
//
//    public ArrayIterator(ArrayList<E> arrayList) {
//        this.cursor = 0;
//        this.arrayList = arrayList;
//    }
//
//    @Override
//    public boolean hasNext() {
//        return cursor != arrayList.size();
//    }
//
//    @Override
//    public void next() {
//        cursor++;
//    }
//
//    @Override
//    public E currentElement() {
//        if (cursor >= arrayList.size()) {
//            throw new NoSuchElementException();
//        }
//        return arrayList.get(cursor);
//    }
//}
