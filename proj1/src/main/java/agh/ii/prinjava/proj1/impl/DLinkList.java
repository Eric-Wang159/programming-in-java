package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    // ...
    private Node<E> first;

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

        if (isEmpty()){
            first.elem = elem;
            first.next = null;
            first.prev = null;
        }

        else{
            Node<E> newNode = new Node<E>();
            newNode.next = first;
            first.prev = newNode;
            newNode.elem = elem;
            first = newNode;
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
            Node<E> temp = first;

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

    public Node removeFirst(){

        Node<E> delete = first;
        if(!isEmpty() || first.next==null) {

            first = null;
            return delete;
        }
        first = first.next;
        first.prev = null;
        return delete;

    }

    /**
     *
     * @return node
     * delete last node
     * return node we delete
     */

    public Node removeLast(){

        Node<E> delete = first;
        if(!isEmpty() || first.next==null) {

            first = null;
            return delete;
        }


        while(delete.next !=null){
            delete = delete.next;
        }

        Node<E> temp = delete.prev;
        temp.next=null;

        return delete;

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

        while(temp.next != null){
            stringnode += temp.elem + " / ";
            temp = temp.next;
        }
        return stringnode + " }";
    }
}
