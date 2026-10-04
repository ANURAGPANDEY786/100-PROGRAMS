package Loops;

import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.(n) : ");
        int n=sc.nextInt();
        int sum=(n*(n+1))/2;
        // for(int i=1;i<=n;i++){
        //     System.out.println(i);
        //     sum+=i;
        // }
         System.out.println(sum);
    }
}
    
