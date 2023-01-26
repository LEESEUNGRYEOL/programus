package level_0.KimNahyun.q120956;

class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n>0){
            answer += (n%10);
            n /= 10;
        }
        return answer;
    }
}

// 정수 n의 1의자리수를 더하고 10으로 나눠 뒷자리부터 제거
//