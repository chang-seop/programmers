package Level2.P42586;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        Solution solution = new Solution();
        int[] result = solution.solution(progresses, speeds);
        for(int i : result) {
            System.out.print(i + " ");
        }
    }
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int work = progresses[i], day = 0;
            while(work < 100) {
                work += speeds[i];
                day++;
            }
            queue.add(day);
            arrayList.add(day);
        }

        arrayList.add(100);
        for (int i = 0, count = 0; i < progresses.length; i++) {
            if(queue.peek() >= arrayList.get(i)) {
                count++;
            }
            if(queue.peek() < arrayList.get(i + 1)) {
                result.add(count);
                for (int j = 0; j < count; j++) {
                    queue.poll();
                }
                count = 0;
            }
        }

        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}