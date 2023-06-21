import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = fibonacci(n);
        System.out.println(value);
    }

    static int fibonacci(int n) {
        if (n<2)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);

    }

}
