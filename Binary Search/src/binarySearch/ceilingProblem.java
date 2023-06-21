//Find the ceiling of the target element? --> smallest number which is greater than or equal to target number

package binarySearch;

import java.util.Scanner;

public class ceilingProblem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 7, 9, 19, 20};

        System.out.println("Enter the target element for which you want to find the ceiling value:");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int index = ceilp(arr, target);
        System.out.println("The index of the number is:" + index);


        System.out.println("The ceiling of the number is:" + arr[index]);
    }

    static int ceilp(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;

            } else
                return mid;
        }
        return start;
    }


}
