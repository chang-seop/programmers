package Level1.P12928;

public class Main {
    public static void main(String[] args) {
        int n = 12;
        Solution solution = new Solution();
        int result = solution.solution(n);
        System.out.println("result = " + result);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) answer += i;
        }
        return answer;
    }
}