package agh.ii.prinjava.lab02.exc02_01;

/**
 * Stack of integers - Abstract Data Type (ADT)
 */



public interface StackOfInts {
    /**
     * remove first item and return it
     */
    int pop();

    /**
     *
     * add element to the start of the list
     */
    void push(int x);

    /**
     *
     * if list null, return true
     */

    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     *
     * return number of element of the list
     */

    int numOfElems();

    /**
     *
     * return value of the first element of the list
     */

    int peek();
}
