package level_0.LeeGeonHo.q120956;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(sol.solution(babbling));
    }
}

class Solution {
    public int solution(String[] babbling) {
        int answer=0;
        for(int i =0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("woo", "1");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("ma", "1");
            babbling[i] = babbling[i].replace("1", "");
            if(babbling[i].isEmpty()) {
                answer = answer + 1;
            }
        }
        return answer;
    }
}