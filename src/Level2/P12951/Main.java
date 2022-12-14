package Level2.P12951;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "3people unFollowed me";
        String result = solution.solution(s);
        System.out.println("result = " + result);
    }
}

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] chars = s.toLowerCase().toCharArray(); // 소문자로 바꿔주고 char 배열로 저장
        boolean visited = true;
        for (int i = 0; i < s.length(); i++) {
            if(chars[i] == ' ') visited = true;
            else {
                if(chars[i] < 'A') visited = false;
                if(chars[i] >= 'A' && visited) {
                    chars[i] = Character.toUpperCase(chars[i]);
                    visited = false;
                }
            }
        }
        return String.valueOf(chars);
    }
}
