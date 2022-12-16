package Level1.P12916;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "pPoooyY";
        boolean result = solution.solution(s);
        System.out.println("result = " + result);
    }
}

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String temp;
        int a = 0, b = 0;

        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i) == 'p') || (s.charAt(i) == 'P')) a++;
            else if((s.charAt(i) == 'y') || (s.charAt(i) == 'Y')) b++;
        }
        if(a == b) return true;
        else return false;
    }
}