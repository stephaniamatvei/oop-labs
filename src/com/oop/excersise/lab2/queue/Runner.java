package com.oop.excersise.labtwo.queue;

public class Runner {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new Queue<>();
        Queue<Integer> queue2 = new Queue<>(3);

        queue1.push(27);
        queue1.push(5);
        queue1.push(19);

        System.out.println(queue1);
        System.out.println("Queue1:\n isEmpty -> " + queue1.isEmpty() + "\n isFull -> " + queue1.isFull());
        System.out.println(queue1.pop());

        System.out.println();

        queue2.push(1);
        queue2.push(2);
        queue2.push(3);

        System.out.println(queue2);
        System.out.println("Queue2:\n isEmpty -> " + queue2.isEmpty() + "\n isFull -> " + queue2.isFull());
        System.out.println(queue2.pop());

    }
}
