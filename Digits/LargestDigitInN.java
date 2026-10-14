package Digits;

public class LargestDigitInN {
    public static void main(String[] args) {
        int n=45689;
        int largest=0;
        while(n>0){
           int curLargest=n%10;
            largest=Math.max(largest,curLargest);
            n=n/10;


        }
        System.out.println(largest);
    }
    
}
