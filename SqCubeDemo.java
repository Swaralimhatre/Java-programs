import java.util.Scanner;

public class SqCubeDemo {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter loop Count");
        int num=sc.nextInt();
        
        for(int i=1;i<=num;i++)
        {
            
            if (i%4==0)
            {
            continue;
            }
            System.out.println(i+"Square is "+i*i);
            System.out.println(i+"Cube is "+i*i*i);

        }
    System.out.println("");
        
    }
    
}
