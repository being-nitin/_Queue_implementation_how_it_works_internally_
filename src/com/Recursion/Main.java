package com.Recursion;

public class Main {

    public static void main(String[] args) throws Exception {
	CustomQueue queue = new CustomQueue();
	queue.push(23);
        queue.push(24);
        queue.push(25);
        queue.push(26);
        queue.push(27);
        System.out.println(queue.remove());
        System.out.println(queue.front());

    }
}
