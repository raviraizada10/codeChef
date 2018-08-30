package CIELAB;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int MIN = 1;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int diff = sc.nextInt() - sc.nextInt();
        if(diff <= 0){
            System.exit(0);
        }
        StringBuilder sb = new StringBuilder(""+diff);
        int randomNo = random.nextInt(sb.length()-1 > 0 ? sb.length()-1: 1);
        int wrongDigit = MIN + random.nextInt(8);
        if(sb.charAt(randomNo) != (char) wrongDigit){
            sb.replace(randomNo, randomNo+1, String.valueOf(wrongDigit));
        }
        else{
            sb.replace(randomNo, randomNo+1, String.valueOf(wrongDigit + 1));
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}

    /*char[] diffArr = String.valueOf(diff).toCharArray();
    int randomNo = (random.nextInt(diffArr.length-1));
    diffArr[randomNo] = diffArr[randomNo];
    int out = Integer.parseInt(String.valueOf(diffArr));
    */
