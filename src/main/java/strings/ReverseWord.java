package strings;

public class ReverseWord {

    public static String reverseWord(String str) {
        String[] revStr = str.split(" ");
        int start = 0;
        int end = revStr.length-1;
        while (start < end) {
            String temp = revStr[start];
            revStr[start] = revStr[end];
            revStr[end] = temp;
            start++;
            end--;
        }
        String finalStr = "";
        for (int i =0; i < revStr.length; i++ ) {
            if (i < revStr.length-1){
                finalStr = finalStr + revStr[i] + " ";
            } else {
                finalStr = finalStr + revStr[i];
            }
        }
//        System.out.println(finalStr.length());
        return finalStr;
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("Nidhi Singh"));
    }
}
