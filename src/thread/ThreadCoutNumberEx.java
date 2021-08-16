package thread;

import javax.swing.*;

public class ThreadCoutNumberEx {
    public static void main(String[] args) {
        Bomb b = new Bomb();
        b.start();
        String pickLine = JOptionPane.showInputDialog("빨간선(0), 파란선(1) 중 선택하시오.");
        b.pickLine(Integer.parseInt(pickLine));

    }
}

class Bomb extends Thread{
    int realLine = (int)(Math.random() * 2);
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            try { Thread.sleep(1000); } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
            System.out.println("꽝!");
    }
    void pickLine(int pickLine) {
        if(realLine == pickLine){
            System.out.println("살았다.");
        } else {
            System.out.println("꽝!");
        }
    }
}