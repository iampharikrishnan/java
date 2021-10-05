public class Override {
    public static void main(String[] args) {
        P parent=new C();
        parent.example();
        // parent.getc();
    }
}
class P{
    int pa;

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }
    public void example(){
        System.out.println("Parent");
    }
}
class C extends P{
    int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void example(){
        System.out.println("Child");
    }
}
