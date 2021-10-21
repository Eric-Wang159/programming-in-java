package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * A queue
 *
 */

public interface MyQueue<E> {
    /**
     * Function to enqueue x
     *
     */
    void enqueue(E x);

    /**
     *
     * Function to dequeue a queue
     */

    E dequeue();

    /**
     * Verifies if there is an element
     *
     */

    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     *
     * @return int, number of elements
     */
    int numOfElems();

    /**
     *
     * @return node, first node of the queue
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {

        return new MyQueueDLLBImpl<>();
    }
}
