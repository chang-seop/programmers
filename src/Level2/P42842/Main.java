package Level2.P42842;

public class Main {
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;

        Solution solution = new Solution();
        int[] answer = solution.solution(brown, yellow);
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for(int y = 1, x = 1; y <= 2500 && x <= 2500;) {
            int comp;
            if((comp = findYellowBrown(y, x, yellow, brown)) == 1) {
                answer[0] = x;
                answer[1] = y;
                return answer;
            }
            if(comp == -1) y--;
            else if(comp == -2) x--;
            else if(comp == -3) {
                y++; x++;
            }
        }
        return answer;
    }

    public int findYellowBrown(int maxY, int maxX, int yellow, int brown) {
        int yellowCount = 0;
        int brownCount = 0;
        for(int y = 0; y < maxY; y++) {
            for(int x = 0; x < maxX; x++) {
                if(x == 0 || y == 0 || x == maxX - 1 || y == maxY - 1) {
                    brownCount++;
                } else {
                    yellowCount++;
                }
            }
        }
        if(yellowCount == yellow && brownCount == brown) return 1;
        else if(yellowCount > yellow) return -1;
        else if(brownCount > brown) return -2;
        else return -3;
    }
}