package HackerEarth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HelpJarvis_hacker {

    public static void scannerMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of testCases");
        int testcases = scanner.nextInt();
        int[] arr = new int[testcases];
        for(int i =0; i<testcases; i++){
            System.out.println("enter your 6 no:");
            arr[i]= scanner.nextInt();
        }
        System.out.println(helpJarvish(arr));
    }


    public static boolean movedTrain(int n){
        int length = Integer.toString(n).length();
        Set<Integer> set = new HashSet<>();
        for (int i =0; i < length; i++) {
            set.add(n % 10);
            n = n/10;
        }
        for (int j = 1; j <= length; j++){
            if (!set.contains(j)){
                return false;
            }
        }
        return true;
    }

    public static List<Boolean> helpJarvish(int[] arr){
        List<Boolean> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            list.add(movedTrain(arr[i]));
        }
        return list;
    }

    public static void main(String[] args){
        scannerMethod();
    }

}
