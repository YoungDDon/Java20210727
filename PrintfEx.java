package variable;

public class PrintfEx {
    public static void main(String[] args){
        int i = 100;
        float f = 3.141592f;
        char c = 'A';
        String str = "Hello World~!";

        System.out.printf("총점은 %d입니다.", i);
        //%d, decimal
        System.out.printf("PI의 값은 %10.7f입니다.", f);
        //%f, float
        System.out.printf("영어 대문자의 시작은 %c입니다.", c);
        //%c, char
        System.out.printf("\"안녕세상아~!\" = \"%s\"", str);
        //%s, string
        System.out.printf("\"안녕세상아~!\" = \"%s\"", str);
        System.out.printf("\"안녕세상아~!\" = \"%15s\"", str);
        System.out.printf("\"안녕세상아~!\" = \"%-15s\"", str);

    }
}
