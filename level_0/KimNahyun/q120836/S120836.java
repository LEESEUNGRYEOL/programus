package level_0.KimNahyun.q120836;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer ++;
            }
        }
        return answer;
    }
}

// 순서쌍이 맞으면 쌍의 갯수(answer)가 1씩 늘어난다.
//