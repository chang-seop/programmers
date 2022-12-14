package Level2.P12939;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "-1 -1";
        String result = solution.solution(s);
        System.out.println("result = " + result);
    }
}
class Solution {
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public String solution(String s) {
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            max = Math.max(max, Integer.parseInt(strings[i]));
            min = Math.min(min, Integer.parseInt(strings[i]));
        }
        return min + " " + max;
    }
}