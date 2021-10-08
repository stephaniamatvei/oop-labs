package com.oop.excersise.labtwo.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Queue<T> {
    private Integer size;
    private final Integer maxSize;
    private final List<T> queue;

    public Queue() {
        this.size = 0;
        this.maxSize = Integer.MAX_VALUE;
        this.queue = new ArrayList<>();
    }

    public Queue(Integer maxSize) {
        this.size = 0;
        this.maxSize = maxSize;
        this.queue = new ArrayList<>();
    }

    public void push(T value) {
        if (size < maxSize) {
            this.queue.add(value);
            this.size++;
        } else {
            System.out.println("The queue is full");
        }
    }

    public T pop() {
        if (size == 0) {
            System.out.println("The queue is empty");
            return null;
        } else {
            this.size--;
            T value = queue.get(size);
            queue.remove(this.size);
            return value;
        }
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public Boolean isFull() {
        return Objects.equals(size, maxSize);
    }

    @Override
    public String toString() {
        return "Queue: " + queue;
    }

}