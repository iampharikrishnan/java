import java.math.BigInteger;
import java.util.Scanner;

public class ParentNumber {
    static double digitSum(double digit){
        if(digit<10)
            return digit;
        int sum=0;
        while(digit>0){
            sum += digit%10;
            digit /=10;
        }
        return digitSum(sum);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        BigInteger d = scan.nextBigInteger();
        String digit=d.toString();
        int k = scan.nextInt();
        scan.close();
        double sum=0;
        for(int i=0;i<digit.length() && digit!=" ";i++)
            sum += digit.charAt(i)-'0';
        sum=sum*k;
        System.out.println((int)digitSum(sum));
    }
}
