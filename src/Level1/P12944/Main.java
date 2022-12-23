package Level1.P12944;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,5};
        Solution solution = new Solution();
        double result = solution.solution(arr);
        System.out.println("result = " + result);
    }
}

class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for(int i : arr) sum += i;
        return (double)sum / arr.length;
    }
}