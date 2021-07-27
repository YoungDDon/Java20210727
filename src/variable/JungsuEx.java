package variable;

public class JungsuEx {
    byte b1;
    short s1;
    int i1;
    long l1;

    public static void main(String[] args) {
        JungsuEx j = new JungsuEx();
        byte b2;
        System.out.println(j.b1);
        System.out.println(j.s1);
        System.out.println(j.i1);
        System.out.println(j.l1);
        j.i1 = 130 + j.s1;
        j.s1 = (short)j.i1;
        j.i1 = j.s1;
        System.out.println(j.i1);
        j.l1 = 100_000_000_000l;
    }
}
