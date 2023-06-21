import java.util.Scanner;

public class Sumofdights {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
//        String s=String.valueOf(n);
        System.out.println( sumOfDights(n));
    }

    private static int sumOfDights(int n) {
        if (n == 0)
            return 0;
        return (sumOfDights(n/10)+n%10);
    }
}
