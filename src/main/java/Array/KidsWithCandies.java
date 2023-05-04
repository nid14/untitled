package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
//    Input: candies = [2,3,5,1,3], extraCandies = 3
//    Output: [true,true,true,false,true]

    public static List<Boolean> candies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxCandies = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        for (int j = 0; j < candies.length; j++) {
            if ((candies[j]+extraCandies) >= maxCandies) {
                list.add(true);
            }else {
                list.add(false);
            }
        }
        return list;
    }

    public static void main(String[] arge){
        System.out.println(candies(new int[] {2,3,5,1,3}, 3));

    }

}
