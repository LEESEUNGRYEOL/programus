class Solution {
    public int solution(int n, int k) {
        for(int i=10; i<=n; i+=10){
            k--;
        }
        return n*12000+k*2000;
    }
}