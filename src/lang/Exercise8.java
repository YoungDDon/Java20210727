package lang;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        int count = 0;

        do {
            count++;
            System.out.println("1과 100사이의 값을 입력 : ");

            input = new Scanner(System.in).nextInt();

            if (answer > input) {
                System.out.println("더 큰 수를 입력하세요.");
            } else if (answer < input) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("맞음");
                System.out.println("시도 횟수는 " + count + "번입니다");
                break;
            }
        } while (true);
    }
}
