package com.bridgelabz;

/**
 * Author:-Sunanda Shil
 * Date:-12/10/21
 * @param <T>
 */

public class MyNode<T> {
    private MyNode next;
    private T data;
    /**
     * setter method for making private
     * @param next
     */
    public void setNext(MyNode next) {
        this.next = next;
    }
    public void setData(T data) {
        this.data = data;
    }
    /**
     * Getter method for making private
     * @return
     */
    public MyNode getNext() {
        return next;
    }
    public T getData() {
        return data;
    }
    /**
     * Creating Constructor
     * @param data
     */
    public MyNode(T data) {
        this.data=null;
        this.next=null;
    }
}
