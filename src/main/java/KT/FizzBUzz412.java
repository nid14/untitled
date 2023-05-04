package KT;

import LinkList.ListNode;

import java.util.ArrayList;
import java.util.List;

//
//Write a program that outputs the string representation of numbers from 1 to n.
//        But for multiples of three it should output “Fizz” instead of the number and
//        for the multiples of five output “Buzz”. For numbers which are multiples of both three
//        and five output “FizzBuzz”.
public class FizzBUzz412 {

    public static List<String> fizzBuz(int num) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= num ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }

        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuz(7));
    }
}

//public class FizzBuz {
//
//    public static List<String> fizzbuzz(int number) {
//
//        List<String> list = new ArrayList<>();
//
//        for (int i=0; i<number; i++) {
//
//            if ()
//        }
//    }
//}
