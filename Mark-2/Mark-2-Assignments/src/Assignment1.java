import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your fullname: ");
        String name = sc.nextLine();
        System.out.println("Hello, Mr." + name + "!");
    }
}
