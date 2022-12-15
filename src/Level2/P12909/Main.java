package Level2.P12909;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "(()(";
        boolean result = solution.solution(s);
        System.out.println("result = " + result);

    }
}

class Solution {
    static Stack<Character> stack;
    boolean solution(String s) {
        boolean answer = true;
        stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')') {
                if(stack.isEmpty()) {
                    answer = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()) answer = false;
        return answer;
    }
}