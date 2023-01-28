class solution120824 {
    public int[] solution(int[] nlist) {
        int[] res = new int[2];
        int even = 0, odd = 0;
        for (int i = 0; i < nlist.length; i++) {
            if (nlist[i]%2 == 0) even++;            // 짝수면 even + 1
            else odd++;                             // 홀수면 odd + 1
        }
        res[0] = even;          // even 에 짝수의 갯수
        res[1] = odd;           // odd 에 홀수의 갯수
        return res;
    }

    public static void main(String[] args) {
        solution120824 T = new solution120824();

    }
}