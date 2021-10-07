package Implimentation.DataStructures;

/**
 * Implimentation of Singly linkedlist
 */
public class SinglyLinkedList {
    private Node head = null;
    private int size = 0;

    private class Node {
        private int data;
        private Node next = null;
        // constructors

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    };

    public int size(){
        return this.size;
    }

    public boolean add(int data) {
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            Node tmp = head;
            while (tmp.next != null)
                tmp = tmp.next;
            tmp.next = new Node(data);
        }
        this.size++;
        return true;
    }

    public boolean add(int data, int index) {
        if (index > this.size || index < 0)
            return false;
        if (head == null)
            head = new Node(data);
        else {
            Node tmp = head;
            while (index != 0) {
                tmp = tmp.next;
                index--;
            }
            Node next = tmp.next;
            tmp.next = new Node(data, next);
        }
        this.size++;
        return true;
    }

    public boolean remove(int data) {
        Node tmp = head;
        Node entry = find(tmp, data);
        if (entry == null)
            return false;
        if (tmp == entry)
            head = entry.next;
        else {
            while (tmp.next != entry)
                tmp = tmp.next;
            tmp.next = entry.next;
        }
        this.size--;
        return true;
    }

    public boolean contains(int data) {
        return (find(this.head, data) == null);
    }

    private Node find(Node node, int data) {
        if (node == null || node.data == data)
            return node;
        return find(node.next, data);
    }

    public boolean removeIndex(int index){
        Node tmp = head;
        // Checking index out of bound
        if(this.size<index || index<0) return false;
        if(index==0) head=head.next;
        else{
            while(index!=0){
                tmp=tmp.next;
                index--;
            }
            tmp.next = tmp.next.next;
        }
        this.size--;
        return true;
    }

    public int get(int index){
        Node node = this.head;
        while(node!=null && index!=0){
            node=node.next;
            index--;
        }
        return (node!=null)?node.data:Integer.MIN_VALUE;
    }

}
