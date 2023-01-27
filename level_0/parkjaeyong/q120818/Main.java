package level_0.parkjaeyong.q120818;


class Solution {
    public int solution(int price) {
        int discount = price / 100000;
        if(discount == 0) return price;
        else if(discount < 3) return (int)(price * 0.95);
        else if(discount < 5) return (int)(price * 0.9);
        else  return (int)(price * 0.8);
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution(150_000);
        System.out.println(ans);
    }
}

