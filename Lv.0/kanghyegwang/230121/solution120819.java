class solution120819 {
    public int[] solution(int money) {
        int[] res = new int[2]; // 치킨의 마리 수와 남은돈 2개만 출력하면 되기때문에 길이를 2로 고정
        res[0] = money/5500;    // 치킨의 마리 수
        res[1] = money%5500;    // 남은 돈
        return res;
    }
}