package Implimentation.DataStructures;

public class Stack {
    Node top = null;

    public boolean push(int data){
        top = new Node(data, top);
        return true;
    }

    public int pop(){
        
        Node node = this.top;
        // if no data in stack return min_value for showing error
        if(node==null) return Integer.MIN_VALUE;

        this.top = top.next;
        return node.data;
    }

    public boolean empty(){
        return (this.top==null);
    }

    public int peek(){
        return (this.top!=null)?this.top.data:Integer.MIN_VALUE;
    }

    public int search(int data){
        return search(this.top,data,0);
    }


    private int search(Node top2, int data, int index) {
        if(top2==null) return -1;
        if(top2.data==data) return index;
        return search(top2.next, data, index + 1);
    }


    class Node{
        int data;
        Node next;

        public Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
    }
}
