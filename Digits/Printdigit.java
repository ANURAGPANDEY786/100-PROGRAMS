package Digits;

public class Printdigit {
    public static void main(String[] args) {
        int n=0;
        while(n>0){
            int result=n%10;
            System.out.println(result);
            n=n/10;

        }
        if(n==0) System.out.println(0);
    }
    
}
