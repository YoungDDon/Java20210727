package array;

import javax.swing.*;

        public class Practice4_9 {
            public static void main(String[] args) {
                int input = Integer.parseInt(JOptionPane.showInputDialog(
                        "합하고자 하는 숫자를 입력"
                ));
                int sum = 0;
                while(input > 0) {
                    sum += input%10;
                    input /= 10;
                    System.out.println(input);
                }
                System.out.println("total "+sum);
            }

         }

