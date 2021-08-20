import java.math.BigInteger;
import java.util.Scanner;
public class candies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n = scan.nextBigInteger();
        BigInteger m = scan.nextBigInteger();
        BigInteger a = n.mod(m);
        System.out.println(a.equals(BigInteger.valueOf(0)));
        scan.close();
    }
}
