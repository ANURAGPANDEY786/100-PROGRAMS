package Digits;

public class CountDigit {
    public static void main(String[] args) {
        int n=0506750;
        int count=0;
        
        while(n>0){
            
            n=n/10;
            count++;

        }
        if(n==0) count++;
        
        System.out.println(count);


    }
    
}
