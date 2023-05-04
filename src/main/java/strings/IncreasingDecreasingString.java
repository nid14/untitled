package strings;

public class IncreasingDecreasingString {

    public String sortString(String s) {
        int[] freq = new int[26];
        int len= s.length();
        for (int i = 0; i < len; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder(len);
        int count = 0;
        while (count < len) {

            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    sb.append((char) (i + 'a'));
                    freq[i] = freq[i] - 1;
                    count++;
                }
            }

            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    sb.append((char) (i + 'a'));
                    freq[i] = freq[i] - 1;
                    count++;
                }
            }
        }
        return sb.toString();
    }
}
