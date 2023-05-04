package KT;

import sun.nio.cs.ext.MacThai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solutions {

    //ale - ale
    public static boolean isAnagram(String a, String b){
        if (a.length()!=b.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<a.length(); i++){
            if (!map.containsKey(a.charAt(i))){
                map.put(a.charAt(i),1);
            }else{
                int count = map.get(a.charAt(i));
                map.put(a.charAt(i), count+1);
            }
        }
        for (int j= 0; j<b.length(); j++){
            if (map.containsKey(b.charAt(j))){
                int count1= map.get(b.charAt(j));
                count1 = count1-1;
                if (count1==0){
                    map.remove(b.charAt(j));
                }else {
                    map.put(b.charAt(j),count1);
                }
            }else {
                return false;
            }
        }
        return true;
    }
//    Input: nums = [8,1,2,2,3]
//    Output: [4,0,1,1,3]
//    Explanation:
//    For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
    public static int[] smallerNumber(int[] nums){
        int[] arr = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            int count = 0;
            for (int j= 0; j<nums.length; j++){
                if (nums[i]>nums[j]) {
                    count = count + 1;
                }
            }
            arr[i]= count;
        }
        return arr;
    }

//    Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//    Output: 8
//    Explanation: There are 8 negatives number in the matrix.
    public static int negativeNumber(int[][] grid){
        int count = 0;
        int m = grid.length;
        int n= grid[0].length;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j]<0){
                    count = count+1;
                }

            }
        }
        return count;
    }

//    Input: nums = [12,345,2,6,7896]
//    Output: 2
//    Explanation:
//            12 contains 2 digits (even number of digits).
//            345 contains 3 digits (odd number of digits).
    public static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i<nums.length; i++){
            int s = String.valueOf(nums[i]).length();
            if (s%2==0){
                count = count+1;
            }
        }
        return count;
    }

//    Input: arr = [17,18,5,4,6,1]
//    Output: [18,6,6,6,1,-1]
    public static int[] replaceElements(int[] arr){
        int[] finalArr = new int[arr.length];
        for (int i =0; i<arr.length; i++){
            int max =-1;
            for (int j= i+1; j<arr.length; j++){
                if (arr[j]>max){
                    max=arr[j];
                }
            }
            finalArr[i]=max;
        }
        return finalArr;
    }

//    Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
//    Output: [1,5]
//    Explanation: Only 1 and 5 appeared in the three arrays.
    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3){
        Set<Integer> set1 = new HashSet<>();
        for (int i=0; i<arr1.length; i++){
            if (!set1.contains(arr1[i])){
                set1.add(arr1[i]);
            }
        }
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int j= 0; j<arr2.length; j++){
            if(set1.contains(arr2[j])){
                set2.add(arr2[j]);
            }
        }

        for (int k=0; k<arr3.length; k++){
            if (set2.contains(arr3[k])){
                list.add(arr3[k]);
            }
        }
        return list;
    }
//    Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
//            Input: "leetcodeisacommunityforcoders"
//    Output: "ltcdscmmntyfrcdrs"

    public static String removeVowels(String s){
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        String removedString = "";
        for (int i = 0; i<s.length(); i++){
            if (!set.contains(s.charAt(i))){
                removedString = removedString+s.charAt(i);
            }
        }
        return removedString;
    }
