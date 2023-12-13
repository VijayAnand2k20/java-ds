import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int temp=num, rev=0, digit;
        while(temp!=0) {
            digit = temp%10;
            rev = (rev*10) + digit;
            temp/=10;
        }
        System.out.println("The reverse of " + num + " is " + rev);
        if(rev == num) {
            System.out.println("Fun fact: It is a palindrome!");
        }
    }
}
