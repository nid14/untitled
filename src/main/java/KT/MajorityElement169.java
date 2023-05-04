package KT;


//Input: [3,2,3]
//        Output: 3

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

    public static int majorityEle(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int count = map.get(arr[i]);
                map.put(arr[i], count+1);
            }
        }
        int maxNo = Integer.MIN_VALUE;
        for (int j =0; j < arr.length; j++) {
            if (map.containsKey(arr[j])){
                int count = map.get(arr[j]);
                if (count> maxNo){
                    maxNo = arr[j];
                }
            }
        }
        return maxNo;
    }

    public static void main(String[] args) {
        System.out.println(majorityEle(new int[] {4,4,3,2}));
    }
}

//public class MajorityElement {
//
//    public static int majElement(int[] arr) {
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i=0; i<arr.length-1; i++) {
//
//            if (!map.containsKey(arr[i])) {
//                map.put(arr[i], 1);
//            } else {
//                int count = map.get(arr[i]);
//                map.put(arr[i], count+1);
//            }
//        }
//
//        int maxNum = Integer.MIN_VALUE;
//        for (int i=0; i<arr.length-1; i++) {
//
//            if (map.containsKey(arr[i])) {
//                int count = map.get(arr[i]);
//                if (count > maxNum) {
//                    maxNum = arr[i];
//                }
//            }
//        }
//        return maxNum;
//    }
//}
