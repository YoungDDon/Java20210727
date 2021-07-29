package array;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        String str = "Hello World";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println(str.substring(6));
        System.out.println(str.substring(2,10)); //2번부터 9번까지
        System.out.println(str.toUpperCase()); //2번부터 9번까지
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
}
