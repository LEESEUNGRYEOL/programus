class solution120889 {

    public int solution(int[] sides) {                  // 작은 두 변의 합이 가장 큰 변의 길이보다 커야 삼각형이 가능
        Arrays.sort(sides);                             // 세변의 길이를 오름차순 정령
        return sides[0]+sides[1] > sides[2] ? 1 : 2;    // 작은 두변의 길이의 합이 큰변의 길이보다 큰지 삼항연산자로 계산
    }
}

/*
가장 큰변의 길이와 작은 두 변의 길이를 구할 수 있는지를 구하는 문제라고 생각
나는 Arrays클래스의 sort함수를 사용해서 정렬을 한 후 구했지만
다른 방법들도 있을것이다
프로그래머스의 다른사람의 풀이를 보면 내가 보기에 가장 간단하게 생각한 방법은 이것이다
int A = sides[0] + sides[1];
int B = sides[1] + sides[2];
int C = sides[0] + sides[2];
이런식으로 두 변의 합을 구한후
if(A <= sides[2] || B <= sides[0] || C <= sides[1]) return 2;
else return 1;
밑의 조건식을 사용하여 삼각형이 만들어 지는지 안되는지 확인하여 리턴한다
 */