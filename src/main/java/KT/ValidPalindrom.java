package KT;


//Input: "A man, a plan, a canal: Panama"
//        Output: true

import java.util.Arrays;

public class ValidPalindrom {
    public static boolean validPali(String str) {
        String t = str.toLowerCase();
        int start =0;
        int end = t.length()-1;
        while (start < end) {
            if (!Character.isLetter(t.charAt(start))){
                   start++;
                   continue;
               }
            if (!Character.isLetter(t.charAt(end))){
                end--;
                continue;
            }
            if (t.charAt(start)!=t.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        return true;

    }



//public class IsValidPalin {
//
//    public static boolean isValidPalindrom(String str) {
//
//        String s = str.toLowerCase();
//        int start = 0;
//        int end = str.length()-1;
//
//        while (start < end) {
//            if (!Character.isLetter(s.charAt(start))) {
//                start++;
//                continue;
//            }
//            if (!Character.isLetter(s.charAt(end))) {
//                end--;
//                continue;
//            }
//            if (s.charAt(start) != s.charAt(end)) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {

        System.out.println(validPali("A man, a plan, a canal: Panama"));
    }
}