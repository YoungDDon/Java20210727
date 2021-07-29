package array;

import java.util.Arrays;

public class LottoEx {
    public static void main(String[] args) {
        int[] balls = new int[45];
        int[] Lotto = new int[7];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = i + 1;
        }
        System.out.println();
        System.out.println(Arrays.toString(balls));
        //index의 처음과 랜덤한 어느 index와 자리바꿈을
        //for문이 돌아갈 때 까지 바꿈한다
        System.out.println();
        for (int i = 0; i < 7; i++) {
            int rand = (int)(Math.random()*45);
            int temp = balls[i];
            balls[i] = balls[rand];
            balls[rand] = temp;
        }

        System.out.println(Arrays.toString(balls));
    }
}
