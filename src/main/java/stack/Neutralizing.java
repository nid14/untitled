package stack;

import java.util.Stack;

public class Neutralizing {
    public static String stackNue(String str) {
        Stack<Character> stack = new Stack<>();
        String str1 = "";
        for (int i =0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (stack.empty()){
                stack.push(ch);
            } else if (ch == stack.peek()){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        while (!stack.empty()) {
            str1 =  stack.pop() + str1;
        }
        return str1;
    }

    public static void main(String[] args) {
        System.out.println(stackNue("aaacccbbcccd"));


    }
}
