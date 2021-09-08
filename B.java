import java.util.*;

public class B
{
    public static class Node{
        public int data;
        public Node next;
        
        public Node(int d){
            data = d;
            next = null;
        }
    }
    
    public static class LinkedList{
        Node head;
        
        public LinkedList(){
            head = null;
        }
        
        public void insert(int d){
            Node newNode = new Node(d);
            Node currNode = this.head;
            
            if(currNode==null){
                this.head = newNode;
            }
            else{
                while(currNode.next!=null){
                    currNode = currNode.next;
                }
                currNode.next = newNode;
            }
            return;
        }
        
        public void printList(){
            Node currNode = this.head;
            while(currNode!=null){
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
        }
        
    }
    
    public static LinkedList mergeLinkedList(LinkedList l1,LinkedList l2){
        Node head1 = l1.head, head2 = l2.head;
        LinkedList sortedList = new LinkedList();
        
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                sortedList.insert(head1.data);
                head1 = head1.next;
            }   
            else{
                sortedList.insert(head2.data);
                head2 = head2.next;
            }
        }
        
        while(head1!=null){
            sortedList.insert(head1.data);
            head1 = head1.next;
        }
        
        while(head2!=null){
            sortedList.insert(head2.data);
            head2 = head2.next;
        }
        
        return sortedList;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcases = sc.nextInt();
		for(int t=0;t<testcases;t++){
		    int n,m;
		    
		    n = sc.nextInt();
		    LinkedList l1 = new LinkedList();
		    for(int i=0;i<n;i++){
		        l1.insert(sc.nextInt());
		    }
		    
		    m = sc.nextInt();
		    LinkedList l2 = new LinkedList();
		    
		    for(int i=0;i<m;i++){
		        l2.insert(sc.nextInt());
 //comment

		    }
		    sc.close();
		    LinkedList sortedList = mergeLinkedList(l1,l2);
		    sortedList.printList();
		    System.out.println();
		}
		
	}
}