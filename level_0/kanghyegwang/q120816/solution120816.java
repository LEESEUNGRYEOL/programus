class solution120816{
    public int solution(int s, int n) {
        return n%s == 0 ? n/s : n/s+1;
    }
}