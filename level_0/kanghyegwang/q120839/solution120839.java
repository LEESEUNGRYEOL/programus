package level_0.kanghyegwang.q120839;

/*
가위 바위 보
문제 설명
가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때, rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.

제한사항
0 < rsp의 길이 ≤ 100
rsp와 길이가 같은 문자열을 return 합니다.
rsp는 숫자 0, 2, 5로 이루어져 있습니다.
입출력 예
rsp	        result
"2"	        "0"
"205"	    "052"
입출력 예 설명
입출력 예 #1

"2"는 가위이므로 바위를 나타내는 "0"을 return 합니다.
입출력 예 #2

"205"는 순서대로 가위, 바위, 보이고 이를 모두 이기려면 바위, 보, 가위를 순서대로 내야하므로 “052”를 return합니다.
 */

import java.util.Scanner;

public class solution120839 {
    public String solution(String str) {
        String res = "";
        for(char x : str.toCharArray()) {
            if(x=='2') res+="0";
            else if(x=='0') res+="5";
            else res+="2";
        }
        return res;
    }
    public String solution2(String str) {
        String res = "";
        int i = 0;
        while (i < str.length()) {
            switch (str.charAt(i++)) {
                case '0':
                    res += "5";
                    break;
                case '2':
                    res += "0";
                    break;
                case '5':
                    res += "2";
                    break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        solution120839 T = new solution120839();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        System.out.println(T.solution(a));
    }
}

/*
문자열의 숫자에 맞는 다른 숫자를 출력하는 문제
바위 = 0 가위 = 2 보 = 5
로 정해져있어서 주어진 숫자에서 이길수 있는 숫자를 출력하는 문제
 */