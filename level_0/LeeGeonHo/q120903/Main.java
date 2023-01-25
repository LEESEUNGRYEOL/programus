package level_0.LeeGeonHo.q120903;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] s1= {"a", "b", "c"};
        String[] s2 ={"com", "b", "d", "p", "c"};
        System.out.println(sol.solution(s1,s2));
    }
}

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<s1.length; i++){
            for(int j=0; j<s2.length; j++){
                if(s1[i].equals(s2[j])){
                    count++;
                }
            }
        }
        return answer=count;
    }
}