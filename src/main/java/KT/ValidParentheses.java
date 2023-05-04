package KT;

import java.util.Stack;

//        Input: s = "()"
//        Output: true
//        Input: s = "()[]{}"
//        Output: true
//        Input: s = "(]"
//        Output: false
public class ValidParentheses {
    public static boolean validPara(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return false;
                } else if  (ch == ')' && stack.peek() == '(' || ch == '}' && stack.peek() == '{' ||
                        ch == ']' && stack.peek() == '['){
                    stack.pop();

                } else {
                    return false;
                }

            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(validPara("()[]{"));
    }

}

//public class IsvalidParanthesis {
//
//    public static boolean isValParenthesis(String str) {
//
//        Stack<Character> stack = new Stack<>();
//
//        for (int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//
//             if (ch == '{' || ch == '[' || ch == '(') {
//                 stack.push(ch);
//             } else {
//                 if (stack.empty()) {
//                     return false;
//                 } else if (ch == '}' && stack.peek() == '{' || ch == ']' && stack.peek() == '[' || ch == '(' && stack.peek() == ')') {
//                     stack.pop();
//                 } else {
//                     return false;
//                 }
//             }
//        }
//        return stack.empty();
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(isValParenthesis("(){}{]"));
//    }
//}
