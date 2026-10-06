package Digits;

public class SumOfDigit {
    public static void main(String[] args) {
    int n=Math.abs(89); //handle negative numbers

    int ans=0;
    while(n>0){
        
        ans+=n%10;
        
        n=n/10;

    }
    System.out.println(ans);
        
    }
    
}
