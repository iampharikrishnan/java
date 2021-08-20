import java.util.Scanner;

public class Pow {
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        double t=scan.nextDouble();
        for (int i=0; i<t; i++)
        {
            double x=scan.nextDouble();
            double n=scan.nextDouble();
            System.out.printf("%0.2f",pow(x,n));
        }
        scan.close();
        }
    
    static double pow(double x,double n)
    {
        if (n==0)
            return 1;
        else if (n==1)
            return x;
        else 
            return (x*pow(x,n-1));
    }
    
}
