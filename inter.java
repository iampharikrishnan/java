

interface test32{

}

interface test12 extends test32{
    void p();
    int getMe(String m);
}

interface test13 extends test32{
    int testMe();
}

class interf implements test12, test13{

    @Override
    public void p() {
        // TODO Auto-generated method stub
        System.out.println("x");
        
    }

    @Override
    public int getMe(String m) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int testMe() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
class test31 extends interf{

    @Override
    public void p() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getMe(String m) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
public class inter{
    public static void main(String[] args) {
        interf in = new interf();
        in.p();
    }
}