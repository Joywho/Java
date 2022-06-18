package sort;

public class BubbleSort {
    public static void main(String args[]){
        Person persons[] = new Person[3];
        persons[0] = new Person("a", 2, "javaEE");
        persons[1] = new Person("b", 1, "javaweb");
        persons[2] = new Person("c", 5, "javaproject");
        System.out.println(persons.length);
        //排序前----
        System.out.println("排序前---");
        for(int i = 0;i < persons.length;i++){
            System.out.println(persons[i]);
        }
        Person temp = null;
        //排序后----
        for(int i = 0;i < persons.length - 1;i++){
            for(int j = 0;j < persons.length -1;j++){
                if(persons[j].getAge() > persons[j+1].getAge()){
                    temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                }
            }
            
        }
        System.out.println("排序后--");
        for(int j = 0;j < persons.length;j++){
            System.out.println(persons[j]);
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
