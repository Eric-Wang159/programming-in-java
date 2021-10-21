package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems;

    /**
     *
     * @return the deleted element
     */
    @Override
    public E pop() {
        if (elems.isEmpty()){
            return elems.removeLast();
        }
        throw new IllegalStateException("null");
    }

    /**
     *
     * @param x
     * push element at the end of the list
     */
    @Override
    public void push(E x) {
        elems.addLast(x);
    }

    /**
     *
     * @return integer, number of elements
     */
    @Override
    public int numOfElems() {
        return elems.numOfElems();
    }

    /**
     *
     * @return first element of the list
     */
    @Override
    public E peek() {
        return elems.peek();
    }
}
