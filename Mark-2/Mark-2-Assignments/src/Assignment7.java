import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.next();
        String reverse="";
        for(int i=input.length() - 1; i>=0 ; i--) {
            reverse += input.charAt(i);
        }
        if (input.contentEquals(reverse)) {
            System.out.println("The given string is a palindrome");
        }
        else {
            System.out.println("The given string is not a palindrome");
        }
    }
}
