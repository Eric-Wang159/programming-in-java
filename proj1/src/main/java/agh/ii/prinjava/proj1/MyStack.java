package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/**
 *
 * @param <E>
 */

public interface MyStack<E> {

    /**
     *
     * @return
     * remove first item and return it
     */
    E pop();

    /**
     *
     * @param x
     * add element to the start of the list
     */
    void push(E x);

    /**
     *
     * @return boolean
     * if list null, return true
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
     * @return node, first node of the stack
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
