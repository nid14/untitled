package strings;

//
//The length of both num1 and num2 is < 5100.
//        Both num1 and num2 contains only digits 0-9.
//        Both num1 and num2 does not contain any leading zero.
//        You must not use any built-in BigInteger library or convert the inputs to integer directly.
public class AddStrings {
    public String addStrings(String num1, String num2) {
        int m = num1.length() -1;
        int n = num2.length() -1;
        int carry = 0;
        String str ="";
        while(m>=0 || n>=0){
            int firstDigit = (m>=0)?(num1.charAt(m)-'0'): 0;
            int secondDigit = (n>=0)?(num2.charAt(n)-'0'): 0;
            int sum = carry+ firstDigit + secondDigit;
            carry = sum/10;
            int digit = sum%10;
            str = digit+str;
            m--;
            n--;
        }
        if(carry>0){
            return "1"+str;
        }
        return str;
    }

}
