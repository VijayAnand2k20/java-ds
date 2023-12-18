import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String fruit = in.next();
        in.close();
        // if(fruit.equals("Mango")) {
            // System.out.println("King of fruits");
        // }
        // if(fruit.equals("Apple")) {
            // System.out.println("A red fruit");
        // }

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A red fruit");
                break;
            case "Grapes":
                System.out.println("Bunchy fruit");
                break;
            case "Dragon":
                System.out.println("A red fruit");
                break;
            default:
                System.out.println("New Fruit");
                break;
        }

        // Alterate way
        switch (fruit) {
            case "Mango" -> {
                System.out.println("King of fruits");
            }
            case "Apple", "Dragon" -> System.out.println("A red fruit");
            case "Grapes" -> System.out.println("Bunchy fruit");
            default -> System.out.println("New Fruit");
        }

        // Example case where you'd not need break statement in every case
        int day = 3;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday!");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                break;
        }

        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekday!");
            case 6,7 -> System.out.println("Weekend");
        }
        
    }
}
