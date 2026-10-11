package arraypractice;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroArrays {
    public static void main(String[] args) {
        System.out.println("Zero Arrays");
        zeroAtTheEnd();
    }

    public static void zeroAtTheEnd(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        int index = 0;
        for(int num : arr){
            if(num!=0){
                arr[index] = num;
                index++;
            }
        }
        while(index < arr.length){
            arr[index] = 0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
