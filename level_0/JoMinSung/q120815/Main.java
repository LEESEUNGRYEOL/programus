package level_0.JoMinSung.q120815;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 6;
        int ans = sol.solution(n);
        System.out.println(ans);

    }
}
class Solution {
    public int solution(int n) {
        int pizza = 6;

        for (int i = 0; i < n; i++){
            if (pizza%n != 0){  // 이코드는 피자의 갯수가 맞아떨어지지 않았을때 밑에 코드를 실행하라는 뜻으로 잡음
                pizza += 6; // 위에 if문이 참일때 pizza갯수가 맞지 않다는거니 한판의 갯수 6조각을 계속 추가해주는 식으로 해야되서
            }
        }

        return pizza/6; // 몇판을 시켜야 되는지 표현 해야되는데 /6을 안하면 피자 조각의 개수를 변환함.
    }
}