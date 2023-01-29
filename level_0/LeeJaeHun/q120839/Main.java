package src.lv0.q120839;

class Solution {
    public String solution(String rsp) {
        String[] arr = rsp.split("");
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "2":
                    answer += "0";
                    break;
                case "0":
                    answer += "5";
                    break;
                case "5":
                    answer += "2";
                    break;
            }
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String rsp = "205";
        Solution solution = new Solution();
        System.out.println(solution.solution(rsp));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
