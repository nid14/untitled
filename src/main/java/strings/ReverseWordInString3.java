package strings;

//Input: "Let's take SdetCode contest"
//        Output: "s'teL ekat edoCtedS tsetnoc"
public class ReverseWordInString3 {
    public static String reverseWordInString(String str) {
        String[] strCopy = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0; i < strCopy.length; i++) {
            String revS = revString(strCopy[i]);
            stringBuilder.append(revS);
            if (i < strCopy.length-1) {
                stringBuilder.append(" ");
            }

        }
        return stringBuilder.toString();
    }
    public static String revString(String s) {
        String sr = "";
        for (int i =s.length()-1; i >=0; i--) {
            sr = sr + s.charAt(i);
        }
        return sr;
    }

    public static void main (String[] args) {
        System.out.println(reverseWordInString("Let's take LeetCode contest"));
    }

}
