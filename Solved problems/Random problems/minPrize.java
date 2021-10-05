import java.util.Arrays;
import java.util.Scanner;

public class minPrize {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int k = sn.nextInt();
        int []p = new int[n];
        for(int i=0;i<n;i++){
            p[i]=sn.nextInt();
        }
        sn.close();
        Arrays.sort(p);
        int sum = 0;
        for(int i=2;i<k;i++){
            sum+=p[i];
        }
        System.out.println(sum);
    }
}
