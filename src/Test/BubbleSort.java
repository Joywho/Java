package Test;


public class BubbleSort {
    public static void main(String args[]){
        Person persons[] = new Person[3];
        persons[0] = new Person("A", 2, "javaEE");
        persons[1] = new Person("b", 1, "javaweb");
        persons[2] = new Person("c", 5, "javaproject");
        int temp;
        //正常输出
        for(int i = 0; i < persons.length;i++){
            System.out.println(persons[i]);
        }
        //冒泡排序
        for(int i = 0;i < persons.length;i++){
            
        }
    }
}

class Person {
    public String name;
    private int age;
    private String job;
    public Person(String name,int age,String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    @Override
    public String toString() {
        return "Person [age=" + age + ", job=" + job + ", name=" + name + "]";
    }
    
    
}
