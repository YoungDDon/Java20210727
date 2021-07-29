package array;

import javax.swing.*;
import java.util.Scanner;

public class MorseConverterEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        String[] morse =
                {".-", "-...", "-.-.","-..", "."
                        ,"..-.", "--.", "....","..",".---"
                        , "-.-", ".-..", "--", "-.", "---"
                        , ".--.", "--.-",".-.","...","-"
                        , "..-", "...-", ".--", "-..-","-.--"
                        , "--.." };
    do {
        System.out.println("\"Q\"를 입력하면 종료.");
        System.out.println("입력: ");
        input = scan.nextLine().toUpperCase();
        String tmp = "";
        for (int i = 0; i < input.length(); i++) {
            tmp += morse[input.charAt(i)-'A'];
            System.out.println(input.charAt(i)-'A');
        }

        System.out.println(tmp);
        }while ( !input.contentEquals("Q"));
    }
}
