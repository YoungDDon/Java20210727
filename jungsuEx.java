package variable;

public class jungsuEx {
    byte b1;
    short s1;
    int i1;
    long l1;

    public jungsuEx() { }

    public static void main(String[] args){
        jungsuEx j = new jungsuEx();
        byte b2=(byte)130;
        System.out.println(j.b1);
        System.out.println(j.s1);
        System.out.println(j.i1);
        System.out.println(j.l1);
        System.out.println(j.l1);
        System.out.println(b2);
        System.out.println(j.b1 + b2);
        System.out.println(j.s1 + b2);
        j.i1 = 130 + j.s1;
        j.s1 = (short)j.i1; //큰데서 작은데로 (명시적 형 변환)
        j.i1 = (int)j.s1; //작은데로 큰데로 (묵시적 형 변환 = 생략가능)
        System.out.println(j.l1);
        j.l1 = 100_000_000_000_000l;
    }
}
