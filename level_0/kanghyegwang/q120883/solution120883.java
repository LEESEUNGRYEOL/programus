package level_0.kanghyegwang.q120883;

class solution120883{
    public String solution(String[] id_pw, String[][] db) { // 내가 푼 것 생각을 어렵게 함....
        String res = "";
        boolean dq = false;
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {    // id가 같은지 확인
                dq = true;                      // 같으면 true 반환
            } else {
                res = "fail";                   // 다르면 로그인 실패
            }
            if (dq) {
                if ((id_pw[1].equals(db[i][1]))) {  // pw가 같은지 확인
                    return "login";                 // 같으면 로그인 성공
                } else {
                    return "wrong pw";              // 다르면 pw틀림
                }
            }
        }
        return res;
    }

    // 내가 푼것 아님
    public String solution2(String[] id_pw, String[][] db) { // 훨씬 가독성 좋은 코드
        for(int i = 0; i < db.length; i++) {
            if(id_pw[0].equals(db[i][0])) {                 // 아이디 같은지 확인
                if(id_pw[1].equals(db[i][1])) {             // 같으면 비밀번호 확인
                    return "login";                         // 같으면 로그인
                }
                return "wrong pw";                          // 다르면 비밀번호 틀림
            }
        }
        return "fail";                                      // if문에 걸리는게 없으면 로그인 실패
    }
}

/*
프로그래머스 lv0 문제중 그래도 조금 복잡한 문제라 생각한다
처음 답을 보면 내가 푼 방식이 복잡하고 보기에도 좋지 않기에 나만 그렇게 생각할 수도 있다
처음 생각을 잘못해서 어렵다고 생각한건지 문제풀이가 쉽지 않았고
이 문제는 이차원 배열의 요소를 비교하는 방법을 알고있는지 물어보는 문제라고 생각한다
처음 이문제를 봤을때 map을 사용하면 좋을거라 생각은 했지만 어떻게를 생각하지 못해
복잡하게 풀었다고 생각한다
 */