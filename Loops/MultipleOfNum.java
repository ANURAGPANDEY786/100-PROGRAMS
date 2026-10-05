package Loops;

import java.util.Scanner;

public class MultipleOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter M : ");
        int m=sc.nextInt();
        System.out.print("Enter N : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++ ){
            int multiple=m*i;
            System.out.println(multiple); //multiple up to n term means no of n multiple
            //if(i%m==0) System.out.println(i);
        }
    }
    
}
