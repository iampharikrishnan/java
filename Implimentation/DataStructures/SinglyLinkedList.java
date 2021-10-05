package Implimentation.DataStructures;
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
        private Node() {      //Though blank its purpose is to force to use the parameterised constructor to be used at object creation time
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
    public boolean add(T data){
        if(this.head==null){
            this.head = new Node<>(data);
        }
        else{
            Node<T> tmp=head;
            while(tmp.next!=null)tmp=tmp.next;
            tmp.next=new Node<>(data);
        }
        return true;
    }
    public boolean add(T data, int index){
        if(head==null){
            if(index!=0)
                return false;
            else{
                head = new Node<>(data);
            }

        }
        Node<T> tmp=head;
        while(index!=0){
            tmp=tmp.next;
            if(tmp==null)
                return false;
        }
        tmp.next=new Node<>(data,tmp.next);
        return true;
    }
    public boolean remove(T data){
        Node<T> tmp=head;
        while(tmp.data!=data)tmp=tmp.next;
        return false;
        
    }

}
