import java.util.Arrays;
class Solution {
    public static int solution(String before, String after) {
        String[] bef = before.split("");
        String[] aft = after.split("");
        Arrays.sort(bef);
        Arrays.sort(aft);
        if(Arrays.equals(bef, aft)) return 1;
        else return 0;
    }
}