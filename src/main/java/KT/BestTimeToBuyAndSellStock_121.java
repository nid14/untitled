package KT;

//Input: [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Not 7-1 = 6, as
public class BestTimeToBuyAndSellStock_121 {
    public static int maxProfit(int[] nums) {
        int maxProfit = 0;
        for (int i =0; i < nums.length-1; i++) {
            for (int j =i+1; j < nums.length; j++) {
                int maxSell = nums[j]-nums[i];
                if ( maxSell> maxProfit) {
                    maxProfit = maxSell;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
    }
}


//public class BestTimeToSellAStock {
//
//    public static int maximumProfit (int[] stock) {
//
//        int maxProfit = 0;
//        for (int i=0; i<stock.length-1; i++) {
//            for (int j=i+1; j<stock.length; j++) {
//
//                int maxSell = stock[j] - stock[i];
//                if (maxProfit > maxSell) {
//                    maxProfit = maxSell;
//                }
//            }
//        }
//        return maxProfit;
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(maximumProfit(new int[]{7,1,5,3,6,4}));
//    }
//}