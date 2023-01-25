class Solution {
    public int solution(int age) {
        int answer = 0;
        boolean ageValue = (age>0&&age<=120);
        
        if(ageValue){
            answer = 2022-age+1;
        }
        
        return answer;
    }
}