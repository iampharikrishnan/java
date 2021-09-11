package Leetcode.Week1;

import java.util.PriorityQueue;
import java.util.Comparator;

/**
 * Example for custom comparator
 * 
 * Printing student data in descending order of their marks using priority queue
 */
public class ChangePriority {
    public static void main(String[] args) {
        PriorityQueue<MarkList> s=new PriorityQueue<>(new MarkComparetor());
        s.offer(new MarkList(10,"Antony"));
        s.offer(new MarkList(5,"Siri"));
        s.offer(new MarkList(20,"jarvis"));
        s.offer(new MarkList(7,"Uri"));
        while(!s.isEmpty()){
            MarkList k=s.poll();
            System.out.println(k.mark+" "+ k.student_name);
        }
        
        
    }

}

// class MarkList implements Comparable{
//     int mark;
//     String student_name;
//     public MarkList(int mark, String student_name) {
//         this.mark = mark;
//         this.student_name = student_name;
//     }
//     @Override
//     public int compareTo(Object o) {
//         //  Auto-generated method stub
        
//         if(o.equals(this))
//             return 0;
//         return +1;
//     }
// }

class MarkList {
    int mark;
    String student_name;
    public MarkList(int mark, String student_name) {
        this.mark = mark;
        this.student_name = student_name;
    }
   
}

class MarkComparetor implements Comparator<MarkList> {
    @Override
    public int compare(MarkList s1, MarkList s2){
        if(s1.mark==s2.mark)
            return 0;
        else if(s1.mark>s2.mark)
            return -1;
        else
            return +1;

    }
}
