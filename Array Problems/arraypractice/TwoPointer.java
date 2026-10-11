package arraypractice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointer {
    public static void main(String[] args) {
        System.out.println("Two Pointer Array");

        int[] result = twoSumSortedArray();
        if(result[0]==-1){
            System.out.println("No pair found");
        }else{
            System.out.println("Indices: "+ Arrays.toString(result));
        }

    }

    public static int[] twoSumSortedArray(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr =  new int[size];
        int target = s.nextInt();
        for(int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }
        int left = 0;
        int right = size - 1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[] {left, right};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
