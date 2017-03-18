import java.util.Scanner;
public class Class4 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
    //area = 2*pi*r
    //circumference =2*pi*r*r
    
    double area;
    double cir;
    double pi=3.14;
    double r;
    //input radius
    System.out.println("enter the value of radius=");
    r=sc.nextDouble();
    //for area
    area=2*pi*r;
    System.out.println("the AREA is=\t"+area);
    //for circumference
    cir=2*pi*r*r;
    
    System.out.println("\nthe CIRCUMFERENCE is=\t"+cir);

    
    }
    
}
