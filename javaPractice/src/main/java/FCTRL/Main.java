package FCTRL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int num;
        while(length-- > 0){
            num = sc.nextInt();
            int pow = 1;
            int noOfZeros = 0;
            while(num / (Math.pow(5,pow)) >= 1){
               noOfZeros += (int) (num / (Math.pow(5,pow)));
               pow++;
            }
            System.out.println(noOfZeros);
        }
    }
}
