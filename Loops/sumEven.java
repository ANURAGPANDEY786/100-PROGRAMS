package Loops;

import java.util.Scanner;

public class sumEven {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.(n) : ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){

            sum=sum+i;
            System.out.println(i);
            }
        }
        System.out.println("Total Sum :" + sum);
        int fSum=n*(n+1); //if total number of  even element are given first n positive
        System.out.println(fSum);
    }

    
}
