import java.util.stream.Stream;
import java.util.Arrays;
class Solution {
    public int solution(int n) {
       return Arrays.stream(Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray()).sum();
    }
}