class Solution {
    public int solution(int[] array, int n) {
        
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                answer++;
            }
        }
        // 뭔가 쉬운방법이 있는데 안 떠오르네
        
        return answer;
    }
}