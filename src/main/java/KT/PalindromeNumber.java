package KT;


//Example 1:
//        Input: 121
//        Output: true
//        Example 2:
//
//        Input: -121
//        Output: false
public class PalindromeNumber {
    public static boolean isPalindrom(int nums) {
        if(reverseNum(nums) == nums && nums>0) {
            return true;
        }
        return false;
    }

    private static int reverseNum(int num) {
        int revNum = 0;
        while (num!=0) {
            int remainder = num%10;
            int newNum = revNum*10 + remainder;
            revNum = newNum;
            num = num /10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(123));
    }
}

//public class IsPalindromNum {
//     public static boolean isPalin(int num) {
//
//         if (reverseNumber(num) == num && num > 0) {
//             return true;
//         }
//         return false;
//     }
//    private static int reverseNumber(int num) {
//
//        int revNum = 0;
//        while (num != 0) {
//            int remainder = num%10;
//            int newNum = revNum*10 + remainder;
//            revNum = newNum;
//            num = num/10;
//        }
//        return revNum;
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(isPalin(121));
//    }
//}