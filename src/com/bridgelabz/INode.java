package com.bridgelabz;

public interface INode<T> {
    T getdata();
    void setdata(T data);

    INode getnext();
    void setnext(INode next);
}
