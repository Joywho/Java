package method;

public class showinfo {
    public static void main(String args[]){
        Teacher teacher = new Teacher("a",12,"qw",2000);
        teacher.introduce();
        Professor perfessor = new Professor("b",12,"qw",2000);
        perfessor.introduce();
    }
    
}
class Teacher {
    String name;
    int age;
    String post;
    double salary;
    public Teacher() {
        
    }
    public Teacher(String name,int age,String post,double salary){
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }
    public void introduce(){
        System.out.println(name+age+post+salary);
    }
}
class Professor extends Teacher {
    public Professor(String name,int age,String post,double salary){
        super(name, age, post, salary);
    }
        

    @Override
    public void introduce(){
        System.out.println(name+age+post+salary*1.3);
    }

}