//    Input: [[1,91],[1,92],[2,93],[2,97],[1,60],[2,77],[1,65],[1,87],[1,100],[2,100],[2,76]]
//    Output: [[1,87],[2,88]]
//    Explanation:
//    The average of the student with id = 1 is 87.
//    The average of the student with id = 2 is 88.6. But with integer division their average converts to 88.

    public static int[][] highFive(int[][] items){
        Map<Integer, List<Integer>> maps = new HashMap<>();
        for(int i=0; i<=items.length-1; i++){
            if(maps.containsKey(items[i][0])){
                List<Integer> list = maps.get(items[i][0]);
                list.add(items[i][1]);
                maps.put(items[i][0], list);
            } else {
                int key = items[i][0];
                List<Integer> list = new ArrayList<>();
                list.add(items[i][1]);
                maps.put(items[i][0], list);
            }
        }
        int [][] result = new int[maps.keySet().size()][2];
        int index =0;

        for(int key : maps.keySet()){
            List<Integer> list = maps.get(key);
            Collections.sort(list);
            int sum=0;
            for(int i= list.size()-1; i>= list.size()-1-4 && i>=0; i--){
                sum = sum+list.get(i);
            }
            int average = sum/5;
            result[index] = new int[]{key, average};
            index++;
        }
        return result;
    }

//    Input: 2
//    Output: 1
//    Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
//    he Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//    F(0) = 0,   F(1) = 1
//    F(N) = F(N - 1) + F(N - 2), for N > 1.

    public static int fib(int N) {
        if(N==0){
            return 0;
        }
        int[] arr = new int[N+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<=N; i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[N];
    }

//    Input: [1,2,3,3]
//    Output: 3
    public static int repeatedNTimes(int[] A){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<A.length; i++){
            if (!map.containsKey(A[i])){
                map.put(A[i],1);
            }else{
                int count = map.get(A[i]);
                map.put(A[i], count+1);
            }
        }
        for (int j=0; j<A.length; j++){
            if(map.containsKey(A[j])){
                int count = map.get(A[j]);
                if (count>1){
                    return A[j];
                }
            }
        }
        return -1;
    }

//    Input:
//    paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
//    banned = ["hit"]
//    Output: "ball"
    public static String mostCommonWord(String paragraph, String[] banned){
        String[] word = paragraph.split("[ !?',;.]+");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i<word.length; i++){
            String lowerWord = word[i].toLowerCase();
            if (!map.containsKey(lowerWord)){
                map.put(lowerWord,1);
            }else {
                int count = map.get(lowerWord);
                map.put(lowerWord,count+1);
            }
        }
        for (int j=0; j<banned.length; j++){
            if (map.containsKey(banned[j])){
                map.remove(banned[j].toLowerCase());
            }
        }
        System.out.println(map.toString());
        String res = null;
        for (String key : map.keySet()){
            if (res==null || map.get(key)>map.get(res)){
                res=key;
            }
        }
        return res;
    }

//    Input: J = "aA", S = "aAAbbbb"
//    Output: 3
    public static int numJewelsInStones(String J, String S){
        Set<Character> set = new HashSet<>();
        for (int i = 0; i<J.length(); i++){
            set.add(J.charAt(i));
        }
        int count = 0;
        for (int j= 0; j<S.length(); j++){
            if (set.contains(S.charAt(j))){
                count=count+1;
            }
        }
        return count;
    }

//    A = [12, 28, 46, 32, 50]
//    B = [50, 12, 32, 46, 28]
//    We should return[1, 4, 3, 2, 0]

    public static int[] anagramMappings(int[] A, int[] B){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i<B.length; i++){
            if (!map.containsKey(B[i])){
                map.put(B[i], i);
            }
        }
        int[] arr = new int[A.length];
        for (int j= 0; j<A.length; j++){
            if (map.containsKey(A[j])){
                arr[j]=map.get(A[j]);
            }
        }
        return arr;
    }


//    Input: nums = [1,7,3,6,5,6]
//    Output: 3
//    Explanation:
//    The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
//    Also, 3 is the first index where this occurs.
    public static int pivotIndex(int[] nums){
        int sum =0;
        for(int i= 0; i<nums.length; i++){
            sum = sum+nums[i];
        }
        int leftSum = 0;
        for(int j =0; j<nums.length; j++){
            if(sum-leftSum-nums[j]==leftSum){
                return j;
            } else{
                leftSum = leftSum+nums[j];
            }
        }
        return  -1;
    }
