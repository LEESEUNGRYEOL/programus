class Solution {
    public int solution(int price) {
        int answer = 0;
        if (price >= 100000) {
            answer=19*price/20;
            if(price>=300000){
                answer=9*price/10;
                if(price>=500000){
                    answer=4*price/5;
                }
            }
        }
        else answer = price;
        return answer;
    }
}