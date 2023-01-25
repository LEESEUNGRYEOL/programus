class solution120847{
    public int solution(int[] s) {
        int res = 0;
        Arrays.sort(s);                     // 받아온 배열의 요소를 오름차순 정령한다
        res = s[s.length-1]*s[s.length-2];  // 오름차순 정렬이기에 마지막 두요소가 가장 값이 큰 요소이다
        return res;
    }
}

/*
배열의 요소중 두개를 곱하여 가장 큰 수를 만들어 내는 문제이다
두요소의 곱중 가장 큰값을 구할수 있느냐 없느냐를 판별하는 문제인것 같고
나는 간단하게 Arrays클래스의 sort함수를 사용하여 오름차순 정렬이기에 마지막 두값을 곱한 값을 리턴했다
다른 방법으로는
int res = 0;
for (int i = 0; i < s.length-1; i++) {
    for (int j = i+1; j < s.length; j++)
        res = Math.max(res, s[i]*s[j]);
}
return res;
이런식으로 2중 for문을 돌려서 곱한 값을 하나씩 비교하는 방법이 있을것 같다
 */