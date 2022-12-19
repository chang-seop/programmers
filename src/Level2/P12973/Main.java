package Level2.P12973;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "baabaa";
        Solution solution = new Solution();
        int result = solution.solution(s);
        System.out.println("result = " + result);
    }
}

class Solution
{
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(stack.isEmpty()) stack.push(c);
            else if(stack.peek() == c) stack.pop();
            else stack.push(c);
        }

        return stack.isEmpty() ? 1 : 0;
    }
}