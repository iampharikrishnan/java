import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Test {


    public Test() {
        
    }
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Testing");
        // String []s={"dd","55"};
        HashMap<String,String> hm=new HashMap<>();
        
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.addAll(ll);
        ll1.add("e");
        System.out.println(ll);
        System.out.println(ll1);
    }

    
}
