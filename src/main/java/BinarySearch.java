import ForEach.ForEach;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static int  search(int[] arr, int a){
       int lower= 0;
       int higher= arr.length-1;
       while(lower<=higher){
           int midArray= lower+(higher-lower)/2;
           if(arr[midArray]==a){
               return midArray;
           }
           if(a<arr[midArray]){
               higher = midArray-1;
           }
           else if(a>arr[midArray]){
               lower = midArray+1;
           }
       }
       return -1;
    }

    public static void main(String[] args){
        System.out.println(search(new int[] {1,2,3,4}, 4));
        List <Integer> list = new ArrayList<>();
        list.add(12);
        list.add(3);
        list.add(16);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(12);
        list.add(3);
//        List<Integer> evenNumber = ForEach.evenNumber(list);
//        System.out.println(evenNumber);
//        List<Integer> evenNumber2 = ForEach.lambdaEvenNumber(list);
//        System.out.println(evenNumber2);
//        List<Integer> filter = ForEach.streamFilter(list);
//        System.out.println(filter);
//        List<String> stringFilter = ForEach.streamFilterInString(list);
//        System.out.println(stringFilter);
//        List<Integer> lambdafilter = ForEach.lambdaStreamFilter(list);
//        System.out.println(lambdafilter);
//        List<String> stringLambdafilter = ForEach.lambdaStreamFilterMap(list);
//        System.out.println(stringLambdafilter);
        List<String> tesy = ForEach.duplicateValueFilter(list);
        System.out.println(tesy);
    }


}
