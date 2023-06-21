import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println( fact(n));


    }

    private static int fact(int n) {
        if(n<=1)
            return 1;
        int value= n*fact(n-1);
        return value;
    }
}
