package loop;

public class ForEx {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i <= 10; i++) {
            total += 1;
        }
        System.out.println(total);
        for (int i = 10; i > 0; i--) {
            for (long j = 10; j < 100000000000L; j++) {

            }
            System.out.println(i);
        }
    }
}
