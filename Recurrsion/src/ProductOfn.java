import java.util.Scanner;

public class ProductOfn {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(product(n));
    }

    private static int product(int n) {
        if (n%10 == n)
            return n;
        return product(n / 10) * (n % 10);
    }

}
