import java.util.Scanner;
//To use scanner
public class Main
{
    public static class LinkedList
    {
        Node head;
        
        LinkedList(){
            head = null;
        }
        
        static class Node{
            int data;
            Node next;
            
            Node(int d){
                data = d;
                next = null;
            }
        }
        
        public LinkedList insert(LinkedList list, int d){
            Node newNode = new Node(d);
            Node currNode = list.head;
            
            if(currNode==null){
                list.head = newNode;
            }
            else{
                while(currNode.next!=null){
                    currNode = currNode.next;
                }
                currNode.next = newNode;
            }
            return list;
        }
        
        public LinkedList deleteAtPos(LinkedList list, int pos){
            if(pos == 0){
                list.head = list.head.next;
            }
            else{
                Node currNode = list.head;
                for(int i=0;i<pos-1;i++){
                    currNode = currNode.next;
                }
                currNode.next = currNode.next.next;
            }
            return list;
        }
        
        public void printList(LinkedList list){
            Node currNode = list.head;
            while(currNode!=null){
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
    	
        int n = sc.nextInt();
        while(n>0){
            n--;
            int data = sc.nextInt();
            list.insert(list,data);
        }
        
        int pos = sc.nextInt();
    	list.deleteAtPos(list,pos);
    	
    	list.printList(list);
        sc.close();
    }
}