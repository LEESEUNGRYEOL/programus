package level_0.kanghyegwang.q120815;

public class solution120815 {
    public int solution(int n){
        int res = 1, p = 6, i = 1;
        while (true) {
            if ((i * p) % n == 0) {
                res = i;
                break;
            } else i++;
        }
        return res;
    }
}
