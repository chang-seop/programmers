package Level2.P12946;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] answer = solution.solution(2);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    static ArrayList<int[]> result;
    public int[][] solution(int n) {
        result = new ArrayList<>();

        hanoi(n, 1, 2, 3);

        int[][] answer = new int[result.size()][2];

        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < 2; j++) {
                answer[i][j] = result.get(i)[j];
            }
        }

        return answer;
    }

    public void hanoi(int n, int start, int temp, int end) {
        if(n == 1) {
            int[] values = {start, end};
            result.add(values);
        }
        else {
            hanoi(n - 1, start, end, temp);
            int[] values = {start, end};
            result.add(values);
            hanoi(n - 1, temp, start, end);
        }
    }
}