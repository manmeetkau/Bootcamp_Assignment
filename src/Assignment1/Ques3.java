package Assignment1;

import java.util.Scanner;
import java.lang.Math;
class Circle
{
    static double PI=3.141592653589793;
    static double area(double radius)
    {  return PI*radius*radius;}

    static double circumference(double radius)
    { return (2*PI*radius); }
    public static void main(String[] args)
    {
        int option;
        double radius, circum, Area;
        Scanner sc=new Scanner (System.in);
        System.out.println("MENU");
        System.out.println("1.Calculate Area of Circle");
        System.out.println("2.Calculate the circumference of Circle");
        System.out.println("3.Exit");
        System.out.print("Choose an opton (1-3) ");
        option=sc.nextInt();
        switch(option)
        {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                radius=sc.nextDouble();
                Area=area(radius);
                System.out.print("The area of the circle is: "+Area);
                break;
            case 2:
                System.out.print("Enter the radius of the circle: ");
                radius=sc.nextDouble();
                circum=circumference(radius);
                System.out.print("The circumference of the circle is: "+circum);
                break;
            case 3:
                System.out.println("No Solution");
                break;
//default case statement executes when an invalid choice is entered
            default:System.out.println("invalid choice!");
        }
    }
}
