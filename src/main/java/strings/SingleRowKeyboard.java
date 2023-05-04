package strings;

import java.util.HashMap;
import java.util.Map;

public class SingleRowKeyboard {
//    Input: keyboard = "abcdefghijklmnopqrstuvwxyz", word = "cba"
//    Output: 4
//    Explanation: The index moves from 0 to 2 to write 'c' then to 1 to write 'b' then to 0 again to write 'a'.
//    Total time = 2 + 1 + 1 = 4.

    public static int keyboardIndex(String keyboard, String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i =0; i < keyboard.length(); i++) {
            map.put(keyboard.charAt(i), i);
        }
        int sum = map.get(word.charAt(0));
        for (int j =0; j < word.length()-1; j++) {
            int move = map.get(word.charAt(j));
            int nextMove = map.get(word.charAt(j+1));
            sum = sum + Math.abs(move - nextMove);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(keyboardIndex("abcdefghijklmnopqrstuvwxyz", "cba"));
    }



}
