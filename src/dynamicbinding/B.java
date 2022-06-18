package dynamicbinding;

public class B extends A {
    public static void main(String args[]){
        A a = new B();
        a.sum();
    }
    public int i = 20;
    public int sum(){
        return i + 20;
    }
    
}
