package Conditional;

import java.util.Scanner;

public class PositiveNeg {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        if(number>0) System.out.print("Number Is Positive");
        else if(number<0) System.out.println("Number Is Negative");
        else System.out.print("It Is Zero/Other Formate");

    }
  
}
