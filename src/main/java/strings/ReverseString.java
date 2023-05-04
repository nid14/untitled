package strings;

//Input: ["h","e","l","l","o"]
//        Output: ["o","l","l","e","h"]



import java.util.Arrays;

public class ReverseString {
    public static char[] reverse(char[] str) {
        int start = 0;
        int end = str.length-1;
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end --;
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(reverse(new char[] {'h','e','l','l','o'}));
    }
}
