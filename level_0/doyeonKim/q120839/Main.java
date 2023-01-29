package level_0.doyeonKim.q120839;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> rspMap = new HashMap<>();
        rspMap.put("2", "0");
        rspMap.put("0", "5");
        rspMap.put("5", "2");

        for (int i = 0; i < rsp.length(); i++) {
            sb.append(rspMap.get(String.valueOf(rsp.charAt(i))));
        }

        return sb.toString();
    }
}

/*
    가위, 바위, 보 경우마다 이길 수 있는 경우를 저장해두고
    rsp 에서 가위바위보가 나올 때 이기는 경우를 꺼내오자
    -> map 사용
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String rsp = "205";
        System.out.println(sol.solution(rsp));
    }
}
