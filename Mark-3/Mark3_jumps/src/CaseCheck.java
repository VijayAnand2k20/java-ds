import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.println(input.next());
        // System.out.println(input.next().trim().charAt(0));
        char ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("You have given a word in which the first letter is in lowercase");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("You have given a word in which the first letter is in uppercase");
        }
        else {
            System.out.println("You have given a word in which the first character is not in alphabet");
        }

    }    
}
