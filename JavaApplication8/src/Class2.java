import java.util.Scanner;
public class Class2 {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    int a;
    int b;
    int max;
    int min;
    
    System.out.println("enter the value of a");
    a=sc.nextInt();
    
      System.out.println("enter the value of b");
      b=sc.nextInt();
    max=a;
    if(max>b)
    {
    System.out.println("maximum number is a\t"+a);
   
    }
    else
    {
    System.out.println("the minimum is\t"+b);
    }
    
    
    }
}
