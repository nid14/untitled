package KT;

//Input: [3, 2, 1]
//        Output: 1
public class ThirdMaximumNumber414 {
    public static int maxNum(int[] arr) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        for (Integer num : arr) {
            if (num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)) {
                continue;
            }
            if (max == null || num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;

            }
            if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;

            }
            if (thirdMax == null || num > thirdMax) {
                thirdMax = num;

            }
        }
        if (thirdMax == max) {
            return max;
        }
        return thirdMax;
    }

    public static void main(String[] args) {
        System.out.println(maxNum(new int[]{2, 2, 3, 1}));
    }
}
