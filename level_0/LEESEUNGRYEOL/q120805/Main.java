package level_0.LEESEUNGRYEOL.q120805;

public class Main {
    public static void main(String[] args) {
        Soltuion sol = new Soltuion();
        int num1 = 100;
        int num2 = 2;
        int ans = sol.solution(num1, num2);
        System.out.println(ans);
    }
}

class Soltuion {
    public int solution(int num1, int num2) {
        return num1 / num2;
    }
}