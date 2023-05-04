package HackerEarth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hackerthon {

    public static int BracketSequences(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
                    if (!map.containsKey(str.charAt(i))) {
                        map.put(str.charAt(i), 1);
                    } else {
                        int count = map.get(str.charAt(i));
                        map.put(str.charAt(i), count + 1);
            }
        }
        int ct = 0;
        for (char key : map.keySet()) {
            int count = map.get(key);
//            if (count % 2 == 0) {
              ct = ct + count;
//            }
        }
        return ct/2;
    }

    public static int minCount(int[] arr, int k) {
        int minValue = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println(minValue);
        return k-minValue;
    }

    public static List<Integer> maxList(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 1;
        while (j<arr.length-1) {
            if (arr[j] > arr[i]) {
                list.add(arr[j]);
                i++;
                j++;
            }
            else {
                i++;
                j++;
            }
        }
        list.add(arr[arr.length-1]);
        return list;
    }




    public static void main(String[] args){
        System.out.println(BracketSequences("(())))"));

        System.out.println(minCount(new int[] {1, 2, 5}, 1));
        System.out.println(maxList(new int[] {16,17,4,3,5,2}));

    }
}
