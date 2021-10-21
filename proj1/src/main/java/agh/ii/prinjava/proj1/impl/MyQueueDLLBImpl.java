package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;

    /**
     *
     * @param x
     * add element at the beginning of the queue
     */
    @Override
    public void enqueue(E x) {
        elems.addFirst(x);
    }

    /**
     *
     * @return
     * remove element at the beginning of the queue
     */
    @Override
    public E dequeue() {
        if (elems.isEmpty()){
            return elems.removeLast();
        }

        throw new IllegalStateException("null");
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
