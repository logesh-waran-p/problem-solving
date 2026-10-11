package arraypractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {

        //arrayRotation();
//        rightRotateByOne();
        leftRotatebyK();

    }


    public static void arrayRotation(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter rotation value k: ");
        int k = scanner.nextInt();


        System.out.println(
                "Original array: " + Arrays.toString(arr)
        );

        scanner.close();
        k = k % size;

        int[] rotatedArray = new int[size];

        for (int i = 0; i < size; i++) {
            int newPosition = (i + k) % size;
            System.out.println("New position: " + newPosition);
            rotatedArray[newPosition] = arr[i];
            System.out.println("New rotated array: " + Arrays.toString(rotatedArray));
        }
    }

    public static void rightRotateByOne(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        int lastElement = arr[size - 1];
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }

    public static void leftRotatebyK(){
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        k=k % size;
        for(int i=0; i<k; i++){
            int firstElement = arr[0];
            System.out.println("Rount: " + Arrays.toString(arr));
            for(int j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }

            arr[arr.length-1] = firstElement;
        }
        System.out.println("Final array: " + Arrays.toString(arr));
    }

}
