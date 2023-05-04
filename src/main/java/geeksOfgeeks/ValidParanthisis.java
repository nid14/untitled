package geeksOfgeeks;

import java.util.Stack;

//eg. ((alf)ls) – valid
//        )(dkk)() – invalid
// [()]{}{[()()]()}
public class ValidParanthisis {

    public static boolean validParm(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i =0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.empty()){
                    return false;
                }else if(ch == ')' && stack.peek() == '('){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(validParm(")(dkk)()"));
    }
}
