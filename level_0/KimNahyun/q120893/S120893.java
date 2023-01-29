package level_0.KimNahyun.q120893;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        //String(문자열)을 char형 배열로
        char[] carr = my_string.toCharArray();

        String t = "";
        //소문자 : 97~122 / 대문자 : 65~90
        for(int c=0; c<my_string.length(); c++){
            if(97<=carr[c] && carr[c]<=122){
                t = carr[c]+"";
                answer += t.toUpperCase();
            } else if(65<=carr[c]&&carr[c]<=90){
                t = carr[c]+"";
                answer += t.toLowerCase();
            }
        }

        return answer;
    }
}