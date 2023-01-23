class solution120841 {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0) {                   // x 가 +일때
            if (dot[1] > 0) answer = 1;     // y 가 + 면 1
            else answer = 4;                // y 가 - 면 4
        } else {                            // x 가 - 일때
            if (dot[1] > 0) answer = 2;     // y 가 + 면 2
            else answer = 3;                // y 가 - 면 3
        }
        return answer;
    }
}