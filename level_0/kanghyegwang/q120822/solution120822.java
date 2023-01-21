class solution120822 {
    public String solution(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res += str.charAt(str.length()-1-i);    // 문자열 res에 str을 역순으로 추가
        }
        return res;
    }
}