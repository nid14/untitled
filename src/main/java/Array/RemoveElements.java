package Array;


import java.util.Arrays;

//Input: nums = [3,2,2,3], val = 3
//        Output: 2, nums = [2,2,_,_]
public class RemoveElements {
    public static int removeElement(int[] nums, int val) {
    int start = 0;
    int end = nums.length-1;
    while(start <= end) {
        if(nums[end] == val){
            end--;
        } else{
            if(nums[start] == val) {
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                start++;
                end--;
            } else{
                start++;
            }
        }
    }
    return end+1;
   }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {3,2,2,3}, 3));
    }
}
