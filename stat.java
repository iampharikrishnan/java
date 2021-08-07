import stati.*;

/**
 * stat
 */
  
public class stat {
    static int i = 10;
    public static void main(String[] args) {
        System.out.println(i);
        test t=new test();
        t.setId(10);
        t.id=10;
        pack p = new pack();
    }
}

class test{
    protected int id;
    private String name;
    
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public void setId(int id1){
        this.id = id1;
        init();
    }
    private void init(){
        System.out.println("x");
    }
    public void setName(String Name){
        this.name=Name;
    }
}
