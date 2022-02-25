package com.Recursion;
import java.util.*;

    /* we can implement it by two ways
      1. Array
      2. Linkedlist.
     */

    public class CustomQueue {
    public int[] data;
    protected static final int default_size = 10;

    int end = -1;
    public CustomQueue(){
        this(default_size);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    // condition when the queue will be full.
    public boolean isFull(){
        return end == data.length-1;
    }

    // condition when queue will be empty.
    public boolean isEmpty(){
        return end == -1;
    }

    // condition when queue will be full.
    public boolean push(int item){
        if(isFull()){
            System.out.println("queue is full");
            return false;
        }
        end++;
        data[end] = item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        int removed = data[0];
        // after removal there will be shifting takes place towards left.
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[0];
    }
}
