package KT;


import java.util.HashMap;
import java.util.Map;


public class FirstUniqueCharacter387 {
    public static int uniqueChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), count + 1);
            }
        }
        for (int j = 0; j < str.length(); j++) {
            if (map.containsKey(str.charAt(j))) {
                int count = map.get(str.charAt(j));
                if (count == 1) {
                    return j;
                }
            }
        }
        return -1;
    }

    public static int anotherWay(String str) {
        if (str ==null && str.length()==0) {
            return -1;
        }

        int[] charCount = new int[26];
        for (int i =0; i < str.length(); i++) {
            charCount[str.charAt(i)- 'a']++;
        }

        for (int i =0; i < str.length(); i++) {
            if (charCount[str.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(uniqueChar("leetcode"));
        System.out.println(uniqueChar("loveleetcode"));
        System.out.println(anotherWay("leetcode"));
    }
}

//public class FindFirstUniqueChar {
//
//    public static int firstUniqueChar(String str) {
//
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (int i=0; i<str.length(); i++) {
//            if (!map.containsKey(str.charAt(i))) {
//                map.put(str.charAt(i), 1);
//            } else {
//                int count = map.get(str.charAt());
//                map.put(str.charAt(i), count+1);
//            }
//        }
//
//        for (int i=0; i<str.length(); i++) {
//
//            if (map.containsKey(str.charAt(i))) {
//
//                int count = map.get(str.charAt(i));
//                if (count == 1) {
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(firstUniqueChar("nidhi"));
//    }
//}