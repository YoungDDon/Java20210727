package Object1;

import javax.swing.*;

public class Ex6_18 {

    public static boolean isNumber(String str) {
        boolean result = true;
        if( str == null || str.equals("")) return false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch < '0' || ch > '9') return false;
        }
        return result;
    }
    public static void main(String[] args) {
        String input = "";
        do {
            input = JOptionPane.showInputDialog("숫자판별 프로그램. 입력.");
            if (input != null && !input.equals("")) {
                System.out.println(input + "은 숫자입니까?");
                System.out.println(isNumber(input) ? "숫자" : "문자");
            } else {
//                System.out.println("공백입니다.");
                JOptionPane.showInputDialog(null,"내용이 비었습니다.");
            continue;
            }
        } while (!input.equalsIgnoreCase("Q"));
    }
}
