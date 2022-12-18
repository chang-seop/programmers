package Level2.P12953;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        Solution solution = new Solution();
        int result = solution.solution(arr);
        System.out.println("result = " + result);
    }
}

class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = lcm * arr[i] / gcd(lcm, arr[i]);
        }
        return lcm;
    }

    public int gcd (int a, int b) {
        if(b <= 0) return a;
        else return gcd(b, a % b);
    }
}