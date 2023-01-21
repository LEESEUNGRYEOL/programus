class solution120814 {
    public int solution(int n) {
        int res = 1;
        while(true) {
            if(n <= 7) {
                break;
            } else {
                n -= 7;
                res++;
            }
        }
        return res;
    }
}