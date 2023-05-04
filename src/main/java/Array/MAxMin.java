package Array;

import java.util.Arrays;

public class MAxMin {
    public static int[] minMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

       int[] maxMin = new int[]{max, min};
        return maxMin;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{1, 4, 6, 9})));
    }
 }
