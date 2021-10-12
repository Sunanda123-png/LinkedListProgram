package com.bridgelabz;

/**
 * Author:-Sunanda Shil
 * Date:-12/10/21
 * @param <T>
 */

public class MyNode<T> implements INode<T> {
    private INode<T> next;
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
    public INode<T> getNext() {
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

    @Override
    public T getdata() {
        return data;
    }

    @Override
    public void setdata(T data) {
        this.data=data;
    }

    @Override
    public INode getnext() {
        return next;
    }

    @Override
    public void setnext(INode next) {
        this.next = (INode<T>)next;

    }
}
