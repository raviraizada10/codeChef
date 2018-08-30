package Arrays.SALARY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String test = br.readLine();
            int testCases = 0;
            if (test != null && !test.trim().isEmpty()) {
                testCases = Integer.parseInt(test);
            }
            while ((testCases-- > 0)) {
                int N = Integer.parseInt(br.readLine().trim());
                int[] arrayW = new int[N];
                int i = 0;
                StringTokenizer wArr = new StringTokenizer(br.readLine(), " ");
                while(wArr.hasMoreTokens()){
                    arrayW[i] = Integer.parseInt(wArr.nextToken());
                    i++;
                }
                Arrays.sort(arrayW);

            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}