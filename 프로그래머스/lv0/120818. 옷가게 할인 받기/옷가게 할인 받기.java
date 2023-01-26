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