package arraypractice;

import java.util.*;

public class ArrayPract {

    public static void main(String[] args) {
        System.out.println("Array Practice");

//        int largest = largestNumberInArray();
//        System.out.println("Largest number: " + largest);

//        int secondLargest = secondLargestNumberInArray();
//        System.out.println("The second largest number is " + secondLargest);

//        int[] reversedArray = reverseAnArray();
//        for(int num: reversedArray){
//            System.out.print(num+" ");
//        }

//        System.out.println(isSortedArray());

//        findMinandMax();
//        findOddEvenCount();
//        arraySumAndAverage();
//        int arrayIndex = findArrayIndex();
//        System.out.println("arrayIndex: " + arrayIndex);

//        int[] result = findDuplicates();
//        for(int num:result){
//            System.out.print(num+" ");
//        }

//        removeDuplicates();
        frequencyOfEveryElement();


    }


    public static int largestNumberInArray() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }

        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int secondLargestNumberInArray() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int[] reverseAnArray(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static boolean isSortedArray(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        if(isSorted(arr)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isSorted(int[] arr){
        boolean flag = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return  flag=false;
            }
        }
        return flag;
    }

    public static void findMinandMax(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<size; i++){
            list.add(s.nextInt());
        }
        int min = list.get(0);
        int max = list.get(0);

        for(int i=1; i<list.size(); i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    public static void findOddEvenCount(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<size; i++){
            list.add(s.nextInt());
        }
        int odd=0;
        int even=0;
        for(int num: list){
            if(num%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even count "+ even);
        System.out.println("odd count "+ odd);
    }

    public static void arraySumAndAverage(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        double sum = 0;
        for(int num : arr){
            sum = sum + num;
        }
        System.out.println("sum is "+ sum);
        System.out.println("Average is "+sum/arr.length);
    }

    public static int findArrayIndex(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<size; i++){
            list.add(s.nextInt());
        }
        int target = s.nextInt();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) == target){
                return i;
            }
        }
        return -1;
    }

    public static int[] findDuplicates(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for(int num : arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }

        int[] result = new int[duplicates.size()];
        int index = 0;
        for(int num: duplicates){
            result[index] = num;
            index++;
        }
        return result;
    }

    public static void removeDuplicates(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        Set<Integer> tree = new TreeSet<>();
        for(int num : arr){
            tree.add(num);
        }
        System.out.println("remove duplicates is "+ tree);
    }

    public static void frequencyOfEveryElement(){
        Scanner s = new Scanner(System.in);
        int  size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
    }

}


