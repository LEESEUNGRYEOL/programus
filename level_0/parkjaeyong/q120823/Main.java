package level_0.parkjaeyong.q120823;


import java.io.BufferedWriter;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


class Solution {
    public static void main(String[] args)  {
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            Scanner sc = new Scanner(System.in);
            for(int i = 1, n = sc.nextInt() ; i <= n ; i++)
                bw.write("*".repeat(i)+"\n");
            bw.flush();
        }catch (IOException e){}
    }
}




