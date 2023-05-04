package strings;

import java.util.Arrays;

public class ReplaceCharacterByOtherCharacter {
    public static String replaceChar(String s){
        char[] charArr = s.toCharArray();
        for (int i = 0 ; i < charArr.length; i++) {
            if (charArr[i] == 'o' || charArr[i] == 'O'){
                charArr[i] = 'Y';
            }
        }
        String finalstr = "";
        for (int j = 0 ; j < charArr.length; j++) {
            finalstr = finalstr + charArr[j];
        }
        return finalstr;

    }

    public static void main(String[] args) {
        System.out.println(replaceChar("  testo nodif hidtho oO"));
    }
}
