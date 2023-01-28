package level_0.KimNahyun.q120905;

import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> numList2 = new ArrayList<>();

//        for (int i = 0; i <= Arrays.stream(numlist).max().getAsInt(); i += n) {
//            numList2.add(i);
//        }

        for (int i : numlist) {
            if(i %n ==0){
                numList2.add(i);
            }
        }

        int[] arr2 = numList2.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return arr2;
    }
}