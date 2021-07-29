package array;

import java.util.Scanner;

public class Practice4_10 {
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100+1);
        int input = 0;
        int count = 0;

        Scanner scan = new Scanner (System.in);

        while(true) {
            System.out.print("1~100입력: " );
            input =Integer.parseInt(scan.nextLine());
            count++;
            if(answer == input) break;
            else if(answer > input) System.out.println("UP");
            else System.out.println("Down");
        }
        System.out.printf("%3d번만에 맞췄습니다",count);
    }
}
