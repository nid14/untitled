package Array;


import java.util.Arrays;

// nums= [-4, -1, 0, 3, 10]
// output = [0,1,9,16,100]
public class SquareOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int start = 0 ;
        int end = nums.length-1;
        int index = end;
        int[] ans = new int[nums.length];
        while (start <= end){
            int val1 = nums[start] * nums[start];
            int val2 = nums[end] * nums[end];
            if(val1 > val2) {
                ans[index] = val1;
                start ++;
            } else {
                ans[index] = val2;
                end--;
            }
            index--;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[] {-4, -1, 0, 3, 10})));
    }
}
