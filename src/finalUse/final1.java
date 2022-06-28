package finalUse;

public class final1 {
    public static void main(String args[]){
        System.out.println(new circle(2).coutArea());
        
    }
}
class circle{
    private final  double PI;
    private  double radious;
    {
    }
    public circle(double radious){
        this.radious = radious;
        PI = 3.14;
    }
    public double coutArea(){
        return radious*radious*PI;
    }

}
