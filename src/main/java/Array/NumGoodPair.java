package Array;

public class NumGoodPair {
    public static int goodPairOptomize(int[] nums) {
        int[] arr = new int[101];
        int count = 0;
        for(int num : nums){
            count += arr[num];
        }
        return count;
    }

    public static int goodpair(int[] nums) {
        int count = 0;
        for (int i =0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
