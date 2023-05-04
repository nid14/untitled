package KT;


//Input: 123
////        Output: 321
public class ReverseInteger {
    public static int reverseInt(int num) {
        int newNum = 0;
        while (num!=0) {
            int remainder = num%10;
            int number = newNum*10 + remainder;
            newNum = number;
            num = num/10;
        }
        return newNum;
    }

    public static void main(String[] args)  {
        System.out.println(reverseInt(123));
    }

}
