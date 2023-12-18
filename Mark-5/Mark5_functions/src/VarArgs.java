import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,45,6,6);        
    }
    static void fun(int ...args) {
        System.out.println(Arrays.toString(args));
    }
}
