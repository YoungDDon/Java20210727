package variable;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Sccanner(System.in);
        int rand = (int)(Math.random()*100)+1;
        System.out.println("숫자를 맞춰보세요(1~100)");
        while (true) {
            //int answer = scan.nextInt();
            try {
            int answer  = Integer.parseInt(scan.nextLine());
            } catch (Exception e) {
                System.out.println("숫자를 입력");
                break;
            }
            if (answer > rand) {
                System.out.println("큽니다");
            } else if (answer < rand) {
                System.out.println("작습니다");
            } else {
                System.out.println("정답");sn
                break;
            }
        }
    }
}
