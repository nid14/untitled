package ForEach;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ForEach {


//    public static void test() {
//
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < list.size(); i++) {
//            int a = list.get(i);
//        }
//
//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer, String bnc) {
//                int df = integer + 1;
//
//            }
//        });
//
//        abv(new Nidhi() {
//            @Override
//            public void test(Integer a, String b) {
//
//
//            }
//        });
//
//        abv((nm, lo) -> nm == 0);
//
//
//    }

    public static void abv(Nidhi nidhi) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Iterator b = map.entrySet().iterator();
        while (b.hasNext()) {
            Map.Entry entry = (Map.Entry) b.next();
            entry.getKey();
            entry.getValue();

        }


        List<Integer> list = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int finallist = (int) (it.next());
            list.add(finallist + 1);
        }
    }

    interface Nidhi {
        public boolean test(Integer a, String b);
    }

    public boolean evenOrOdd(int a) {
        return a % 2 == 0;
    }

    public static List<Integer> evenNumber(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if (integer % 2 == 0) {
                    result.add(integer);
                }
            }
        });


        return result;
    }

    public static List<Integer> lambdaEvenNumber(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        list.forEach(integer -> {
            if (integer % 2 == 0) {
                result.add(integer);
            }
        });


        return result;
    }


    public static List<Integer> streamFilter(List<Integer> list) {

        List<Integer> result = list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer > 10) {
                    return true;
                }
                return false;
            }

        }).collect(Collectors.toList());
        return result;
    }

    public static List<String> streamFilterInString(List<Integer> list) {
        List<String> result =
        list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer > 10) {
                    return true;
                }
                return false;
            }

        }).map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                String s = String.valueOf(integer);
                return s;
            }
        }).collect(Collectors.toList());
        return result;
    }

    public static List<Integer> lambdaStreamFilter(List<Integer> list) {

        List<Integer> result = list.stream().filter(integer -> {
            if(integer>10){
                return true;
            }
            return false;
        }).collect(Collectors.toList());
        return result;
    }

    public static List<String> lambdaStreamFilterMap(List<Integer> list) {
        List<String> result = list.stream().filter(integer -> {
            if(integer>10){
                return true;
            }
            return false;
        }).map(integer->{
            String s = String.valueOf(integer);
            return s;
        }).collect(Collectors.toList());
        return result;
    }


    public static List<String> integerList(List<Integer> list){
        List<String>  testResult = list.stream().filter(integer -> {
            if(integer>10){
                return true;
            }
            return false;
        }).map(integer -> {
            String n = String.valueOf(integer);
            return n;
        }).collect(Collectors.toList());
        return testResult;
    }

    public static List<String> duplicateValueFilter (List<Integer> test){
        Set<String> testResult = test.stream().filter(integer -> {
           if(integer%2==0){
               return true;
           }
           return false;
        }).map(integer -> {
            String nm = String.valueOf(integer);
            return nm;
        }).collect(Collectors.toSet());
        List<String> list = new ArrayList<>();
        for(String key:testResult){
            list.add(key);
        }
        return list;
    }







}
