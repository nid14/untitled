package KT;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Input: [1,2,3,1]
//        Output: true
public class ContainsDuplicate217 {
    public static boolean containDupli(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int count = map.get(arr[i]);
                map.put(arr[i], count+1);
            }
        }

        for (int j =0; j < arr.length; j++) {
            if (map.containsKey(arr[j])){
                int count = map.get(arr[j]);
                if (count >1){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean anotheWay (int[] arr) {
        int start =0 ;
        int end = arr.length-1;
        while (start<end) {
            if (arr[start] == arr[end]){
                return true;
            }
            end--;
        }
        return false;
    }

    public static int setWay(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])){
                set.add(arr[i]);
            } else {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] arge) {
        System.out.println(containDupli(new int[] {1,2,3,4}));
        System.out.println(anotheWay(new int[] {5,1,1,3,3,4,3,2,4,2}));
        System.out.println(setWay(new int[] {1,2,1,4}));
    }
}

//public class IfContainsDuplicate {
//
//    public static boolean containsDuplicateMapWay(int[] arr) {
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i=0; i<arr.length-1; i++) {
//
//            if (!map.containsKey(arr[i])) {
//                map.put(arr[i], 1);
//            } else {
//                int count = map.get(arr[i]);
//                map.put(arr[i], count+1)
//            }
//        }
//
//        for (int i=0; i<arr.length-1; i++) {
//
//            if (map.containsKey(arr[i])) {
//
//                int count = map.get(arr[i]);
//                if (count > 1) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(containsDuplicateMapWay(new int[] {1,2,1,4}));
//    }
//}
