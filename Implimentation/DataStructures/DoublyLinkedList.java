package Implimentation.DataStructures;

/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {
    private Node head = null;
    public int size = 0;

    private class Node {
        private int data;
        private Node next = null;
        private Node previous = null;
        // constructors

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }
    };

    public boolean add(int data) {
        if (this.head == null) {
            this.head = new Node(data,null,head);
        } else {
            Node tmp = head;
            while (tmp.next != null)
                tmp = tmp.next;
            tmp.next = new Node(data,null,tmp);
        }
        this.size++;
        return true;
    }

    public boolean add(int data, int index) {
        if (index > this.size - 1)
            return false;
        if (head == null)
            head = new Node(data);
        else {
            Node tmp = head;
            while (index != 0) {
                tmp = tmp.next;
                index--;
            }
            tmp.next = new Node(data, tmp.next,tmp);
            tmp=tmp.next;
            // make next node's previous point to this node
            tmp.next.previous = tmp; 
        }
        this.size++;
        return true;
    }

    public boolean remove(int data){
        if(!this.contains(data)) return false;
        this.head = remove(this.head, data);
        this.size--;
        return true;
    }

    private Node remove(Node head2, int data) {
        Node node = head2;

        if(node.data==data) return node.next;
        node.next = remove(node.next, data);
        return node; 

    }

    public boolean contains(int data) {
        return contains(this.head,data);
    }

    private boolean contains(Node head2, int data) {
        if(head2==null) return false;
        if(head2.data==data) return true;
        return contains(head2.next, data);
    }

}