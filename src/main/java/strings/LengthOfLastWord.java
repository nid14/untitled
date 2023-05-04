package strings;

//
//Input: "Hello World"
//        Output: 5
public class LengthOfLastWord {
    public static int lastWordCount(String str) {
        int p  = str.length()-1;
        int length = 0;
//        while (p >=0 && str.charAt(p)== ' ') {
//            p--;
//        }
        while (p >= 0 && str.charAt(p) != ' ') {
            p--;
            length++;
        }
        return length;
    }
    public static void main (String[] args) {
        System.out.println(lastWordCount("Hello World"));
    }
}
