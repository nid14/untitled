package Array;

import java.util.Arrays;

public class InstertValueInArr {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertX(4, new int[]{1, 2, 3, 4}, 8, 2)));
    }

    public static int[] insertX(int n, int arr[],
                                int x, int pos)
    {
        int i;

        // create a new array of size n+1
        int [] newArr = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till pos
        // then insert x at pos
        // then insert rest of the elements
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newArr[i] = arr[i];
            else if (i == pos - 1)
                newArr[i] = x;
            else
                newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}
