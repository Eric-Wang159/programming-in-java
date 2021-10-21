package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    // ...
    private Node<E> first = new Node<E>();

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;
    }

    /**
     * @return boolean
     * true if list empty
     * false if not
     */

    public boolean isEmpty(){

        return first.elem == null;
    }

    /**
     *
     * @param elem
     * add node at the beginning of the list
     */

    public void addFirst(E elem){

        if (!isEmpty()){

            Node<E> newNode = new Node<>();
            newNode.elem = elem;
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }

        else{
            first.elem = elem;

        }
    }

    /**
     *
     * @param elem
     * add a new node at the end of the list
     */

    public void addLast(E elem){

        if (isEmpty()){
            first.elem = elem;
            first.next = null;
            first.prev = null;
        }

        else{
            Node<E> temp = new Node<E>();
            temp = first;

            while (temp.next != null){
                temp = temp.next;
            }

            Node<E> newNode = new Node<E>();
            newNode.prev = temp;
            temp.next = newNode;
            newNode.elem = elem;

        }
    }

    /**
     *
     * @return node
     * delete first node
     * returns the node we delete
     */

    public E removeFirst(){

        Node<E> delete = first;
        if(isEmpty()) {
            return null;
        }
        else if(first.next==null){
            first = null;
            return delete.elem;
        }
        first = first.next;
        first.prev = null;
        return delete.elem;

    }

    /**
     *
     * @return node
     * delete last node
     * return node we delete
     */

    public E removeLast(){

        Node<E> delete = first;
        if(isEmpty()) {
            return null;
        }

        while(delete.next !=null){
            delete = delete.next;
        }

        Node<E> temp = delete.prev;
        temp.next=null;

        return delete.elem;

    }

    /**
     *
     * @return last element of the list
     */

    public E getLast(){
        Node<E> temp = first;

        while(temp.next != null){
            temp = temp.next;
        }

        return temp.elem;
    }

    /**
     *
     * @return tostring
     * converting node in a string
     */

    @Override
    public String toString() {
        Node<E> temp = first;
        String stringnode = "DLinkList{ ";
        if (!isEmpty()) {
            while (temp != null) {
                stringnode += temp.elem + " ";
                temp = temp.next;
            }
        }
        return stringnode + "}";
    }

    /**
     *
     * @return int, number of elements
     */
    int numOfElems(){
        if(first.elem == null){
            return 0;
        }
        else{
            int counter = 1;
            Node<E> temp = first;
            while(temp.next != null) {
                counter++;
                temp = temp.next;
            }
            return counter;
        }
    }

    /**
     *
     * @return node, first node of the list
     */
    public E peek(){
        if (!isEmpty()){
            return first.elem;
        }
        throw new RuntimeException("null");
    }
}
