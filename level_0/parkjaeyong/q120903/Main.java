package level_0.parkjaeyong.q120903;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer=0;
        for(String s : s1){
            for(String ss : s2){
                if(s.equals(ss)){
                    answer++; break;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int slice = 7;
        int n = 10;
        int ans = sol.solution(new String[]{"a", "b", "c"},new String[]{"com", "b", "d", "p", "c"});
        System.out.println(ans);

    }
}

