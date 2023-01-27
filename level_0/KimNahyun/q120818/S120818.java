package level_0.KimNahyun.q120818;

class Solution {
    public int solution(int price) {
        int answer = 0;

        if(price>=500000){
            answer = (int)(price*0.8f);
        } else if(price>=300000){
            answer = (int)(price*0.9f);
        } else if(price>=100000){
            answer = (int)(price*0.95f);
        } else {
            answer = price;
        }
        return  answer;
    }
}

// 메소드 선언부와 반환값의 자료형이 같아야하기 때문에 (int)로 형변환을 주었다.
// 코드는 순차적으로 실행기 되기 때문에 if문은 price가 큰 순으로 나열해야한다.
//