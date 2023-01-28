package level_0.LeeGeonHo.q120851;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "aAb1B2cC34oOp";
        System.out.println(sol.solution(my_string));
    }
}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.replaceAll("[a-zA-Z]","").split("");

        for(int i=0; i<arr.length; i++){
            answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }
}