class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0 ;
        int secMax = 0;
        int idx = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max) {
                max = numbers[i];
                idx = i;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>secMax && i!=idx) secMax=numbers[i];
        }
        answer=max*secMax;
        return answer;
    }
}