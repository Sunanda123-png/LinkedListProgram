package com.bridgelabz;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyNodeTest {
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
}
