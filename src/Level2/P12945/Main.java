package Level2.P12945;

public class Main {
    public static void main(String[] args) {
        int n = 10000;
        Solution solution = new Solution();
        int result = solution.solution(n);
        System.out.println("result = " + result);
    }
}
class Solution {
    static int[] dp;
    public int solution(int n) {
        dp = new int[100001];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        return dp[n];
    }
}