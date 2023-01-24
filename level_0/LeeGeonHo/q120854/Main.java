package level_0.LeeGeonHo.q120854;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strlist= {"We", "are", "the", "world!"};
        System.out.println(sol.solution(strlist));
    }
}

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i=0; i<strlist.length; i++){
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}