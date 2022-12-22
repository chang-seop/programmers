package Level2.P12899;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int n = 1; n <= 6; n++) {
            String result = solution.solution(n);
            System.out.println(result);
        }
    }
}

class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        char[] chars = {'4', '1', '2'};
        while(n > 0) {
            answer.insert(0, chars[n % 3]);
            if(n % 3 == 0) n = (n / 3) - 1;
            else n /= 3;
        }
        return answer.toString();
    }
}