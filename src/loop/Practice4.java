package array;



public class Practice4 {
    public static void main(String[] args) {
        int x = 21;
        char ch = ' ';
        int year = 100;
        boolean powerOn = false;
        int total = 0;

        if(x>10 && x<20) System.out.println("ture");
        else System.out.println("false");

        System.out.println(!(ch == ' ' || ch == '\t'));

        System.out.println((ch > '0'&& ch < '9'));

        System.out.println(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z');

        System.out.println(year%400 == 0 || year%4 == 0 && year%100 != 0);

        System.out.println(powerOn = false);

        for (int i = 1; i < 11; i++) {
            if (i%2 != 0 && i%3 != 0) total += i;
        }
        System.out.println(total);
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
            sum1 += sum;
        }
        System.out.println(sum1);
    }
}
