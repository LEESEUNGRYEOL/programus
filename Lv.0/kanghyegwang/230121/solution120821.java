class solution120821 {
    public int[] solution(int[] n) {
        int len = n.length;             // 배열의 크기 및 반복문의 횟수를 저장
        int[] res = new int[len];       // 배열의 크기 지정
        for(int i = 0; i < len; i++) {
            res[i] = n[len-1-i];        // res 배열은 순서대로 매개변수로 받은 n배열은 역순으로
        }
        return res;
    }
}