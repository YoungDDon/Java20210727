package array;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] score = {20,88,91,33,100,55,95};
        int max = score[0];
        int min = score[0];
        int total = 0;

        for (int i = 0; i < score.length; i++) {
            if(max < score[i]) max = score[i];
            else if(min > score[i])  min = score[i];
            total += score[i];
            System.out.println(total);
        }
        System.out.printf("최대: %2d    ",max);
        System.out.printf("최소: %2d    ",min);
        System.out.printf("통합: %3d    ",total);
        System.out.printf("평균: %3.2f",(float)total/score.length);
    }
}
