class solution120903 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String a : s1) {
            for (String b : s2) {
                if (a.equals(b)) answer++;      // for each사용해서 s1과 s2의 요소를 equals로 비교
            }
        }
        return answer;
    }
}