package Array;

import java.util.Arrays;

public class ArraySuffle {
    //    Input: nums = [2,5,1,3,4,7], n = 3
//    Output: [2,3,5,4,1,7]
//    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
//
    public static int[] suffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                arr[i] = nums[index];
                index++;
            } else {
                arr[i] = nums[n];
                n++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(suffle(new int[] {2,5,1,3,4,7}, 3)));
    }


}
