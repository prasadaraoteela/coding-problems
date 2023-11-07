package com.practice.datastructures;

/**
 * Created by Prasada Rao on 25/01/22 10:19 AM
 **/
public class QueueUsingArray<T> {

    private T[] array;

    private int capacity = 16;

    private int size = 0;
    private int offerPosition = 0;
    private int pollPosition = 0;

    @SuppressWarnings("unchecked")
    public QueueUsingArray() {
        this.array = (T[]) new Object[this.capacity];
    }

    @SuppressWarnings("unchecked")
    public QueueUsingArray(int initialCapacity) {
        this.capacity = initialCapacity;
        this.array = (T[]) new Object[this.capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Queue empty!");
        return this.array[pollPosition];
    }

    public T poll() {
        if (isEmpty()) throw new RuntimeException("Queue empty!");
        T peek = peek();
        this.array[pollPosition] = null;
        pollPosition++;
        return peek;
    }

    public void offer(T data) {
        this.array[offerPosition++] = data;
        size++;
    }


    @SuppressWarnings("unchecked")
    private void grow() {
        if (size % capacity == capacity - 1) {
            final T[] newArray = (T[]) new Object[(size / capacity) * (capacity + 1)];
            System.arraycopy(this.array, 0, newArray, 0, size);
            this.array = newArray;
        }
    }
}
