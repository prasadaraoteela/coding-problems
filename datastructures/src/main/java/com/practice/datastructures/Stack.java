package com.practice.datastructures;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Prasada Rao on 24/01/22 5:43 PM
 **/
public class Stack<T> implements Iterable<T> {

    private final LinkedList<T> stack = new LinkedList<>();

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(T data) {
        stack.addLast(data);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peekLast();
    }

    @Override
    public Iterator<T> iterator() {
        return stack.iterator();
    }
}
