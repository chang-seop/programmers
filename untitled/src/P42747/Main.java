package P42747;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] citations = {3, 0, 6, 1, 5};

        System.out.print(solution.solution(citations));
    }
}
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] array = new Integer[citations.length];
        for(int i = 0; i < citations.length; i++)
            array[i] = Integer.valueOf(citations[i]);
        Arrays.sort(array);

        for(int i = 0; i < array.length; i++) {
            int h = array.length - i;
            if(array[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }
}