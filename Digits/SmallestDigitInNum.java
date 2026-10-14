package Digits;

public class SmallestDigitInNum {
    public static void main(String[] args) {
        int a=45832;
        int sml=Integer.MAX_VALUE;
        while(a>0){
            int curSml=a%10;
            sml=Math.min(curSml,sml);
            a=a/10;
        }
        System.out.println(sml);

    }
    
}
