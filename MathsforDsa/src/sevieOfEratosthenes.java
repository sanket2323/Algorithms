import java.lang.reflect.Array;
import java.util.Arrays;

public class sevieOfEratosthenes {
    public static void main(String[] args) {
        boolean isPrime[] = method(20);
        for (int i = 0; i <= 20; i++) {
            System.out.println(i + " " + isPrime[i]);
        }


    }

    static boolean[] method(int n) {
        boolean[] arr = new boolean[n + 1];

        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i * i <= n; i++) {


            for (int j = i*2; j <= n; j += i) {
                arr[j] = false;
            }
        }

        return arr;
    }
}
