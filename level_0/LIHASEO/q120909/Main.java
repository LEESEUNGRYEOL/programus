package level_0.LIHASEO.q120909;

public class Main {
}

class Solution {
    public int solution(int n) {
        double result = Math.sqrt(n);
        if(result % 1 == 0) {
            return 1;
        }
        return 2;
    }
}