//    Input: [1,2,3] max 3 element product
//    Output: 6

    public static int maximumProduct(int[] nums){
        if (nums.length<3){
            if (nums.length==1){
                return nums[0];
            }
            return nums[0]*nums[1];
        }
        Arrays.sort(nums);
        int negative = nums[0]*nums[1]*nums[2];
        int positive = nums[nums.length-1]* nums[nums.length-2]* nums[nums.length-3];
        int maxProd = Math.max(negative,positive);
        return maxProd;
    }

//    Find All Numbers Disappeared in an Array
//    Input:[4,3,2,7,8,2,3,]
//    Output:[5,6]
//    public static List<Integer> findDisappearedNumbers(int[] nums){
//
//    }
//    Input: [-4,-1,0,3,10]
//    Output: [0,1,9,16,100]
    public static int[] sortedSquares(int[] A) {
        int p= 0;
        while(p<A.length && A[p]<0){
            p++;
        }
        int n= p-1;
        int[] arr = new int[A.length];
        int index =0;
        while(n>=0 && p<A.length){
            if(A[n]*A[n]<A[p]*A[p]){
                arr[index]=A[n]*A[n];
                n--;
            }else{
                arr[index]= A[p]*A[p];
                p++;
            }
            index++;
        }
        while(n>=0){
            arr[index]=A[n]*A[n];
            n--;
            index++;
        }
        while(p<A.length){
            arr[index]=A[p]*A[p];
            p++;
            index++;
        }
        return arr;
    }
//    Given nums = [0,1,2,2,3,0,4,2], val = 2,
//    Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
    public static int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int j =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[j]= nums[i];
                j++;
            }
        }
        return j;

    }

//    Input: [3, 2, 1]
//    Output: 1
//    Explanation: The third maximum is 1.
public static int thirdMax(int[] nums) {
    Integer max = null;
    Integer secondMax= null;
    Integer thirdMax = null;
    for(Integer num : nums){
        if(num.equals(max)||num.equals(secondMax)||num.equals(thirdMax)){
            continue;
        }
        if(max==null || num>max){
            thirdMax= secondMax;
            secondMax= max;
            max= num;
        }else if(secondMax == null || num>secondMax){
            thirdMax = secondMax;
            secondMax= num;
        }else if (thirdMax == null || num>thirdMax){
            thirdMax = num;
        }
    }
    if(thirdMax==null){
        return max;
    }
    return thirdMax;
}
    public static boolean palindronArray(int[] num){
        for(int i=0; i<num.length/2; i++){
            if (num[i]!=num[num.length-i-1]){
                return  false;
            }
        }
        return true;
    }

    public static boolean isPalindrom(int n){
        int num=0;
        int temp = n;
        while (temp!=0){
            int rem = temp%10;
            int newNum = num*10+rem;
            temp= temp/10;
            num =newNum;
        }
        if(num==n){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isAnagram("axle", "lxae"));
        System.out.println(Arrays.toString(smallerNumber(new int[] {8,1,2,2,3})));
//        System.out.println(negativeNumber(new int[][] {4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3});
        System.out.println(findNumbers(new int[] {12,345,2,6,7896}));
        System.out.println(Arrays.toString(replaceElements(new int[] {17,18,5,4,6,1})));
        System.out.println(arraysIntersection(new int[] {1,2,3,4,5}, new int[] {1,2,5,7,9},new int[] {1,3,4,5,8}).toString());
        System.out.println(removeVowels("leetcodeisacommunityforcoders"));
        System.out.println(fib(2));
        System.out.println(repeatedNTimes(new int[] {1,2,3,3}));
//        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"});
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(Arrays.toString(anagramMappings(new int[] {12, 28, 46, 32, 50}, new int[] {50, 12, 32, 46, 28})));
        System.out.println(pivotIndex(new int[] {1,7,3,6,5,6}));
        System.out.println(maximumProduct(new int[] {1,2,3}));
        System.out.println(palindronArray(new int[] {3,6,0,2,3}));
        System.out.println(isPalindrom(122));


    }
}
