package Digits;

public class SumOfDigit {
    public static void main(String[] args) {
    int n=Math.abs(8881); //handle negative numbers
    int lastDigit=n%10;
    int firstDigit=0;
    

    while(n>0){
       firstDigit=n%10;
        n=n/10;
   }
    int sum=lastDigit+firstDigit;
    System.out.println(sum);
        
    }
    
}
