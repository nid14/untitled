package KT;


import java.util.HashMap;
import java.util.Map;

//In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
//        Input: [1,2,3,3]
//        Output: 3
public class RepeatedElementSize2NArray961 {
    public static int repetedEle(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int count = map.get(arr[i]);
                map.put(arr[i], count+1);
            }
        }

        for (int j = 0; j < arr.length; j++) {
            int count = map.get(arr[j]);
            if (count > 1) {
                return arr[j];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(repetedEle(new int[] {1,2,3,3}));
    }
}
