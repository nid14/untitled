package KT;


import java.util.Arrays;

//Input:  [1,2,3,4]
//        Output: [24,12,8,6]
public class ProductOfArrayExceptSelf238 {
    public static int[] productArray(int[] arr) {
        int product = 1;
        for (int i =0; i < arr.length; i++) {
            product = product * arr[i];
        }
        int[] arrFinal = new int[arr.length];
        for (int j =0; j < arr.length; j++) {
            arrFinal[j] = product/arr[j];
        }
     return arrFinal;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productArray(new int[] {1,2,3,4})));
    }
}
