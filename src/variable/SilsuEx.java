package variable;

public class SilsuEx {
    public static void main(String[] args){
        float f1 = 0.1f; // 4byte
        double d1 = 0.1; // 8byte d,D는 생략가능
        long l1 = 100_000_000_000l;
        f1 = l1; //표현범위가 float보다 더 크기때문에 묵시적 형변환
        l1 = (long)f1; //표현범위가 long이 더 작기때문에 명시적 형변환
        System.out.println(f1);
        System.out.println(d1);
        final float PI = 3.141592f;
        System.out.println(PI);
    }
}
