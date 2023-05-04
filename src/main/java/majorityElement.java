public class majorityElement {
    public static void main(String[] args){
        int[] nums = new int[]{2,4,5,5,5,5,5,6,6};
        int target = 5;
        System.out.println(isMajorityElement(nums, target));

    }
    public static Boolean isMajorityElement(int[] nums, int target){
        int firstIndex = search(nums, target);
        int lastIndex = search(nums, target+1);
        if (lastIndex-firstIndex>nums.length/2){
            return true;
        }
        else{
            return false;
        }
    }
    public static int search(int[] nums, int target){
        int l=0;
        int h=nums.length-1;
        int min = Integer.MAX_VALUE;
        while (l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]==target){
                min=Math.min(min, mid);
                h = mid-1;
            }
            if (nums[mid]>target){
                h = mid-1;
            }
            if (nums[mid]<target){
                l = mid+1;
            }
        }
        return min;
    }
}
