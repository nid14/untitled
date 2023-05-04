package KT;


import java.util.Arrays;

//Input: 2
//        Output: 1
//        Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
public class FibonacciNumber509 {
    public static int[] fib(int N) {
        if(N==0){
            return new int[]{};
        }
        int[] arr = new int[N+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<=N; i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fib(10)));
    }
}
