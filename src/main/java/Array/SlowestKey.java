package Array;


// releaseTimes = [9, 29, 49, 50], keyPressed = "cbcd"
//Output : "c"
public class SlowestKey {
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        for(int i = releaseTimes.length-1; i >=1; i--) {
            releaseTimes[i] = releaseTimes[i] - releaseTimes[i-1];
        }
        int maxTime = 0;
        char c = '0';
        for(int i = 0; i <releaseTimes.length; i++) {
            if (releaseTimes[i] > maxTime){
                maxTime = releaseTimes[i];
                c = keysPressed.charAt(i);
            } else if (releaseTimes[i] == maxTime) {
                if (keysPressed.charAt(i) > c){
                    c = keysPressed.charAt(i);
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(slowestKey(new int[] {9, 29, 49, 50}, "cbcd"));
    }
}
