package Conditional;

public class CheckCharType {
    
    public static void main(String[] args) {
        char ch = '@';  // test character

        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch + " is a Special Symbol");
        }
    }
}

    

