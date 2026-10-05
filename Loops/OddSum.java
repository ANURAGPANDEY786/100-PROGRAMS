package Loops;

import java.util.Scanner;

public class OddSum {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.(n) : ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){

            sum=sum+i;
            System.out.println(i);
            }
        }
        System.out.println("Total Sum :" + sum);
        int fSum=n*n; //if total number of  odd element are given first n positive
        System.out.println(fSum);
    }
    
}
