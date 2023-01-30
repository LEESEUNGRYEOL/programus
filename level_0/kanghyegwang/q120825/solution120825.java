class solution120825 {
    public String solution(String str, int n) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < n; j++) {       // n개만큼 반복문 돌리기
                res += str.charAt(i);
            }
        }
        return res;
    }

//    public String solution(String str, int n) {   repeat으로 반복문 돌리기
//        String res = "";
//        StringBuilder sb = new StringBuiler();
//        for (char x : str.toCharArray()) {
//            sb.append((x + "").repeat(n));
//        }
//        return sb.toString();
//    }

}