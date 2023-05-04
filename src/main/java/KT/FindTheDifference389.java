package KT;


import javax.smartcardio.ATR;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Input:
////        s = "abcd"
////        t = "abcde"
////        Output:
////        e
public class FindTheDifference389 {
    public static char differenceChar(String s, String t) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        for (int j = 0; j < t.length(); j++) {
            if (!set.contains(t.charAt(j))){
                return t.charAt(j);
            }
        }
        return  'a';
    }

    public static char anotherWay(String s, String t) {
        Map<Character, Integer> mapC1 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(!mapC1.containsKey(s.charAt(i))){
                mapC1.put(s.charAt(i), 1);
            } else{
                int count = mapC1.get(s.charAt(i));
                count = count+1;
                mapC1.put(s.charAt(i), count);
            }

        }

        Map<Character , Integer> mapC2 = new HashMap<>();
        for (int j= 0; j<t.length(); j++){
            if(!mapC2.containsKey(t.charAt(j))){
                mapC2.put(t.charAt(j), 1);
            } else{
                int count = mapC2.get(t.charAt(j));
                count = count+1;
                mapC2.put(t.charAt(j), count);
            }


        }


        for (int n= 0; n<t.length(); n++){
            if(mapC1.containsKey(t.charAt(n))){
                int count1 = mapC1.get(t.charAt(n));
                int count2 = mapC2.get(t.charAt(n));

                if(count1!= count2){
                    return t.charAt(n);
                }


            } else{

                return t.charAt(n);
            }
        }

        return 'a';
    }

    public static void main(String[] args) {
        System.out.println(differenceChar("abcd", "cbade"));
    }
}
