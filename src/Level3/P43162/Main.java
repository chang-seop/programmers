package Level3.P43162;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] computers= {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        int n = 3;
        Solution solution = new Solution();
        int result = solution.solution(n, computers);
        System.out.println("result = " + result);
    }
}
//union - find (서로소 집합)
class Solution {

    static int[] parent;
    public int solution(int n, int[][] computers) {
        parent = init(n);

        // 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < computers[i].length; j++) {
                if(i != j && computers[i][j] != 0) {
                    // 합치기
                    union(i, j);
                }
            }
        }

        ArrayList<Integer> compareList = new ArrayList<>();
        for (int i = 0; i < parent.length; i++) {
            int temp = 0;
            if(!compareList.contains(temp = find(parent[i]))) {
                // 루트 노드 값이 같지 않을 경우 add
                compareList.add(temp);
            }
        }
        return compareList.size();
    }

    public int[] init(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public int find(int x) {
        if(parent[x] == x) {
            // 루트 노드 번호로 자기 자신을 가진다.
            return x;
        } else {
            // 각 노드의 부모 노드를 찾아 올라간다.
            return find(parent[x]);
        }
    }

    public void union(int x, int y) {
        // 각 원소가 속한 트리의 루트 노드를 찾는다.
        x = find(x);
        y = find(y);
        // 루트 노드의 값을 이어준다.
        parent[y] = x;
    }
}