package Level1.P12954;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        Solution solution = new Solution();
        long[] result = solution.solution(x, n);
        Arrays.stream(result)
                .forEach(res -> System.out.print(res + " "));
    }
}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= n; i++) {
            long temp = (long) i * x;
            answer[i - 1] = temp;
        }
        return answer;
    }
}