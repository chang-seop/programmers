package Level2.P42626;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int result = solution.solution(scoville, k);
        System.out.println("result = " + result);
    }
}

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;

        // init
        for (int i : scoville) pq.add(i);

        while(pq.peek() <= K) {
            if(answer >= scoville.length - 1) {
                answer = -1;
                break;
            }
            Integer first = pq.poll();
            Integer second = pq.poll();
            pq.add(first + (second * 2));
            answer++;
        }
        return answer;
    }
}