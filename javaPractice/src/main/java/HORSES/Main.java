package HORSES;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase > 0){
            long[] S = new long[sc.nextInt()];
            for (int i = 0; i <  S.length; i++) {
             S[i] = sc.nextInt();
            }
            Arrays.sort(S);
            long min = S[S.length-1];
            for (int j = 1; j < S.length; j++) {
                if(S[j] - S[j-1] < min){
                    min = S[j] - S[j-1];
                }
            }
            System.out.println(min);
            testCase--;
        }
    }
}
