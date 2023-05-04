package KT;


import java.util.Arrays;


//Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Output: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {
    public static int[] twSum(int[] nums, int target) {
        int[] finalArray = new int[2];
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (nums[start] + nums[end] > target) {
                end--;
            } else if (nums[start] + nums[end] < target) {
                start++;
            } else {
                return new int[]{start, end};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
