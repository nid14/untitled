package HackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxPresentation {
    public static int maxNoOfPresen(int[] start, int[] end) {
        int[][] arr = new int[start.length][2];
        for (int i =0; i < arr.length; i++) {
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] -o2[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        list.add(arr[0]);
        for (int j =1; j < arr.length; j++) {
            int[] current = arr[j];
            int[] last = list.get(list.size()-1);
            if (current[0] >= last[1]) {
                list.add(current);
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        System.out.println(maxNoOfPresen(new int[] {1,1,2}, new int[] {3,2,4}));
    }
}
