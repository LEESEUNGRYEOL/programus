class Solution {
    public int solution(int n) {
       
        int answer = 0;
        
//         String number = String.valueOf(n);

//         char[] numberArr = number.toCharArray();

//         for (int i = 0; i < numberArr.length; i++) {
//             answer += numberArr[i];
//         }       
       
        while(n > 0) {
            
            answer += n % 10;
            n /= 10;
        
        }
        
        return answer;
    }
}