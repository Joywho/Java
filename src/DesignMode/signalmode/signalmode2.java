package DesignMode.signalmode;
//懒汉式
public class signalmode2 {   
    public static void main(String args[]){
        Cat instance = Cat.getInstance();
        System.out.println(instance);
    }
}
class Cat{
    private String name;
    private static Cat cat;
    private Cat(String name){
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static Cat getInstance(){
        if(cat == null){
        cat = new Cat("small cat");
        }
        return cat;
    }
    @Override
    public String toString() {
        return "name= "+name;
    }
}
