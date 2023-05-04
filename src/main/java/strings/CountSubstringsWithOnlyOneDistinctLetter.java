package strings;

//
//Input: S = "aaaba"
//        Output: 8
//        Explanation: The substrings with one distinct letter are "aaa", "aa", "a", "b".
//        "aaa" occurs 1 time.
//        "aa" occurs 2 times.
//        "a" occurs 4 times.
//        "b" occurs 1 time.
//        So the answer is 1 + 2 + 4 + 1 = 8.
public class CountSubstringsWithOnlyOneDistinctLetter {
    public static int countLetters(String S) {
        int count=0, repeat=1;
        for(int i=1;i<S.length();i++,repeat++){
            if(S.charAt(i) != S.charAt(i - 1)){
                count+=repeat*(repeat+1)/2;
                repeat=0;
            }
        }
        return count+repeat*(repeat+1)/2;
    }

    public static void main(String[] args) {
        System.out.println(countLetters("aaaba"));
    }
}
