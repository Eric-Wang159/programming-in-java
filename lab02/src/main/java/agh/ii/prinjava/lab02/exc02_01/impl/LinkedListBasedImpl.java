package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class LinkedListBasedImpl implements StackOfInts {

    @Override
    public int pop() {

        if (numOfElems!=0){
            int a = node.elem;
            node = node.next
            return a;
        }
        throw new IllegalStateException("null");
    }

    @Override
    public void push(int x) {

        if (numOfElems!=0){
            Node node2 = new Node(x);
            node2.next = node;
            node = node2;

        }
        throw new IllegalStateException("null");
    }

    @Override
    public int numOfElems() {

        return numOfElems;
    }

    @Override
    public int peek() {
        if (numOfElems!=0){
            return node.elem;
        }

        throw new IllegalStateException("null");
    }

    private static class Node {
        int elem;
        Node next;

        public Node(int elem) {

            this.elem = elem;
        }
    }

    private int numOfElems = 0;
    private Node node;
}
