package binarySearch;

import java.util.Scanner;

public class bSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Enter the number you want to search:");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int index = binarySearch(arr, target);
        System.out.println("The index is :" + index);
    }

    //return index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;    //might be possible that the value of the index can be out the range
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid]) {
                start = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
}
