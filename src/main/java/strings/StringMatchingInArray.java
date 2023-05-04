package strings;


import java.util.ArrayList;
import java.util.List;

//Input: words = ["mass","as","hero","superhero"]
//        Output: ["as","hero"]
//        Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
//        ["hero","as"] is also a valid answer.
public class StringMatchingInArray {
    public static List<String> serchSubstring(String[] str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        List<String> finalList = new ArrayList<>();
        for (int j = 0; j < list.size(); j++) {
            boolean match = false;
            for (int k = 0; k < list.size(); k++) {
                if (list.get(k).contains(list.get(j)) && j != k) {
                    match = true;
                }
            }
            if (match) {
                finalList.add(list.get(j));
            }
        }
        return finalList;
    }

    public static void main(String[] args) {
        System.out.println(serchSubstring(new String[] {"mass","as","hero","superhero"}));
    }

}
