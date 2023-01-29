package level_0.hongyeseok.q12901;

public class q12901 {
    public static void main(String[] args) {

    }
}


class Solution{
    public String solution(int a, int b){
        String answer = "";
        int day = 0;
        for(int i = 1; i<a; i++){
            switch(i){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    day += 31;
                    break;
                case 2:
                    day+=29;
                    break;
                default:
                    day+=30;
            }
        }

        day = day+b;
        int what = day%7;
        switch(what){
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
            case 0:
                answer = "THU";
                break;
        }



        return answer;
    }

}