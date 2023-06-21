import java.util.Scanner;

public class Sumofn {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n == 1)
            return 1;
        return n+sum(n-1);
    }
}
