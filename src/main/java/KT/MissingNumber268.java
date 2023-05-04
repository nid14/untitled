package KT;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
//        Example 1:
//        Input: [3,0,1]
//        Output: 2
public class MissingNumber268 {
    public static int missingNum(int[] arr) {
        Arrays.sort(arr);
        for (int i =0; i < arr.length; i++) {
            if (arr[i]!= i) {
                return i;
            }
        }
        return -1;
    }

    public static int anotherway(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i= 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int k=0; k<nums.length+1; k++){
            if(!set.contains(k)){
                return k;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(missingNum(new int[] {9,6,4,2,3,5,7,0,1}));
        System.out.println(anotherway(new int[] {3,0,1}));
    }

}
