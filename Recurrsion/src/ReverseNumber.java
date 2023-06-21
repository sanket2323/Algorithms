import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to be reversed:");
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        System.out.println(reverse(n)) ;
    }
    static String reverse(String n){
        if(n==0)
            return "0";
        return "n%10 + reverse(n/10)";
    }
}
