import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {

        System.out.println("Enter the two number :");
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int res = gcd(a,b);
        System.out.println(res);
    }

    private static int gcd(int a, int b) {
        if (b==0 ) return a;
        return gcd(b,a%b);
     }


}
