package KT;


//Input: [[1,91],[1,92],[2,93],[2,97],[1,60],[2,77],[1,65],[1,87],[1,100],[2,100],[2,76]]
//        Output: [[1,87],[2,88]]
//        Explanation:
//        The average of the student with id = 1 is 87.
//        The average of the student with id = 2 is 88.6. But with integer division their average converts to 88

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighFive1086 {
    public static int[][] highFive(int[][] items) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < items.length; i++) {
            if (!map.containsKey(items[i][0])) {
                List<Integer> list = new ArrayList<>();
                list.add(items[i][1]);
                map.put(items[i][0], list);
            } else {
                List<Integer> list = map.get(items[i][0]);
                list.add(items[i][1]);
                map.put(items[i][0], list);
            }
        }
        int[][] result = new int[map.keySet().size()][2];
        int index = 0;
        for (int key : map.keySet()) {
            List<Integer> listN = map.get(key);
            Collections.sort(listN);
            int sum = 0;
            for (int j = listN.size() - 1; j >= listN.size() - 1 - 4 && j >= 0; j--) {
                sum = sum + listN.get(j);
            }
            int average = sum / 5;
            result[index++] = new int[]{key, average};
        }
        System.out.println(map);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(highFive(new int[][]{{1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}})));
    }
}
