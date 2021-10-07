package Implimentation.DataStructures;

public class Deque {
    Node front = null;
    Node rear = null;

    public boolean offer(int data){
        if(front==null){
            front = new Node(data);
            rear = front;
        }
        else{
            Node node = front;
            front = new Node(data,node);
            front.next.previous = front;
        }
        return true;
    }

    public boolean insertRear(int data){
        if(rear==null){
            front = new Node(data);
            rear = front;
        }
        else{
            Node node = rear;
            rear = new Node(data,node);
            rear.previous.next = rear;
        }
        return true;
    }

    public int pole(){
        if(rear==null) return Integer.MIN_VALUE;
        Node node = rear;
        rear = rear.previous;
        rear.next=null;
        return node.data; 
    }

    public int pop(){
        if(front==null) return Integer.MIN_VALUE;
        Node node = front;
        front = front.next;
        front.previous = null;
        return node.data; 
    }

    public int peek(){
        if(rear==null) return Integer.MIN_VALUE;
        return rear.data;
    }

    public boolean empty(){
        return (rear==null);
    }
    
    class Node{
        int data;
        Node next = null;
        Node previous = null;

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
