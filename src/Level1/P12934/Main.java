package Level1.P12934;

public class Main {
    public static void main(String[] args) {
        long n = 121;
        Solution solution = new Solution();
        long result = solution.solution(n);
        System.out.println("result = " + result);
    }
}

class Solution {
    public long solution(long n) {
        long answer = 0;
        // 1 : 실수               2 : 정수
        if(Math.sqrt(n) == (long)Math.sqrt(n)) answer = (long)Math.pow(Math.sqrt(n) + 1, 2);
        else answer = -1;
        return answer;
    }
}