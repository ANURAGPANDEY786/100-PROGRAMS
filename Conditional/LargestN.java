package Conditional;

public class LargestN {
    public static void main(String[] args) {
        
    
    int a=40;
    int b=40;
    int c=40;
 
    if(a>=b && a>=c){
        System.out.println("a is greater than or equal to b and c");
    }
    else if(b>=a && b>=c){
        System.out.println("b is greater than or equal to a and c");
    }
    
    else{
        System.out.println(" c is greater");
    }


    
}
}
