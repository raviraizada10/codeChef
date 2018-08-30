package Arrays.SNAPE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testCases = Integer.parseInt(br.readLine().trim());
            while(testCases-- > 0){
                BigDecimal min = new BigDecimal(0);
                BigDecimal max = new BigDecimal(0);
                double b = 0.00, ls = 0.00, rs = 0.00;
                StringTokenizer dimensions = new StringTokenizer(br.readLine()," ");
                while(dimensions.hasMoreTokens()){
                    b = Double.parseDouble(dimensions.nextToken());
                    ls = Double.parseDouble(dimensions.nextToken());
                }
                min = BigDecimal.valueOf(Math.sqrt(ls*ls - b*b)).setScale(5, BigDecimal.ROUND_UP);
                max = BigDecimal.valueOf(Math.sqrt(ls*ls + b*b)).setScale(5, BigDecimal.ROUND_UP);
                System.out.println(min + " " + max);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
