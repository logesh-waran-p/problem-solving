package arraypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrefixSumArray {
    public static void main(String[] args) {
        System.out.println("Prefix Sum Problems");

        //prefixSum();
        sumBetweenIndicies();
    }

    public static void prefixSum(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<size; i++){
            arr.add(s.nextInt());
        }
        int sum =0;
        for(int i=0; i<size; i++){
            sum = sum + arr.get(i);
            arr.set(i, sum);
        }
        System.out.println(arr);
    }


    public static void sumBetweenIndicies(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int left = s.nextInt();
        int right = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        int sum = 0;
        for(int i=left; i<=right; i++){
            sum = sum + arr[i];
        }
        System.out.println("Left: "+left+" Right: "+right);
        System.out.println(Arrays.toString(arr));
        System.out.println("between two Indicies sum is: "+sum);
    }
}
