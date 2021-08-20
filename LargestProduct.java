import java.util.Scanner;

public class LargestProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        if(b>0){
            if(d>0)
                System.out.println(b*d);
            else
                System.out.println(a*d);
        }
        else{
            if(d>0)
                System.out.println(b*c);
            else
                System.out.println(a*c);
        }
        scan.close();
    }
}
