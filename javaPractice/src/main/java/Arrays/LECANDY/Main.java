package Arrays.LECANDY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
                int elephants = 0, chocolates = 0, sum = 0;
                StringTokenizer quantity = new StringTokenizer(br.readLine(), " ");
                while (quantity.hasMoreTokens()) {
                    elephants = Integer.parseInt(quantity.nextToken());
                    chocolates = Integer.parseInt(quantity.nextToken());
                }
                int[] elephantsArray = new int[elephants];
                StringTokenizer reqChocs = new StringTokenizer(br.readLine(), " ");
                while (reqChocs.hasMoreTokens()) {
                    sum += Integer.parseInt(reqChocs.nextToken());
                }
                if (sum <= chocolates) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
