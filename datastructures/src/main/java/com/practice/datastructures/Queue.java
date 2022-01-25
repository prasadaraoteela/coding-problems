package com.practice.datastructures;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Prasada Rao on 25/01/22 10:19 AM
 **/
public class Queue<T> implements Iterable<T>{

    private final LinkedList<T> list = new LinkedList<>();

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Queue empty!");
        return list.peekFirst();
    }

    public T poll() {
        if (isEmpty()) throw new RuntimeException("Queue empty!");
        return list.removeFirst();
    }

    public void offer(T data) {
        list.addLast(data);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
