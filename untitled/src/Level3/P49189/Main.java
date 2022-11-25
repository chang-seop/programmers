package Level3.P49189;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 6;
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        System.out.print(solution.solution(n, edge));
    }
}
class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        boolean[] visited = new boolean[n + 1];
        int[] vCount = new int [n + 1];
        LinkedList<Integer>[] adjList = new LinkedList[n + 1];
        int max = Integer.MIN_VALUE;

        // 정점
        for(int i = 0; i <= n; i++) {
            adjList[i] = new LinkedList<>();
        }

        // 간선 입력
        for(int i = 0; i < edge.length; i++) {
            // 양방향
            adjList[edge[i][0]].add(edge[i][1]);
            adjList[edge[i][1]].add(edge[i][0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        // 1번 노드에서 출발
        queue.add(1);
        visited[1] = true;

        //bfs
        while(!queue.isEmpty()) {
            // 큐에서 가져오기
            int v = queue.poll();
            // 연결된 곳 순회
            for(int w : adjList[v]) {
                // 갈 수 있는가
                if(!visited[w]) {
                    // 체크인
                    // 인접 정점에 접근하면서 이전 정점의 count를 하나씩 증가시키는 방법
                    vCount[w] = vCount[v] + 1;
                    // vCount 최대값 구하기
                    max = Math.max(max, vCount[w]);
                    visited[w] = true;
                    // 큐에 넣기
                    queue.add(w);
                }
            }
        }

        for(int i = 1; i <= n; i++) {
            if(max == vCount[i]) {
                answer++;
            }
        }

        return answer;
    }
}