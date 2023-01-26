package level_0.LeeGeonHo.q120898;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String message = "happy birthday!";
        System.out.println(sol.solution(message));
    }
}

class Solution{
    public int solution(String message){
        int answer = 0;
        answer = message.length()*2;
        return answer;
    }
}