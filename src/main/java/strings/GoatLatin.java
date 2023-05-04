package strings;

//Example 1:
//
//        Input: "I speak Goat Latin"
//        Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
public class GoatLatin {

    public static String goatLatin(String str) {
        String[] strCpy = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < strCpy.length; i++) {
            if (isVowel(strCpy[i])) {
                stringBuilder.append(strCpy[i]).append("ma");
            } else {
                stringBuilder.append(isConsonant(strCpy[i])).append("ma");
            }
            for (int j =0; j <= i; j++) {
                stringBuilder.append("a");
            }

            if (i < strCpy.length-1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    private static boolean isVowel(String s) {
        if (s.charAt(0) == 'A' || s.charAt(0) == 'E' || s.charAt(0) == 'I' || s.charAt(0) == 'O'
                || s.charAt(0) == 'U' || s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i'
                || s.charAt(0) == 'o' || s.charAt(0) == 'u') {
            return true;
        }
        return false;
    }

    private static String isConsonant(String c) {
        String rs = "";
        for (int i = 1; i < c.length(); i++) {
            rs = rs + c.charAt(i);
        }
        return rs + c.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(goatLatin("I speak Goat Latin"));
    }
}
