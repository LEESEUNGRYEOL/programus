package level_0.doyeonKim.q120834;

class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] str = String.valueOf(age).split("");
        for (String s : str) {
            int idx = Integer.parseInt(s);
            sb.append(arr[idx]);
        }
        return sb.toString();
    }
}

/*
    0 = a, 1 = b, ... , 9 = j
    숫자가 나타내는 알파벳 값 -> arr 인덱스가 나타내는 문자 값
    int age -> split("") 사용하여 한글자씩 문자로 배열에 저장
    arr 인덱스 값에 숫자 넣어 값을 뽑는다.
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int age = 23;
        System.out.println(sol.solution(age));
    }
}
