import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < tokens.length; i++) {

            String ch = tokens[i];

            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")) {
                stack.push(Integer.parseInt(ch));
            } 
            else {
                int b = stack.pop();
                int a = stack.pop();

                if(ch.equals("+")) stack.push(a + b);
                else if(ch.equals("-")) stack.push(a - b);
                else if(ch.equals("*")) stack.push(a * b);
                else stack.push(a / b);
            }
        }

        return stack.pop();
    }
}
