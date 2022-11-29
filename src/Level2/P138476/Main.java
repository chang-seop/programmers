package Level2.P138476;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[]  tangerine = {1, 1, 1, 1, 2, 2, 2, 3};
        int k = 2;
        Solution solution = new Solution();
        int a = solution.solution(k, tangerine);
        System.out.print(a);
    }
}

class Solution {
    public int solution(int k, int[] tangerine) {
        int[] dp = new int[10000001];
        PriorityQueue<Tangerine> pq = new PriorityQueue<>();

        for (int i = 0; i < tangerine.length; i++) {
            dp[tangerine[i]]++;
        }
        for (int i = 1; i <= 10000000; i++) {
            if(dp[i] == 0) continue;
            pq.add(new Tangerine(i, dp[i]));
        }

        int box = 0;
        int kind = 0;
        int answer = 0;
        while(!pq.isEmpty()) {
            Tangerine t = pq.poll();
            box += t.count;
            kind++;
            if(k <= box)  {
                answer = kind;
                break;
            }
        }

        return answer;
    }
}
class Tangerine implements Comparable<Tangerine> {
    int value;
    int count;

    public Tangerine(int value, int count) {
        this.value = value;
        this.count = count;
    }

    @Override
    public int compareTo(Tangerine o) {
        return o.count - this.count;
    }
}