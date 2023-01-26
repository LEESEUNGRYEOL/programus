class Solution {
    public int[] solution(int n) {
        
        int[] answer;
        
        if(n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }
        
        int index = 0;
        
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 1) {
                answer[index] = i;
                index++;
            }
        }       
        
        return answer;
    }
}