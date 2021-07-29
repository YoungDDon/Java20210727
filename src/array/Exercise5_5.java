package array;

public class Exercise5_5 {
    public static void main(String[] args) {
        int[] ballArr = new int[45];
        for (int i = 1; i < ballArr.length; i++) {
            ballArr[i]=i+1;
        }
        int[] ball3 = new int[6];
        //ballArr 배열의 임의의 요소를 골라서 위치를 바꾼다.
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
        System.arraycopy(ballArr,0,ball3, 0, ball3.length);
        for (int i = 0; i < ball3.length; i++) {
            if (i != 0)
                System.out.print(",");
            System.out.print(ball3[i]);
        }
        System.out.println();
    }
}