package Level2.P70129;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "110010101001";
        int[] arr = solution.solution(s);
        for(int i : arr) System.out.print(i + " ");
    }
}

class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        Stack<Integer> stack = new Stack<>();
        int deleteCount = 0;
        int whileCount = 0;
        while(!s.equals("1")) {
            stack.clear();
            int toBinaryCount = 0;
            // '1' 제거 후 옮기기
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '1') {
                    toBinaryCount++;
                } else {
                    // 뺀 0의 count
                    deleteCount++;
                }
            }

            // 길이를 이진수 변환 과정
            while(toBinaryCount > 1) {
                stack.add(toBinaryCount % 2);
                toBinaryCount = toBinaryCount / 2;
            }
            s = Integer.toString(toBinaryCount);

            int length = stack.size();
            for(int i = 0; i < length; i++) {
                s += stack.pop();
            }
            whileCount++;
        }
        answer[0] = whileCount;
        answer[1] = deleteCount;

        return answer;
    }
}