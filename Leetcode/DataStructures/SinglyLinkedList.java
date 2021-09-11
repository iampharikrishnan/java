package Leetcode.DataStructures;
/**
 * Implimentation of Singly linkedlist 
 */
public class SinglyLinkedList<T> {
    private Node<T> head;
    public Node<T> getHead() {
        return head;
    }
    public void setHead(T data) {
        Node<T> node=new Node<T>(data);
        this.head = node;
    }
    private class Node<T>{
        private T data=null;
        private Node<T> next=null;
        //constructors
        public Node() {      //Though blank its purpose is to force to use the parameterised constructor to be used at object creation time
        }
        public Node(T data) {
            this.data = data;
        }
        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        //getters and setters
        public T getData() { // Generic data returned
            return data;
        }
        public void setData(T data) {
            this.data = data;
        }
        public Node<T> getNext() {
            return next;
        }
        public void setNext(Node<T> next) {
            this.next = next;
        }
        
        
    }
}
