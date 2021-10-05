import java.util.Scanner;

public class Direction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if(a>c){
            if(b>d)
                System.out.println("South West");
            else if(b==d)
                System.out.println("West");
            else
                System.out.println("South East");
        }
        else if(a<c){
            if(b>d)
                System.out.println("North West");
            else if(b==d)
                System.out.println("West");
            else
                System.out.println("North East");
        }
        else{
            if(b>d)
                System.out.println("North");
            else
                System.out.println("South");
        }
        scan.close();
    }
}
