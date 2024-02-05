import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1284f;
        // System.out.printf("Formatted number is %.2f", a);
        System.out.printf("%.3f", Math.PI);

        // + operator can only be used withing primitives.
        // If you want to use it for complex objects, atleast one of the operands must be of type String.
        // System.out.println(new Integer(56) + new ArrayList<>());
    }
}
