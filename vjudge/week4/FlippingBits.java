package vjudge.week4;

import java.util.Scanner;

public class FlippingBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            t--;
            long k=sc.nextLong();
            k^=Long.valueOf(4294967295L);
            System.out.println(k);
        }
        sc.close();
    }
}
