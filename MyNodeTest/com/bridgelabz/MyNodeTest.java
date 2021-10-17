package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyNodeTest {
    //create linked list for 56,30,70
    @Test
    public void given3NumberPassedInLinkedList(){
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secoundNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        firstNode.setNext(secoundNode);
        secoundNode.setNext(thirdNode);
        boolean result=firstNode.getNext().equals(secoundNode) && secoundNode.getNext().equals(thirdNode);
        assertTrue(result);
    }
    //create linked list to add 70,30,56
    @Test
    public void createLinkedListforAddingNumber(){
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secoundNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(secoundNode);
        myLinkedList.add(thirdNode);
        boolean result=myLinkedList.head.equals(thirdNode) && myLinkedList.head.getnext().equals(secoundNode) &&
                myLinkedList.tail.equals(firstNode);
        assertTrue(result);
    }
    @Test
    public void Append(){
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secoundNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.append(secoundNode);
        myLinkedList.append(thirdNode);
        boolean result=myLinkedList.tail.equals(thirdNode) && myLinkedList.tail.getnext().equals(secoundNode) &&
                myLinkedList.head.equals(firstNode);
        Assert.assertTrue(result);
    }
    @Test
    public void whenAddedToTheLinkedListShouldPassLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(firstNode);
        linkedList.append(thirdNode);
        linkedList.insert(firstNode,secondNode);


        Boolean result = linkedList.head.equals(firstNode) &&
                linkedList.head.getnext().equals(secondNode) &&
                linkedList.tail.equals(thirdNode);

        Assert.assertTrue(result);
    }
}
