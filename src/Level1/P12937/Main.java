package Level1.P12937;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String result1 = solution.solution(3);
        System.out.println("result1 = " + result1);

        String result2 = solution.solution(4);
        System.out.println("result2 = " + result2);
    }
}

class Solution {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0) answer = "Even";
        else answer = "Odd";
        return answer;
    }
}