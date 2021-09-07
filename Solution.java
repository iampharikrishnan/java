import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        int n=sn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sn.nextInt();
        System.out.println(uniqueOccurrences(arr));
        sn.close();
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i: arr){
            int count=hm.getOrDefault(i,0); 
            hm.put(i,count+1);
        }
        for(HashMap.Entry<Integer,Integer> v:hm.entrySet()){
            Integer k=v.getValue();
            hm.replace(v.getKey(),null);
            if(hm.containsValue(k)){
                return false;
            }
        }
        return true;
    }
}