package strings;

import java.util.HashSet;
import java.util.Set;

//
//Input: "hello"
//        Output: "holle"
public class ReverseVowelsOfAString {
    public static String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int start =0 ;
        int end= str.length-1;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        while(start<end){
            if(!set.contains(str[start])){
                start++;
                continue;
            }
            if(!set.contains(str[end])){
                end--;
                continue;
            }

            char temp = str[start];
            str[start]= str[end];
            str[end] = temp;
            start++;
            end --;

        }
        return new String(str);

    }

    public static boolean isVowel(char ch){
        if (ch == 'a' || ch =='A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
        || ch == 'U' || ch == 'u'){
            return true;
        }
        return false;
    }
     public static String vowelReverse(String str) {
        int start = 0;
        int end = str.length()-1;
        char[] charArr = str.toCharArray();
        while (start < end) {
            if (! isVowel(charArr[start])){
                start++;
                continue;
            }
            if (! isVowel(charArr[end])){
                end--;
                continue;
            }
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end]= temp;
            start++;
            end--;
        }
        return String.valueOf(charArr);
     }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
