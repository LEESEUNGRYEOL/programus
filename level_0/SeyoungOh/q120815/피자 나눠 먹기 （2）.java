class Solution {
    public int solution(int n){
        int answer = 0;
        int pizza = 6;
        answer=n*pizza;
        while (pizza != 0) {
            int q = n%pizza;
            n=pizza;
            pizza=q;
        }
        answer=answer/n;
        return answer/6;
    }
}