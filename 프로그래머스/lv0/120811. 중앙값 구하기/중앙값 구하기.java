import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int len = array.length/2;
        Arrays.sort(array);
        
        return array[len];
        
    }
}