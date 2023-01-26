class Solution {
    public int solution(int n) {
        int ms = (int)Math.sqrt(n);
        return ms*ms==n ?1:2;
    }
}