package stack;

import java.util.Stack;

public class validParathisis {
    public static boolean validParath(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return false;
                } else if ((ch == ')' && stack.peek() == '(') ||
                        (ch == ']' && stack.peek() == '[') ||
                        (ch == '}' && stack.peek() == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static boolean isValidExtraChar(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch == '['){
                stack.push(ch);
            }else if(ch == ')' || ch=='}' || ch==']'){
                if(stack.empty()){
                    return false;
                }else if(ch == ')' && stack.peek() == '(' ||
                        ch == '}' && stack.peek()=='{' ||
                        ch == ']' && stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }

        }
        return stack.empty();
    }

    public static void main(String[] arge){
        System.out.println(validParath("([{"));
        System.out.println(isValidExtraChar("(a{d{c}})"));

    }
}
