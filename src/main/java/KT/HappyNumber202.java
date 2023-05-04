package KT;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
    public static boolean happynum(int n) {
        Set<Integer> inLoop = new HashSet<>();
        int squareSum, remain;
        while (inLoop.add(n)) {
            squareSum = 0;
            while (n > 0) {
                remain = n % 10;
                squareSum += remain * remain;
                n /= 10;
            }
            if (squareSum == 1)
                return true;
            else
                n = squareSum;

        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(happynum(19));
    }

}
