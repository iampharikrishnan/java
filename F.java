import java.util.*;


public class F
{
    public static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    public static class LinkedList
    {
        Node head;
        
        LinkedList(){
            head = null;
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
        
        public LinkedList insertAtPos(LinkedList list, int data, int pos){
            
            Node newNode = new Node(data);
            
            if(pos == 0){
                newNode.next = list.head;
                list.head = newNode;
            }
            else{
                Node currNode = list.head;
                for(int i=0;i<pos-1;i++){
                    currNode = currNode.next;
                }
                newNode.next = currNode.next;
                currNode.next = newNode;
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
       // Pair<Integer,Integer> p=new Pair<Integer,Integer>();
		
		int n = sc.nextInt();
		LinkedList list = new LinkedList();
		
		for(int i=0;i<n;i++){
		    int data = sc.nextInt();
		    list = list.insert(list,data);
		}
		
		int data = sc.nextInt(), pos = sc.nextInt();
		list = list.insertAtPos(list,data,pos);
		list.printList(list);
	}
}

