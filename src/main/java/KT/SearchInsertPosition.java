package KT;

//
//Input: [1,3,5,6], 5
//        Output: 2
public class SearchInsertPosition {
    public static int searchPosition(int[] arr, int num) {
        int start = 0;
        while (start < arr.length){
            if (arr[start] >= num){
                return start;
            }
            start++;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(searchPosition(new int[] {1,3,5,6}, 6));
    }
}
