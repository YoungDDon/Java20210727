package swing;

import javax.swing.*;
import java.awt.*;

public class MyFrameEx1 {
    public static void main(String[] args) {
//        MyFrm1 frm = new MyFrm1(500, 300,"MyFrm1");
//        // new라는 생성연산자를 만나서 생성자를 만듬(인스턴스를 만들기 위해 생성자가있음)
//        // 인스턴스 = 객체 초기화
        new MyFrm1(500,300,"hi");
    }
}

// JFrame, JPanel, JScrollPane 담을 수 있는 component 를 container에 담는다
class MyFrm1 extends BasicFrm {
//    private JLabel lbTitle;
//    private JButton btn, btn2, btn3, btn4, btn5;

    private JButton[] btns;
    private String[] arr;
    private JPanel[] pnl;


    public MyFrm1(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
//        lbTitle = new JLabel("버튼을 눌러주세요");
//        btn = new JButton("확인");
//        btn2 = new JButton("확인");
//        btn3 = new JButton("확인");
//        btn4 = new JButton("확인");
//        btn5 = new JButton("확인");

        pnl = new JPanel[5];
        btns = new JButton[5];
        String[] arr = {"North", "South", "Center", "East", "West"};
        for (int i = 0; i < btns.length; i++) {
            pnl[i] = new JPanel();
            btns[i] = new JButton(arr[i]);

            btns[i].setBounds(i*100,i*30,100,30);
            pnl[i].add(btns[i], arr[i]);
            add(pnl[i]);
        }
    }

    @Override
    public void arrange() {
//        add(pnl);
//        setLayout(new FlowLayout());
//        setLayout(null);  //Absolute layout 절대배치
//        add(btn, "South");
//        add(btn2, "East");
//        add(btn3, "West");
//        add(btn4, "North");
//        add(btn5, "Center");
        setLayout((new GridLayout(3,2)));
    }
}