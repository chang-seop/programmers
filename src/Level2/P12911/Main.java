package Level2.P12911;

public class Main {
    public static void main(String[] args) {
        int n = 78;
        Solution solution = new Solution();
        int result = solution.solution(n);
        System.out.println("result = " + result);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int nBinary = toBinaryCount(n);
        for(int i = n + 1; i < 1000001; i++) {
            if(toBinaryCount(i) == nBinary) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int toBinaryCount(int a) {
        int count = 0;
        while(a > 1) {
            if(a % 2 == 1) count++;
            a /= 2;
        }
        count++;
        return count;
    }
}
