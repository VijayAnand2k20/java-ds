import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Principal:");
        float principal = sc.nextFloat();
        System.out.print("Enter the value of Time:"); 
        float time = sc.nextFloat();
        System.out.print("Enter the value of rate of interest:");
        float rate = sc.nextFloat();
        System.out.println("The Simple interest is " + (principal * time * rate)/100);
    }    
}