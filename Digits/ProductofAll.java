package Digits;

public class ProductofAll {
    public static void main(String[] args) {
    int n=Math.abs(89); //handle negative numbers

    int ans=1;
    while(n>0){
        
        ans*=n%10;
        
        n=n/10;

    }
    System.out.println(ans);
        
    }
    
}
