package level_0.hongyeseok.sampling;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Sampling {
    public static void main(String[] args) {
        // 사람 이름 저장한 배열 선언
        String[] people = new String[] {"이재훈", "김도연", "홍예석", "강혜광", "이승렬", "서리하", "김나현", "김진원", "황원준","조민성","김현호"};
        Random random = new Random();

        //중복되지 않는 난수를 생성하고 저장할 randomNumbers 선언
        Set<Integer> randomNumbers = new HashSet<>();

        //중복 없이 3개의 숫자가 뽑힐 때까지 난수 생성을 반복
        while(randomNumbers.size() < 4){
            randomNumbers.add(random.nextInt(people.length));
        }
        //set은 값을 하나씩 뽑아 쓸 수 없기 때문에 Iterator에 담아 하나씩 확인할 수 있는 자료형으로 바꿈
        Iterator<Integer> iter = randomNumbers.iterator();

        //iter변수에 더 이상 다음 값이 없을 때까지 값을 뽑아서 해당 값의 순서에 해당하는 people을 출력
        while (iter.hasNext()){
            System.out.println(people[iter.next()]);
        }
    }
}
