public class Shadowing {
    static int x = 10; // This will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println("Before,x="+x);
        change();
        System.out.println("After,x="+x);
        int x=30;
        System.out.println(x);
    }
    static void change() {
        x=20;
    }
}
