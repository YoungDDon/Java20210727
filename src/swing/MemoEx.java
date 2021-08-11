package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MemoEx {
    public static void main(String[] args) {
        new Memo(700,500,"메모장");
    }
}

class Memo extends BasicFrm {
    private JMenuBar menuBar;
    private JMenu mnFile, mnEdit, mnHelp, mnView, mnO;
    private JMenuItem miOpen, miSave, miInfo, miNew, miHelp;
    private JTextField tf;
    private JScrollPane pane;
    private JTable table;


    public Memo(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        pane = new JScrollPane(table);
        tf = new JTextField();
        menuBar = new JMenuBar();
        //메뉴바 요소
        setJMenuBar(menuBar);
        mnFile = new JMenu("파일(F)");
        mnFile.setMnemonic('F');
        mnEdit = new JMenu("편집(E)");
        mnEdit.setMnemonic('E');
        mnO = new JMenu("서식(O)");
        mnO.setMnemonic('O');
        mnView = new JMenu("보기(V)");
        mnView.setMnemonic('V');
        mnHelp = new JMenu("도움말(H)");
        mnHelp.setMnemonic('H');

        //메뉴 아이템 요소
        miNew = new JMenuItem("파일(F)");
        miOpen = new JMenuItem("편집(E)");
        miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));
        miOpen.addActionListener( e -> System.out.println("Open"));
        miSave = new JMenuItem("Save");
        miInfo = new JMenuItem("Info");
        miHelp = new JMenuItem("Help");

        menuBar.add(mnFile); menuBar.add(mnEdit); menuBar.add(mnO); menuBar.add(mnView); menuBar.add(mnHelp);
        setJMenuBar(menuBar);

        mnFile.add(miNew); mnFile.add(miOpen); mnFile.add(miSave);
        mnEdit.add(miSave);
        mnO.add(miSave);
        mnEdit.add(miInfo);
        mnHelp.add(miHelp);

    }

    @Override
    public void arrange() {
        pane.add(tf);
        add(pane,"Center");
    }
}