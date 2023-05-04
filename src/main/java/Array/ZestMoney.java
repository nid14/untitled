package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZestMoney {
//    String = "1001110011110001"
//    op: 4
    public static int oneCount(String str) {
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int count = 0;
        while (start < str.length()){

             if (str.charAt(start) == '1') {
                 count++;
            }else {
                list.add(count);
                count = 0;
            }
             start++;
        }
        System.out.println(list);

        int max =0;
        for (int i =0; i < list.size(); i++){
            if(max<list.get(i)){
                max = list.get(i);
            }
        }
       return max;
    }

    public static int splitMethod(String str) {
        String[]  arr =  str.split("0");
        int max = Integer.MIN_VALUE;
        for (int i =0; i < arr.length; i ++) {
            if (arr[i].length()>max){
                max = arr[i].length();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(oneCount("1001110011110001"));
        System.out.println(splitMethod("1001110011110001"));
    }
}
