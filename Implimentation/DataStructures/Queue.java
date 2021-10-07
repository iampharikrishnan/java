package Implimentation.DataStructures;

public class Queue {
    Node front = null;
    Node rear = null;

    public boolean offer(int data){
        if(front==null){
            front = new Node(data);
            rear = front;
        }
        else{
            front = new Node(data,front);
            front.next.previous = front;
        }
        return true;
    }

    public int pole(){
        if(rear==null) return Integer.MIN_VALUE;
        Node node = rear;
        rear = rear.previous;
        rear.next = null;
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
