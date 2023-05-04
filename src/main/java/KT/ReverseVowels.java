package KT;


import java.util.HashSet;
import java.util.Set;

//Input: "hello"
//        Output: "holle"
public class ReverseVowels {
    public static String reverseVowel(String s) {
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
    public static void main(String[] args) {
        System.out.println(reverseVowel("hello"));
    }


}
