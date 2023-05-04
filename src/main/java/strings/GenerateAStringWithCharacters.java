package strings;

import java.util.ArrayList;
import java.util.List;

//Input: n = 4
//        Output: "pppz"
//        Explanation: "pppz" is a valid string since the character 'p' occurs three times and the character 'z' occurs once. Note that there are many other valid strings such as "ohhh" and "love".
public class GenerateAStringWithCharacters {
    public static String generateTheString(int n) {
        List<Character> list = new ArrayList<>();
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i++) {
                list.add('a');
            }
            list.add('b');
        } else {
            for (int i = 0; i < n; i++) {
                list.add('a');
            }
        }
        String finalString = "";
        for (int j = 0; j < list.size(); j++) {
            finalString = finalString + list.get(j);

        }
        return finalString;
    }

    public static void main(String[] args) {
        System.out.println(generateTheString(4));
    }

}
