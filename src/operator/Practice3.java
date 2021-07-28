package operator;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;
        b = (byte) i; //큰 -> 작
        ch = (char) b; //-128~127 -> 0~65535
        short s = (short) ch; //0~65535 -> -32768~32767
        float f = (float) l;
        i = (int) ch;


        Scanner scan = new Scanner(System.in);
        System.out.println("숫자입력");
        double input = scan.nextDouble();
        System.out.println(input==0?"0":(input>0?"양수":"음수"));
    }

}
