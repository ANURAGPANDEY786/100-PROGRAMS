package Loops;

public class Productfactorial {
        public static void main(String[] args) {
        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;              //factorial || product of n natural numbers
        }

        System.out.println("Factorial of " + n + " = " + fact);
    }    
}
