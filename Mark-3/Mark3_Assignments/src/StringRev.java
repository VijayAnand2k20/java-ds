import java.util.Scanner;
import java.util.Vector;

public class StringRev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next(), reverse="";
        for (int i=input.length()-1 ; i>=0 ; i--) {
            reverse += input.charAt(i);
        }
        System.out.println("The reverse of '" + input + " is " + reverse);        
    }
}
