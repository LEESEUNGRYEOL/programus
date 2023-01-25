package level_0.LEESEUNGRYEOL.q120956;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] babbling = new String[]{"aya", "yee", "u", "maa", "wyeoo"};
        int answer = sol.solution(babbling);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        String[] answer_list = new String[]{"aya", "ye", "woo", "ma" };
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("woo", "1");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("ma", "1");
            babbling[i] = babbling[i].replace("1", "");
            if(babbling[i].isEmpty()) {
                count = count + 1;
            }

        }
        return count;
    }
}
