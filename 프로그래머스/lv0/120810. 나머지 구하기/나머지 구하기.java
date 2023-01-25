class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        boolean val = (num1>0&&num1<=100)&&(num2>0&&num2<=100);
        
        if(val){
            answer = num1%num2;
        }
        return answer;
    }
}