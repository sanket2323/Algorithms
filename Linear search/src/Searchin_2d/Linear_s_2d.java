package Searchin_2d;

import java.util.Scanner;

public class Linear_s_2d {
    public static void main(String[] args) {
        int[][] twoDArr= {
                {1,2,3,4,5},
                {8,9,10,12},
                {14,15,16}
        };
        System.out.println("Enter the number you want to search:");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int[] num=Linear_search(twoDArr,target);
        for (int x:
             num) {
            System.out.println(x);
        }
    }

    static int[] Linear_search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target)
                    return new int[]{row,col};  //creating new object of the array as it is not already intilized
            }
        }
        return new int[]{-1,-1};  //creating new object of array
    }
}
