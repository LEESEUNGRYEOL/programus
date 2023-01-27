package level_0.JoMinSung.q120836;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 50;
        int n = sol.solution(num);
        System.out.println(n);


    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++){
            if (n%i == 0) {
                answer++;
            }
            /*for (int j = 1; j <= n; j++) {
                if (i * j == n) {
                    answer++;
                }
            }*/ // 이게 원래 제가 짜본 코드인데 답은 나오는데 테스트에서 실패함
            // 팀원분께도 여쭤보고 들어보니 제한 사항이 있긴한데 이게 for문을 돌릴때 n값이 점점 커지면 찾아와야될 값도 많아지니 시간초과가 날수밖에 없음
        }
        return answer;
    }
}