class solution120854{
    public int[] solution(String[] str){
        int[] res = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            res[i] = str[i].length();       // str배열의 길이값만 res배열에 저장
        }
        return res;
    }
}