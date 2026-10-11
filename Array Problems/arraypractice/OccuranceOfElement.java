package arraypractice;

import java.util.*;

public class OccuranceOfElement {
    public static void main(String[] args) {
        System.out.println("Occurs of an Element");

//        int findFirst = findFirstRepeatingNumber();
//        System.out.println(findFirst);

//        frequencyOfEveryNumber();

//        int firstNum = firstNonRepeatingNumber();
//        System.out.println(firstNum);

        findAllMissingNumber();
    }

    public static int findFirstRepeatingNumber(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)){
                return  num;
            }
            set.add(num);
        }
        return -1;
    }

    public static void frequencyOfEveryNumber(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        //frequency of every number
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + " " + entry.getValue()+" ");
        }

    }


    public static int firstNonRepeatingNumber(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void findAllMissingNumber(){
        Scanner s = new Scanner(System.in);
        int max = s.nextInt();
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        Set<Integer> numbers = new HashSet<>();
        List<Integer> missing = new ArrayList<>();
        for(int num : arr){
            numbers.add(num);
        }
        for(int i=1; i<=max; i++){
            if(!numbers.contains(i)){
                missing.add(i);
            }
        }
        Collections.sort(missing);
        System.out.println("Actual numbers: "+numbers);
        System.out.println("missing numbers: "+missing);
    }




}
