package WarmUp;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius :");
        int radius=sc.nextInt();
        double pi=3.14;
        System.out.println("Area of Circle :" + " " + (pi*radius*radius));
        System.out.println("Circumference :" + " " + (2*pi*radius));
        
    }
    
}
