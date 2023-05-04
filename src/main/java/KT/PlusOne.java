package KT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
//Input: digits = [1,2,3]
//        Output: [1,2,4]
//        Explanation: The array represents the integer 123.
public class PlusOne {
    public static int[] plusOneCarry(int[] digits) {
        int carry = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = digits.length-1; i >=0; i--) {
            int newNum = digits[i] + carry;
            int remainder = newNum%10;
            list.add(remainder);
            carry = newNum/10;
        }

        if(carry>0){
            list.add(carry);
        }

        int[] finalArr = new int[list.size()];
        for (int i =list.size()-1; i>=0; i--) {
            finalArr[list.size()-1-i] = list.get(i);
        }
        return finalArr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOneCarry(new int[] {1,2,3})));
    }
}
