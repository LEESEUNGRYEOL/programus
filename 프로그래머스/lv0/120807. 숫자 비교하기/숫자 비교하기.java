class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        if((num1>=0&&num1<=10000)&&(num2>=0&&num2<=10000)){
            answer = ((num1 == num2) ? 1:-1);
        }
        return answer;
    }
}