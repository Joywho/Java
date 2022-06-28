package DesignMode.signalmode;
//饿汉式
public class signalmode1 {   
    public static void main(String args[]){
        girlfriend gf = girlfriend.getInstance();
        System.out.println(gf);
        //构造器被调用
        // name=abc;
    }
}
class girlfriend{
    private String name;
    private static girlfriend gf = new girlfriend("abc");
    private girlfriend(String name){
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static girlfriend getInstance(){
        return gf;
    }
    @Override
    public String toString() {
        return "name= "+name;
    }
}