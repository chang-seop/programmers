package Level2.P12924;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 15;
        int result = solution.solution(n);
        System.out.println("result = " + result);
    }
}

class Solution {
    public int solution(int n) {
        // 슬라이딩 윈도우
        int start = 1, end = 1, sum = 1, count = 0;
        while(start <= end) {
            if(sum == n) {
                count++;
                sum -= start++;
            }
            else if(sum < n) sum += ++end;
            else  sum -= start++;
        }
        return count;
    }
}