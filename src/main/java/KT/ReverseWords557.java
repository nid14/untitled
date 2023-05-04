package KT;


//Input: "Let's take LeetCode contest"
//        Output: "s'teL ekat edoCteeL tsetnoc"
public class ReverseWords557 {
    public static String reverseString(String s) {
        String[] sChar = s.split(" ");
        String finalStr = "";
        for (int i =0; i < sChar.length; i++) {
            finalStr = finalStr + " " + reverseWord(sChar[i]);
        }
        return finalStr;
    }
    public static String stringBuider(String str) {
        StringBuilder sb = new StringBuilder();
        String[] strCopy = str.split(" ");
        for (int j =0; j < strCopy.length; j++) {
            String rev = reverseString(strCopy[j]);
            sb.append(rev);
            if (j < strCopy.length-1) {
            }
        }
        return sb.toString();
    }

    public static String reverseWord(String str) {
        String revStr = "";
        for (int i =str.length()-1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
        }
        return revStr;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Let's take LeetCode contest"));
        System.out.println(stringBuider("Let's take LeetCode contest"));
    }
}
