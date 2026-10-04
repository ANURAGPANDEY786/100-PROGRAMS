package Conditional;

public class CharacterSym {
    
    public static void main(String[] args) {
        char ch = '@';  // test character

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an Uppercase Alphabet");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Lowercase Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch + " is a Special Symbol");
        }
    }
}


