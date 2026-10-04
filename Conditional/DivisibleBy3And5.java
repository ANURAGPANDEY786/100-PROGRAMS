package Conditional;

import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int number=sc.nextInt();
        if(number%3==0 && number%5==0) System.out.println("Number is divisible by 3&5");
        else System.out.println("Not divisible");
    }
    
}
