package KT;


import java.util.HashMap;
import java.util.Map;

//Input: s = "anagram", t = "nagaram"
//        Output: true
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i =0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int count = map.get(s.charAt(i));
                map.put(s.charAt(i), count+1);
            }
        }
        for (int j = 0; j < t.length(); j++) {
            if (map.containsKey(t.charAt(j))) {
                int count = map.get(t.charAt(j));
                count = count-1;
                if (count==0) {
                    map.remove(t.charAt(j));
                } else {
                    map.put(t.charAt(j), count);
                }
            }else {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagtram"));
    }

}


//public class checkValidAnagram {
//
//    public static boolean isValidAnadram (String s, String t){
//
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (int i=0; i<s.length(); i++){
//            if(!map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i), 1);
//            } else {
//                int count = map.get(s.charAt(i));
//                map.put(s.charAt(i), count+1);
//            }
//        }
//
//        for (int i=0; i<t.length(); i++){
//            if (map.containsKey(t.charAt(i))){
//                int count = map.get(t.charAt(i));
//                count = count - 1;
//                if (count == 0) {
//                    map.remove(t.charAt(i));
//                } else {
//                    map.put(s.charAt(i), count);
//                }
//            } else {
//                return false;
//            }
//        }
//        return true;
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isValidAnadram("ANAGRAM", "NAGTRAM"));
//    }
//}