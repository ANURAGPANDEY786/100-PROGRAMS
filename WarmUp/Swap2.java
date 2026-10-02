package WarmUp;

public class Swap2 {
    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print(a +" " +b);
        
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
    }
    
}
