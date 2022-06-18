package CodeBlock;

public class codeBlock {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.a1);
        System.out.println(a.a1);
        
    }
}
class A extends B{
    public static int a1 = 123;
    static{
        System.out.println("A代码块被执行");
    }
    {
        System.out.println("普通A代码块被执行");
    }
}
class B{
    static{
        System.out.println("B代码块被执行");

    }
}
