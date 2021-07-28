package variable;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rand = (int)(Math.random()*100);
        System.out.println("숫자를 맞추어 보세요(1~100)");
        while (true) {
                int answer;
            try {
                answer = Integer.parseInt(scan.nextLine());
            } catch (Exception e){
                System.out.println("숫자를 입력해주세요.");
                continue;
            }
            if(answer > rand){
                System.out.println("큽니다");
            }else if (answer < rand){
                System.out.println("작습니다.");
            }else {
                System.out.println("정답입니다.");
                break;
            }
        }
    }
}
