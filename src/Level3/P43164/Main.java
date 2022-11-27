package Level3.P43164;

public class Main {
    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        //String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};

        Solution solution = new Solution();
        String[] answer = solution.solution(tickets);

        for (String s : answer) {
            System.out.print(s + " ");
        }
    }
}

class Solution {
    static boolean[] visited;
    static String[] answer = {};
    static int size;
    public String[] solution(String[][] tickets) {
        size = tickets.length;
        visited = new boolean[size];
        // 항상 ICN 공항에서 출발해야 한다.
        for(int i = 0; i < size; i++) {
            if(tickets[i][0].equals("ICN")) {
                dfs(i, 1, tickets, tickets[i][0]);
            }
        }
        return answer;
    }
    public void dfs(int index, int count, String[][] tickets, String cumulativeString) {
        // 체크인
        visited[index] = true;
        // 목적지인가
        if(count == size) {
            cumulativeString += " " + tickets[index][1];
            String[] strings =  cumulativeString.split(" ");

            if(answer.length == 0) answer = strings;
            else answer = compareSortName(answer, strings);
        }
        // 연결된 곳 순회하기
        for(int i = 0; i < size; i++) {
            // 갈 수 있는가
            if(!visited[i]) {
                if(tickets[index][1].equals(tickets[i][0])) {
                    // 간다
                    dfs(i, count + 1, tickets, cumulativeString + " " + tickets[index][1]);
                }
            }
        }
        // 체크아웃
        visited[index] = false;
    }
    public String[] compareSortName(String[] string1, String[] string2) {
        for (int i = 0; i < size; i++) {
            if(string1[i].equals(string2[i])) continue;
            // 모든 공항은 알파벳 대문자 3글자로 이루어진다.
            for (int j = 0; j < 3; j++) {
                if(string1[i].charAt(j) < string2[i].charAt(j)) return string1;
                else if(string1[i].charAt(j) > string2[i].charAt(j)) return string2;
            }
        }
        return string1;
    }
}