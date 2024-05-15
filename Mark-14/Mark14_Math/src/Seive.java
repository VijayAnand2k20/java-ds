// import java.util.Arrays;

public class Seive {
    public static void main(String[] args) {
        int n = 100010254;
        boolean[] primes = new boolean[n + 1];
        seive(n, primes);
        // System.out.println(Arrays.toString(primes));
    }

    // false in arr => num is prime
    static void seive(int n, boolean[] primes) {
        if (n <= 1) {
            System.out.println(true);
        }
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        System.out.println(primes[n]);
        // for (int i = 2; i <= n; i++) {
        // if (!primes[i]) {
        // System.out.print(i + " ");
        // }
        // }
    }
}
