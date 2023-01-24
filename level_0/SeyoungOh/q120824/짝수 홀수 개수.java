class Solution {
    public int[] solution(int[] num_list) {
        int[] answer ={};
        int e=0,o=0;
        for (int i : num_list) {
            if (i%2==0) e++;
            else o++;
        }
        answer = new int[]{e, o};
        return answer;
    }
}