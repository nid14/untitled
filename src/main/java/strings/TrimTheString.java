package strings;


//input : "    hello nidhi!! welcome    "
//output :

public class TrimTheString {
    public static String trimString(String s){
        char[] str = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        int count;
        for(int i = 0; i < s.length()-1; i++){
            if (str[i] != ' ') {
                start = i;
                break;
            }
        }
        for (int j= s.length()-1; j > start-1; j--) {
            if (str[j] != ' '){
                end = j;
                break;
            }
        }
        count = end- start +1;
        String result = new String(str, start, count);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(trimString("    hello nidhi!! welcome    "));
    }
}
