package Level1.P12932;

public class Main {
    public static void main(String[] args) {
        long n = 10000000000L;
        Solution solution = new Solution();
        int[] results = solution.solution(n);
        for(int i : results) System.out.print(i + " ");
    }
}

class Solution {
    public int[] solution(long n) {
        int[] answer = new int[Long.toString(n).length()];
        int i = 0;
        while(n > 0) {
            answer[i] = (int)(n % 10);
            n /= 10;
            i++;
        }
        return answer;
    }
}