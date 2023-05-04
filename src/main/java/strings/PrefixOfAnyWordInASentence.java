package strings;


//Input: sentence = "i love eating burger", searchWord = "burg"
//        Output: 4
//        Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
public class PrefixOfAnyWordInASentence {
    public static int prefixSearch(String sentence, String searchWord) {
        String[] sentenceCopy = sentence.split(" ");
        for (int i =0; i < sentenceCopy.length; i++) {
            String word = sentenceCopy[i];
            int index1 =0;
            int index2 =0;
            boolean prefix = true;
            while (index1 < searchWord.length() && index2 < word.length()) {
                if (searchWord.charAt(index1) != word.charAt(index2)) {
                    prefix =false;
                    break;
                } else {
                    index1++;
                    index2++;
                }
            }
            if (index1 == searchWord.length() && prefix) {
                return i+1;
            }

        }
        return -1;
    }
}
