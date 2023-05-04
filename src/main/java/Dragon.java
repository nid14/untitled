import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dragon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        String str = scanner.nextLine();
//        System.out.println(str);
//
//        String test = scanner.nextLine();
//        System.out.println(test);
//        String[] arr = test.split(",");
//        int[] resultArr = new int[arr.length];
//        for(int i=0; i<arr.length; i++){
//            int num =Integer.parseInt(arr[i]);
//            resultArr[i] = num;
//        }
//        System.out.println(Arrays.toString(resultArr));
//        System.out.println("Enter count :");
//        int count =scanner.nextInt();
//        int[] arr = new int[count];
//        for(int i = 0; i<count; i++){
//            arr[i]= scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
        input();
//        inputAng();
    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of TestCases :");
        int testcases = scanner.nextInt();
        for (int i = 0; i < testcases; i++) {
            int balls = scanner.nextInt();
            int[] ballsArr = new int[balls];
            for (int j = 0; j < ballsArr.length; j++) {
                ballsArr[j] = scanner.nextInt();
            }
            System.out.println(destroyBalls(ballsArr));
            System.out.println(Arrays.toString(ballsArr));
        }

    }

    public static void inputAng() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str = scanner.nextLine();
        System.out.println("Enter second string: ");
        String str2 = scanner.nextLine();
        System.out.println(isAnagram(str, str2));

    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if (!map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), 1);
            } else {
                int count = map.get(str1.charAt(i));
                map.put(str1.charAt(i), count + 1);
            }
        }
        for (int j = 0; j < str2.length(); j++) {
            if (map.containsKey(str2.charAt(j))) {
                int count = map.get(str2.charAt(j));
                count = count - 1;
                if (count == 0) {
                    map.remove(str2.charAt(j));
                } else {
                    map.put(str2.charAt(j), count);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean destroyBalls(int[] color) {
        int size = color.length;
        while (size > 0) {
            int count = 0;
            for (int i = 0; i < color.length; i++) {
                if (color[i] == size) {
                    count++;
                }
            }
            if (count == 0) {
                return false;
            }
            size = size - count;
        }
        return true;
    }


}
