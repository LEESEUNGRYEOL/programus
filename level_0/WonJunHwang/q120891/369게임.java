class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String[] nums = String.valueOf(order).split("");
        
        for(int i = 0; i < nums.length; i++) {
            
            if(nums[i].equals("3")) {
                answer++;
            
            } else if(nums[i].equals("6")) {
                answer++;
            
            } else if(nums[i].equals("9")) {
                answer++;
            }
            
        }
        
        return answer;
    }
}