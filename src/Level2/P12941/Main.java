package Level2.P12941;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        Solution solution = new Solution();
        int result = solution.solution(A, B);
        System.out.println("result = " + result);
    }
}

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int[] aIndexArray = new int[1001];
        int[] bIndexArray = new int[1001];
        ArrayList<Integer> AList = new ArrayList<>();
        ArrayList<Integer> BList = new ArrayList<>();

        // 카운팅 정렬
        for(int i = 0; i < A.length; i++) {
            aIndexArray[A[i]]++;
            bIndexArray[B[i]]++;
        }

        for(int i = 0; i < 1001; i++) {
            if(aIndexArray[i] != 0) {
                int count = aIndexArray[i];
                while(count != 0) {
                    AList.add(i);
                    count--;
                }
            }
            if(bIndexArray[i] != 0) {
                int count = bIndexArray[i];
                while(count != 0) {
                    BList.add(i);
                    count--;
                }
            }
        }

        for (int i = 0, j = B.length - 1; i < AList.size(); i++, j--) {
            answer += AList.get(i) * BList.get(j);
        }

        return answer;
    }
}