package Arrays.CNOTE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X, Y, K, N = 0, R;
        Boolean lucky = false;
        try {
            int testCases = Integer.parseInt(br.readLine().trim());
            while (testCases-- > 0) {
                StringTokenizer info = new StringTokenizer(br.readLine(), " ");
                X = Integer.parseInt(info.nextToken());
                Y = Integer.parseInt(info.nextToken());
                K = Integer.parseInt(info.nextToken());
                N = Integer.parseInt(info.nextToken());
                R = X - Y;
                int[][] nbArray = new int[N][2];
                for (int i = 0; i < N; i++) {
                    StringTokenizer nbInfo = new StringTokenizer(br.readLine(), " ");
                    nbArray[i][0] = Integer.parseInt(nbInfo.nextToken());
                    nbArray[i][1] = Integer.parseInt(nbInfo.nextToken());
                }
                for (int i = 0; i < N; i++) {
                    if (nbArray[i][0] >= R && nbArray[i][1] <= K) {
                        System.out.println("LuckyChef");
                        lucky = true;
                        break;
                    }
                    else{
                        lucky = false;
                    }
                }
                if (!lucky) {
                    System.out.println("UnluckyChef");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
