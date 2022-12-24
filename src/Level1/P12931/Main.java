package Level1.P12931;

public class Main {
    public static void main(String[] args) {
        int n = 123;
        Solution solution = new Solution();
        int result = solution.solution(n);
        System.out.println("result = " + result);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        String string = Integer.toString(n);
        for (int i = 0; i < string.length(); i++) {
            answer += string.charAt(i) - '0';
        }
        return answer;
    }
}