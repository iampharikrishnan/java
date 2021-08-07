public class poli {
    public static void main(String[] args)
    {
        MultiplyFun m = new MultiplyFun();
        
  
        System.out.println(m.Multiply(2, 4));
  
        System.out.println(m.Multiply(5.5, 6.3));
    }
}
class MultiplyFun {
  
    // Method with 2 parameter
     int Multiply(int a, int b)
    {
        return a * b;
    }
  
    // Method with the same name but 2 double parameter
     double Multiply(double a, double b)
    {
        return a * b;
    }
}
class test1 extends MultiplyFun{
    int Multiply(int a, int b)
    {
        return a / b;
    } 
}
  

