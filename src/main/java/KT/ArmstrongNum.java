package KT;


//Input: 153
//        Output: true
//        Explanation:
//        153 is a 3-digit number, and 153 = 1^3 + 5^3 + 3^3.
public class ArmstrongNum {
    public static boolean armstrong(int num) {
        int lenOfNum = Integer.toString(num).length();
        int temp = num;
        int numberQueue = 0;
        while (temp!=0) {
            int remainder = temp%10;
            numberQueue = (int) (numberQueue + Math.pow(remainder, lenOfNum));
            temp = temp/10;
        }
        System.out.println(numberQueue);
        if (numberQueue==num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(armstrong(153));
    }
}
