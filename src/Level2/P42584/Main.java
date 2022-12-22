package Level2.P42584;

public class Main {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        Solution solution = new Solution();
        int[] result = solution.solution(prices);
        for(int i : result) System.out.print(i + " ");
    }
}

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if(prices[i] > prices[j]) {
                    temp++;
                    break;
                }
                else temp++;
            }
            answer[i] = temp;
        }
        return answer;
    }
}

