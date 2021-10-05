package vjudge.week4;

import java.util.Scanner;

/**
 * Sansa has an array. She wants to find the value obtained by XOR-ing the contiguous subarrays, followed by XOR-ing the values thus obtained. Determine this value.

Example

arr=[3,4,5]

Subarray	Operation	Result
3		None		3
4		None		4
5		None		5
3,4		3 XOR 4		7
4,5		4 XOR 5		1
3,4,5		3 XOR 4 XOR 5	2
Now we take the resultant values and XOR them together:

3 ^ 4 ^ 5 ^ 7 ^ 1 ^ 2 = 6. Return 6.
 */

public class SansaAndXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n= sc.nextInt();
            int []arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans=arr[0];
            for(int i=1;i<n;i++){
                ans ^=arr[i];
            }
            int xor=ans;
            for(int i=1;i<n;i++){
                ans ^=(arr[i]^arr[i-1]);
            }
            ans^=xor;
            System.out.println(ans);
            t--;
        }
        sc.close();

    }
}
