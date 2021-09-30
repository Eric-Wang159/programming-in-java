package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class ArrayBasedImpl implements StackOfInts {

    @Override
    public int pop() {
        if (numOfElems!=0) {
            int c = array[0];
            int[] array2 = new int[0];
            for (int i = 0; i < numOfElems; i++) {
                array2[i] = array[i + 1];
            }
            array = array2;
            numOfElems--;
            return c;
        }
        throw new IllegalStateException("null");
    }

    @Override
    public void push(int x) {

        int[] arrayy = new int[0];
        arrayy[0] = x;
        for (int i=0; i<numOfElems; i++){
            arrayy[i+1] = array[i];
        }
        array = arrayy;
    }

    @Override
    public int numOfElems() {
        return numOfElems;
    }

    @Override
    public int peek() {
        if (numOfElems!=0){
            return array[0];
        }
        throw new IllegalStateException("null");
    }

    private int numOfElems = 0;
    private int[] array;

}
