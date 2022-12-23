package Level2.P12913;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        int result = solution.solution(land);
        System.out.println("result = " + result);
    }
}


class Solution {
    int solution(int[][] land) {
        int answer = 0;
        for(int i = 0; i < land.length - 1; i++) {
            land[i + 1][0] += maxFunc(land[i][1], land[i][2], land[i][3]);
            land[i + 1][1] += maxFunc(land[i][0], land[i][2], land[i][3]);
            land[i + 1][2] += maxFunc(land[i][0], land[i][1], land[i][3]);
            land[i + 1][3] += maxFunc(land[i][0], land[i][1], land[i][2]);
        }
        for(int temp : land[land.length - 1]) answer = Math.max(answer, temp);
        return answer;
    }

    static int maxFunc(int a, int b, int c) {
        return (a > b) ? (a > c ? a : c) : (b > c ? b : c);
    }
}