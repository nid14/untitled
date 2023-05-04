package mergeSort;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int l, int r){
        if(l < r ){
            //middle point
            int m= l + (r-l)/2;

            // sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            // merge the sorted halves
            merge(arr, l, m, r);
        }

    }

    public static void merge(int[] arr, int l, int m, int r){
        //size of two
        int n1 = m - l + 1;
        int n2 = r - m;
        // Create temp array

        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy data to temp Array
        for(int i =0; i<n1; i++){
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++){
            R[j] = arr[m +1 +j];
        }

        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
        int i =0;
        int j =0;

        //initial index of merged subarray array
        int k= l;
        while (i < n1 && j< n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            } else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        /* Copy remaining elements of R[] if any */

        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }


    }

    public static void main(String [] arge){
        int arr[] = {12, 11, 13,5, 6, 7};
        mergeSort(arr,0, arr.length-1);
        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));
    }




}
