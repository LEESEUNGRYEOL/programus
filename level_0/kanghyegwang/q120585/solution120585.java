class solution120585 {
    public int solution(int[] a, int n) {
        int res = 0;
        for (int x : a) {
            if (x > n) res++;
        }
        return res;
    }

    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > height) answer++;
        }
        return answer;
    }
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            answer += array[i] > height ? 1 : 0;
        }
        return answer;
    }
}

/*
이 문제는 배열의 요소 하나하나의 접근하는 방법을 아는지와
그 요소와 주어진 값을 비교해서 카운트를 세는 방법을 아는지 모르는지를 물어보는 문제인거같다
가장 기초적인 for문을 사용해서 만들 수 있는 답은 위의 3가지 경우인거같다.
첫번째와 두번째는 기존의 for문인지 향상된 for문인지만 다른것이고
마지막 문제는 삼항 연산자를 사용하여 좀더 간결하게 나타낸 것이다.
 */