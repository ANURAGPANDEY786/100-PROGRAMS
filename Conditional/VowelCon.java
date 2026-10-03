package Conditional;

import java.util.Scanner;

public class VowelCon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character :");
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
             System.out.println("It's a vowel");
        }
        else{
            System.out.println("Its not a consonant");
        }
    }
    
}
