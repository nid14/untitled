package strings;

public class SplitAStringInBalancedStrings {
//    Input: s = "RLRRLLRLRL"
//    Output: 4
//    Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
//

    public static int splitString(String str) {
        int noR = 0;
        int noL = 0;
        int count = 0;
        for (int i =0; i < str.length(); i++) {
            if (str.charAt(i) == 'R') {
                noR ++;
            } else {
                noL++;
            }
            if (noR == noL) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(splitString("RLRRLLRLRLR"));
    }
}
