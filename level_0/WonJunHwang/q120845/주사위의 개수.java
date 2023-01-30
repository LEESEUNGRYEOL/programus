class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int width = box[0] / n;
        int height = box[1] / n;
        int depth = box[2] / n;
                        
        answer = width * height * depth;
        
        return answer;
    }
}