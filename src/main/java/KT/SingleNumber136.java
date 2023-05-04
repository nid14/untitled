package KT;

import javax.swing.JFormattedTextField;
import java.util.HashMap;
import java.util.Map;

//
//Input: [4,1,2,1,2]
//        Output: 4
public class SingleNumber136 {

    public static int singleNum(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (map.containsKey(arr[j])) {
                int count = map.get(arr[j]);
                if (count == 1) {
                    return arr[j];
                }
            }
        }
        return -1;
    }

    public static int xorNum(int[] arr) {
        int a1= arr[0];
        for (int i =0; i < arr.length; i++) {
            a1 = a1 ^ arr[i];
        }
        return a1;
    }

    public static void main(String[] args) {
        System.out.println(singleNum(new int[]{2, 2, 1}));
        System.out.println(xorNum(new int[]{2, 2, 1}));
    }
}
