import java.util.*;

public class LL
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
        
    }
    
    public static boolean compare(LinkedList listOne,LinkedList listTwo){
        Node currNode1 = listOne.head;
        Node currNode2 = listTwo.head;
        
        while(currNode1!=null && currNode2!=null){
            if(currNode1.data!=currNode2.data){
                return false;
            }
            currNode1 = currNode1.next;
            currNode2 = currNode2.next;
        }
        
        if(currNode1!=null || currNode2!=null){
            return false;
        }
        else{
            return true;   
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcases = sc.nextInt();
		
	    for(int t=0;t<testcases;t++){
	        int n = sc.nextInt();
	        LinkedList listOne = new LinkedList();
	        LinkedList listTwo = new LinkedList();
	        
	        for(int i=0;i<n;i++){
	            int data = sc.nextInt();
	            listOne = listOne.insert(listOne,data);
	        }
	        
	        n = sc.nextInt();
	        
	        for(int i=0;i<n;i++){
	            int data = sc.nextInt();
	            listTwo = listTwo.insert(listTwo,data);
	        }
	        
	        boolean ans = compare(listOne,listTwo);
	        if(ans){
	            System.out.println(1);
	        }
	        else{
	            System.out.println(0);
	        }
	    }
        sc.close();
		
	}
}


