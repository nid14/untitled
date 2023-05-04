package KT;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//        Input:
//        [4,3,2,7,8,2,3,1]
//        Output:
//        [5,6]
public class FindAllNumbersDisappearedArray448 {
    public static List<Integer> numDisapear(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int j =0; j < arr.length; j++) {
            set.add(arr[j]);
        }
        List<Integer> list = new ArrayList<>();
        for (int i =1; i < arr.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println((numDisapear(new int[] {4,3,2,7,8,2,3,1})));
    }


}

//public class FindNumbersDissapearedFromArray {
//
//    public static List<Integer> numbersDisapeared(int[] arr) {
//
//        Set<Integer> set = new HashSet<>();
//
//        for (int i=0; i<arr.length; i++) {
//            set.add(arr[i]);
//        }
//
//        List<Integer> list = new ArrayList<>();
//
//        for (int i=0; i<arr.length; i++) {
//
//            if (!set.contains(i)) {
//                list.add(i);
//            }
//        }
//        return list;
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(numbersDisapeared(new int[] {4,32,7,8,2,3,1}));
//    }
//}
