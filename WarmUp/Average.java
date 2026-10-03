package WarmUp;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Marks In Maths :");
        int a=sc.nextInt();
        System.out.print("Enter Marks In Hindi :");
        int b=sc.nextInt();
        System.out.print("Enter Marks In English :");
        int c=sc.nextInt();
        System.out.print("Enter Marks In Computer :");
        int d=sc.nextInt();
        System.out.print("Enter Marks In Science :");
        int e=sc.nextInt();
        System.out.println("Total Marks :" + (a+b+c+d+e) );
        System.out.println("Average Marks :" + ((a+b+c+d+e)/5));
    }
    
}
