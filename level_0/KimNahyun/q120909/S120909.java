package level_0.KimNahyun.q120909;

class Solution {
    public int solution(int n) {
        return Math.pow((int)Math.sqrt(n),2)==n ?1:2;
    }

    public int solution2(int n) {
        int ms = (int)Math.sqrt(n);
        return ms*ms==n ?1:2;
    }

    // Math클래스 사용x
    public int solution3(int n) {
        int answer = 2;

        for(int i=1; i<n; i++){
            if(i*i==n){
                answer = 1;
            }
        }
        return answer;
    }
}


// java.lang.Math클래스의 sqrt() 메서드
// double형 값을 반환하기에 int형으로 형변환을 해줘야한다.
//