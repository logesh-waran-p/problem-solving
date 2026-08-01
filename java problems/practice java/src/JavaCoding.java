import javax.sound.midi.SysexMessage;
import java.sql.SQLOutput;
import java.util.*;

class Employee{
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}


public class JavaCoding {


    static void main() {
        System.out.println("Hello World!");
//        anagram();
//        eachOccuranceOfNumber();
//        arithmaticException();
//        fibonacci(7);
//        stringReverse();
//        linkedList();
//        occuranceOfString();
//        missingValueInArrays();
        hashMapExample();


    }

    public static void hashMapExample(){
        Employee e1 = new Employee("balaji", 25);
        Employee e2 = new Employee("hari", 24);
        Employee e3 = new Employee("hari", 23);
        Map<String, Integer> map = new HashMap<>();
        map.put(e1.name, e1.id);
        map.put(e2.name, e2.id);
        map.put(e3.name, e3.id);
//        System.out.println(map);
//        subStringReplace();
        trimItStartAndEnd();
    }

    public static void trimItStartAndEnd(){
        String s1 = "   This is   a Content     ";
        System.out.println("Before : [" + s1 + "]");
        int start = 0;
        int end = s1.length()-1;

        while (start <= end && s1.charAt(start) == ' ') {
            start++;
        }
        System.out.println("start value "+start);
        // Find last non-space character
        while (end >= start && s1.charAt(end) == ' ') {
            System.out.println("end value "+end);
            end--;
        }
        System.out.println("end value "+end);

        System.out.println("After  : [" + s1.substring(start,end+1) + "]");
    }




    public static void subStringReplace(){
        String s1 = "Balaji Hari";
        System.out.println(s1.replace("ri", "ra"));
    }

    public static void missingValueInArrays(){
        int[] a = {2,6,8,1};
        int [] b = {1,8,2};
        int sumA = 0;
        int sumB =0;
        for(int num : a){
            sumA = sumA+num;
        }
        for(int num: b){
            sumB = sumB+num;
        }
        System.out.println("Missing Value "+ (sumA - sumB));

    }

    public static void occuranceOfString(){
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine().trim();

        Map<Character, Integer> map = new HashMap<>();
        for(char c: s1.toCharArray()){
            int currentValue = map.getOrDefault(c, 0);
            int updatedValue = currentValue + 1;
            map.put(c, updatedValue);
        }
        System.out.println(map);
    }

    public static void linkedList(){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1; i<10; i++){
            list.add(i);
        }
        System.out.println(list.reversed());
        System.out.println(list);
    }

    public static void stringReverse(){
        Scanner s= new Scanner(System.in);
        String str = s.nextLine().trim();
        String reverse="";
        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse+" with string");

        StringBuffer s1 = new StringBuffer(str).reverse();
        System.out.println(s1+" with string buffer");

    }

    public static void fibonacci(int x){
        int a = 0;
        int b = 1;
        int c=0;
        System.out.print(0+" "+ 1);
        for(int i=1; i<x; i++){
            c = a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }

    }

    public static void arithmaticException(){
        Scanner s = new Scanner(System.in);
        try{
            int a = s.nextInt();
            int b = s.nextInt();
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException a){
            System.out.println(a);
        }
        catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("program executed");
        }
    }

    public static void eachOccuranceOfNumber(){
        int[] arr = {1, 2, 2, 1};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            int currentValue = map.getOrDefault(num, 0);
            int updatedValue = currentValue + 1;
            map.put(num, updatedValue);
            System.out.println(map);
        }

        System.out.println(map);

    }

    public static void anagram(){
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();

        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        System.out.println(Arrays.equals(char1, char2));
    }
}
