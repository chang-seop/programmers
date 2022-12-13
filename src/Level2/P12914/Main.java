package Level2.P12914;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        Solution solution = new Solution();
        long result = solution.solution(n);
        System.out.println("result = " + result);
    }
}
class Solution {
    static int[] dp;
    public long solution(int n) {
        dp = new int[2000];
        return function(n);
    }

    static int function(int n) {
        if(n < 1) return 1;
        if(n == 2) return 2;
        if(dp[n] != 0) return dp[n];
        else return dp[n] = (function(n - 1) + function(n - 2)) % 1234567;
    }
}