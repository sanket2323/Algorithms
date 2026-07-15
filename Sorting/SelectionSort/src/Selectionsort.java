import java.util.Arrays;
import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the element in the array:");
        int[]  arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        selectionSort( arr);
        System.out.println("Sorted array:"+ Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int smallest=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest]>arr[j])
                    smallest=j;
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

    }
}
