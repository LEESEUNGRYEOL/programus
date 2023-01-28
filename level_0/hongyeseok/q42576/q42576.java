package level_0.hongyeseok.q42576;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다.
 * 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요
 *
 * 입출력
 *
 * participant	                                        completion	                                 return
 * ["leo", "kiki", "eden"]	                            ["eden", "kiki"]	                        "leo"
 * ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
 * ["mislav", "stanko", "mislav", "ana"]	            ["stanko", "ana", "mislav"]	                "mislav"
 */

public class q42576 {
    public static void main(String[] args) {
        String[] participant = {"ana", "mislav", "mislav", "stanko"};
        String[] completion = {"ana", "mislav", "stanko"};
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        System.out.println(Solution.solution(participant,completion));
        System.out.println(Solution.solution(participant1,completion1));
    }
}

class Solution {
    public static String solution(String[] participant, String[] completion) {
        List<String> completionList = new ArrayList<>(Arrays.asList(completion));
        List<String> participantList = new ArrayList<>(Arrays.asList(participant));
        Collections.sort(completionList);
        Collections.sort(participantList);
        for (int i = 0; i < completionList.size(); i++) {
            if(!(participantList.get(i).equals(completionList.get(i)))){
                return participantList.get(i);
            }
        }
        return participantList.get(participantList.size()-1);
    }
}