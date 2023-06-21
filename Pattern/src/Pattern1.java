import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);
        System.out.println("Pattern number 2");
        pattern2(n);
        System.out.println("Pattern number 4");
        pattern4(n);
        System.out.println("Pattern number 28");
        pattern28(n);
        System.out.println("Pattern number 7");
        pattern7(n);
        System.out.println("Pattern number 6");
        pattern6(n);
        System.out.println("Pattern number 8");
        pattern8(n);
        System.out.println("Pattern number 9");
        pattern9(n);
        System.out.println("Pattern number 10");
        pattern10(n);
        System.out.println("Pattern number 11");
        pattern11(n);
        System.out.println("Printing 13th pattern");
        pattern13(n);
        System.out.println("Printing 14th pattern");
        pattern14(n);
        System.out.println("Printing 20th pattern");
        pattern20(n);
    }

    private static void pattern20(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-1 ; j++) {
                if (j==1 || j== n-1 || i==1 || i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


    private static void pattern14(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == n || j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
        }
    }

    static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == n)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
        }
    }

    static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }


        }
    }

    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            int noOfSpaces = n - i;
            for (int k = 1; k <= noOfSpaces; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i > n) {
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    //use the ternary operator for pattern number 4
    //int col= row>n?2*n-1:row=cow

    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
