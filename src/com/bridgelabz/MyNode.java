package com.bridgelabz;

public class MyNode<T> {
    private MyNode next;
    private T data;
    public void setNext(MyNode next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyNode getNext() {
        return next;
    }

    public T getData() {
        return data;
    }
    public MyNode(T data) {
        this.data=null;
        this.next=null;
    }
}
