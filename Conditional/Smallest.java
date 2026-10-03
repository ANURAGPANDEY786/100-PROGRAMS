package Conditional;

public class Smallest {
    public static void main(String[] args) {
        
    
    int a=40;
    int b=50;
    int c=10;
 
    if(a<=b && a<=c){
        System.out.println("a is smaller than or equal to b and c");
    }
    else if(b<=a && b<=c){
        System.out.println("b is smaller than or equal to a and c");
    }
    
    else{
        System.out.println(" c is smaller");
    }

    
}
}
