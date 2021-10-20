package com.bridgelabz;

public class MyLinkedList<T> {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode){
        if(this.tail==null){
            this.tail=newNode;
        }
        if(this.head==null){
            this.head=newNode;
        }
        else{
            INode tempNode=this.head;
            this.head=newNode;
            this.head.setnext(tempNode);
        }
    }
    public void append(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            INode tempNode = this.tail;
            this.tail = newNode;
            this.tail.setnext(tempNode);
        }
    }
    public void insert(INode myNode, INode newNode) {
        INode tempNode=myNode.getnext();
        myNode.setnext(newNode);
        newNode.setnext(tempNode);
    }
    public INode pop()
    {
        INode tempNode=this.head;
        this.head=head.getnext();
        return  tempNode;
    }
    public void searchMyNode() {
        INode tempNode = head;
        int data= 30;
        int position = 0;
        while (tempNode != null) {
            position++;
            if (tempNode.getdata().equals(data)) {
                System.out.println(position);
            }
            tempNode = tempNode.getnext();
        }
    }
}
