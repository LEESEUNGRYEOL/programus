import java.util.Scanner;

public class Main {
    public int solution(int n) {
        int res = 1, p = 6, i = 1;
        while(true) {
            if((i*p)%n==0) {
                res = i;
                break;
            } else i++;
        }
        return res;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        System.out.print(T.solution(a));
    }
}