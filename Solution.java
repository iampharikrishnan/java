import Implimentation.DataStructures.SinglyLinkedList;

public class Solution {
    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.add(2);
        sl.add(3, 0);
        System.out.println(sl.size());
        for(int i=0;i<sl.size();i++){
            System.out.print(sl.get(i)+" ");
        }
        System.out.println();
        sl.remove(3);
        
        System.out.println(sl.size());
        for(int i=0;i<sl.size();i++){
            System.out.print(sl.get(i)+" ");
        }
    }
}
