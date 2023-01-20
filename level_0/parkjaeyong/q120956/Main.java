package level_0.parkjaeyong.q120956;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] caseStr = {"aya", "ye", "woo", "ma"};
        for(String str : babbling){
            for(String str2 : caseStr){
                str = str.replace(str2," ");
            }
            if(str.strip().length() == 0) answer++;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int slice = 7;
        int n = 10;
        int ans = sol.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});
        System.out.println(ans);

    }
}

