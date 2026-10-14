package Digits;

public class OddEvenDigitCount {
    public static void main(String[] args) {
        int a=45832;
        int even=0;
        int odd=0;
        while(a>0){
            int num=a%10;
            if(num%2==0) even++;
            else odd++;
            a=a/10;
        }
        System.out.println("Even digits : "+even);
         System.out.println("Odd digits : "+odd);

    }
    
    
}
