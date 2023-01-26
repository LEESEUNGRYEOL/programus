class Solution {
    public int solution(int angle) {
        int answer = 0;
        boolean acute = angle>0 && angle < 90;
        boolean right = angle == 90;
        boolean obtuse = angle > 90 && angle < 180;
        boolean flat = angle == 180;
        
        if(acute){
            answer = 1;
        }
        else if(right){
            answer = 2;
        }
        else if(obtuse){
            answer = 3;
        }
        else if(flat){
            answer = 4;
        }
        
        return answer;
    }
}