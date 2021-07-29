package operator;

import java.util.Scanner;

public class Op_Mathround {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("소수를 입력");
        double input = scan.nextDouble();
        System.out.println("반올림 할 자리를 입력");
        int digit = scan.nextInt();
        //예를 들어 12.345를 소수 2째자리에서 반올림하라고 한다면
        double tmp = input * Math.pow(10,digit);
        System.out.println(tmp);
        tmp = Math.round(tmp);
        tmp /= Math.pow(10,digit);
        System.out.printf("최종 출력값: %10.5f", tmp);
        System.out.println("");
        MyMath.digitRound(input, digit);
    }
}

