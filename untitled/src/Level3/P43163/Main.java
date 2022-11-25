package Level3.P43163;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        System.out.print(solution.solution(begin, target, words));
    }
}
class Solution {
    static boolean[] visited;
    static int min = 51;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length + 1];
        dfs(0, 0, begin, target, words);
        if(min == 51) return 0;
        else return min;
    }

    public void dfs(int node, int count, String string, String target, String[] words) {
        // 체크인
        visited[node] = true;
        // 목적지인가
        if(string.equals(target)) {
            min = Math.min(min, count);
        }

        // 연결된 곳 순회하기
        for(int i = 1; i <= words.length; i++) {
            // 갈 수 있는가
            if(!visited[i]) {
                // 간다
                if(stringCompare(string, words[i - 1]) == 1) {
                    dfs(i, count + 1, words[i - 1], target, words);
                }
            }
        }

        // 체크 아웃
        visited[node] = false;
    }

    public int stringCompare (String begin, String target) {
        int count = 0;
        for(int i = 0; i < begin.length(); i++) {
            if(count > 1) return 0;
            if(begin.charAt(i) != target.charAt(i)) {
                count++;
            }
        }
        // 중복되는 단어는 없다.
        return count;
    }
}