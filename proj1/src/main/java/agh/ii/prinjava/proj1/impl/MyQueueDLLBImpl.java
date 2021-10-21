package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems = new DLinkList<>();

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
        if (!elems.isEmpty()){
            return elems.removeLast();
        }

        throw new RuntimeException("null");
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
    public E peek(){
        if (!isEmpty()){
            return elems.getLast();
        }
        throw new RuntimeException("null");
    }

    /**
     *
     * @return queue string
     */
    @Override
    public String toString(){
        return "Queue{" + elems.toString() + "}";
    }
}
