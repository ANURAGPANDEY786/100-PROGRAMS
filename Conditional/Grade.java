package Conditional;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter mark : ");
        int mark=sc.nextInt();
        if(mark>=90) System.out.println("A+  Grade");
        else if(80<=mark && mark<90) System.out.println("A Garade");
        else if(70<=mark && mark<80) System.out.println("B+ Garade");
        else if(60<=mark && mark<70) System.out.println("B Garade");
        else if(50<=mark && mark<60) System.out.println("C Garade");
        else if(40<=mark && mark<50) System.out.println("D Garade");
        else System.out.println("Fail");
    }
    
}
