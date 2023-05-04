package Array;

import LinkList.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EasyArray {
//    Input: nums = [1,2,3,4]
//    Output: [1,3,6,10]
//    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    public static int[] runningSum(int[] nums){
        int[] arr = new int[nums.length];
        int sum =0;
        for(int i = 0; i<nums.length; i++){
            sum = sum + nums[i];
            arr[i]= sum;
        }
        return arr;
    }

//    Input: candies = [4,2,1,1,2], extraCandies = 1
//    Output: [true,false,false,false,false]
//    Explanation: There is only 1 extra candy, therefore only kid 1 will have the greatest number of candies among the kids regardless of who takes the extra candy.



    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> list = new ArrayList<>();
        int maxCandies = Integer.MIN_VALUE;
        for (int i =0; i<candies.length; i++){
            if(maxCandies<candies[i]){
                maxCandies = candies[i];
            }
        }
        for (int i = 0; i<candies.length; i++){
            if(maxCandies<= candies[i]+extraCandies){
                list.add(true);
            }else {
                list.add(false);
            }
        }
        return list;
    }
//    Shuffle the Array
//    Input: nums = [2,5,1,3,4,7], n = 3
//    Output: [2,3,5,4,1,7]
//    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

    public static  int[] shuffle(int[] nums, int n){
        int[] arr = new int[nums.length];
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            if(i%2==0){
                arr[i]= nums[index];
                index++;
            }else{
                arr[i]= nums[n];
                n++;
            }
        }
        return arr;
    }

//    A pair (i,j) is called good if nums[i] == nums[j] and i < j.
//    Return the number of good pairs.
//    Input: nums = [1,2,3,1,1,3]
//    Output: 4
//    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
    public static int numIdenticalPairs(int[] nums){
        int count = 0;
        for (int i = 0; i<nums.length; i++){
            for (int j= 0; j<nums.length; j++){
                if (nums[i] == nums[j] && i<j){
                    count = count+1;
                }
            }
        }
        return count;
    }
//    Input: nums = [8,1,2,2,3]
//    Output: [4,0,1,1,3]
//    Explanation:
//    For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
//    For nums[1]=1 does not exist any smaller number than it.
//    For nums[2]=2 there exist one smaller number than it (1).
//    For nums[3]=2 there exist one smaller number than it (1).
//    For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] arr = new int[nums.length];
        for (int i = 0; i<nums.length; i++){
            int count = 0;
            for (int j = 0; j<nums.length; j++){
                if (nums[i]>nums[j]){
                    count= count+1;
                }
            }
            arr[i]= count;
        }
        return arr;
    }
//    Input: nums = [1,2,3,4]
//    Output: [2,4,4,4]
//    Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
//    The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
//    At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
    public static int[] decompressRLElist(int[] nums){
        List<Integer> list = new ArrayList();
        int index = 0;
        int k = 0;
        while(k<nums.length-1 && index < nums.length){
            int count = nums[k];
            int value = nums[k+1];
            for(int l=0;l<count;l++){
                list.add(value);
            }
            k =  k+2;
        }
        int[] array = new int[list.size()];
        for(int i=0; i<array.length; i++){
            array[i]=list.get(i);
        }
        return array;
    }

//    Input: n = 5, start = 0
//    Output: 8
//    Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
//    Where "^" corresponds to bitwise XOR operator.
    public static int xorOperation(int n, int start){
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= start+2*i;
        }
        int xor_arr = arr[0];
        for (int j=1; j<n; j++){
            xor_arr = xor_arr^arr[j];
        }
        return xor_arr;
    }

//    Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//    Output: [0,4,1,3,2]
//    Explanation:
//    nums       index     target
//0            0        [0]
//        1            1        [0,1]
//        2            2        [0,1,2]
//        3            2        [0,1,3,2]
//        4            1        [0,4,1,3,2]

    public static int[] createTargetArray(int[] nums, int[] index){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] arr = new int[list.size()];
        for (int j =0; j<nums.length; j++){
            arr[j]= list.get(j);
        }
        return arr;
    }

//    Given an array nums of integers, return how many of them contain an even number of digits.
//    Example 1:
//    Input: nums = [12,345,2,6,7896]
//    Output: 2

//    public static int findNumbers(int[] nums){
//
//    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(runningSum(new int[] {2,3,5,1,3})));
        System.out.println((kidsWithCandies(new int[] {2,3,5,1,3}, 3)).toString());
        System.out.println(Arrays.toString(shuffle(new int[] {2,5,1,3,4,7}, 3)));
        System.out.println(numIdenticalPairs(new int[] {1,2,3,1,1,3}));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] {8,1,2,2,3})));
        System.out.println(Arrays.toString(decompressRLElist(new int[] {1,2,3,4})));
        System.out.println(xorOperation(5,0 ));
        System.out.println(Arrays.toString(createTargetArray(new int[] {0,1,2,3,4}, new int[] {0,1,2,2,1})));


    }
}
