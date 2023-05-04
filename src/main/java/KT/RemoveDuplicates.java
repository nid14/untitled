package KT;


//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int current = nums[0];
        int count = 1;
        for(int i = 0; i < nums.length; i++) {
            if(current == nums[i]){
                continue;
            } else{
                nums[count] = nums[i];
                current = nums[i];
                count ++;
            }
        }
        return count;
    }
}
