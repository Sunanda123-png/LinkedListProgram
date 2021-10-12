package com.bridgelabz;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode){
        if(this.head==null){
            this.head=newNode;
        }
        if(this.tail==null){
            this.tail=newNode;
        }
        else{
            INode tempNode=this.head;
            this.head=newNode;
            this.head.setnext(tempNode);
        }
    }
}
