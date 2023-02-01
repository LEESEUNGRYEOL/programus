package src.lv0.q120838;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        Map<String,String> map = new HashMap<>();
        map.put(".-","a");
        map.put("-...","b");
        map.put("-.-.","c");
        map.put("-..","d");
        map.put(".","e");
        map.put("..-.","f");
        map.put("--.","g");
        map.put("....","h");
        map.put("..","i");
        map.put(".---","j");
        map.put("-.-","k");
        map.put(".-..","l");
        map.put("--","m");
        map.put("-.","n");
        map.put("---","o");
        map.put(".--.","p");
        map.put("--.-","q");
        map.put(".-.","r");
        map.put("...","s");
        map.put("-","t");
        map.put("..-","u");
        map.put("...-","v");
        map.put(".--","w");
        map.put("-..-","x");
        map.put("-.--","y");
        map.put("--..","z");
        String[] arr = letter.split(" ");
        for (int i = 0; i < arr.length; i++) {
            sb.append(map.get(arr[i]));

        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {

        String n = ".... . .-.. .-.. ---";
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
