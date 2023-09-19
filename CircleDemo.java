import java.util.Scanner;

public class CircleDemo {
    
    public static void main(String[] args) {
        float r,area;
        final float pi=3.14f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Circle");
        r=sc.nextFloat();
        area=pi*r*r;
        System.out.println("Area of circle is: "+area);
    }
    
}
