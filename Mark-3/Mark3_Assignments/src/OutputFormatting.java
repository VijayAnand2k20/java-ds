/*
 * 

Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

Sample:
java 100
cpp 65
python 50

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample:
================================
java           100 
cpp            065 
python         050 
================================
 
 * 
 */
import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.print("".format("%-10s", s1));
                if (x < 100 && x>9) {
                    System.out.print("0");
                }
                else if (x < 10) {
                    System.out.print("00");
                }
                System.out.println(x);
            }
            System.out.println("================================");
    }
}
