package Linear_search;

import java.util.Arrays;
import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int arrlen = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search in the given array:");
        int target = sc.nextInt();
        System.out.println("Given array :" + Arrays.toString(arr));
        int num_index = Linear_search(arr, target);
        System.out.println("The required element is present at index :" + num_index);
    }


    static int Linear_search(int[] arr, int target) {
        if (arr.length < 1)
            return -1;

        for (int index = 0; index < 5; index++) {
            int element = arr[index];
            if (element == target)
                return index;
        }

        return -1;
    }
}

