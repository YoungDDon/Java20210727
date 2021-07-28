package operator;

public class OperatorEx2_overflow {
    public static void main(String[] args) {
        int a = 1000000;
        int b = 2000000;
        long l = 2000000L;
        long e = a * b;
        long c = a * (long)b;
        long d = a * l;
        System.out.println(e);
        System.out.println(c);
        System.out.println(d);
    }
}
