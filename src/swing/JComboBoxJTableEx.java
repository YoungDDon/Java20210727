//package swing;
//
//import org.jdatepicker.JDatePicker;
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.KeyEvent;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//
//public class JComboBoxJTableEx {
//    public static void main(String[] args) {
//        new Sheet(700,500,"Sheet");
//    }
//}
//class Sheet extends BasicFrm {
//    private JMenuBar menuBar;
//    private JMenu mnFile, mnInfo, mnHelp;
//    private JMenuItem miOpen, miSave, miInfo, miNew, miHelp;
//    private JPanel pnl;
//    private String[] arr;
//    private JComboBox<String> cb;
//    private JTextField tf;
//    private JDatePicker dp;
//    private JButton btnAdd, btnDel;
//    private JTable table;
//    private JScrollPane pane;
//    private DefaultTableModel model;
//
//    public Sheet(int width, int height, String title) {
//        super(width, height, title);
//    }
//
//    @Override
//    public void init() {
//        model = new DefaultTableModel(new String[]{"Date","Item","E/A"},0);
//        table = new JTable(model);
//        pane = new JScrollPane(table);
//        tf = new JTextField(10);
//        dp = new JDatePicker();
//        btnAdd = new JButton("Add");
//        btnDel = new JButton("Del");
//        btnAdd.addActionListener( e -> {
//                Calendar valDate = (Calendar) dp.getModel().getValue();
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//                Calendar cal = (Calendar) valDate;
//                String dateStr = sdf.format(cal.getTime());
//                String item =cb.getSelectedItem().toString();
//                String ea = tf.getText();
//                String[] arrRow = {dateStr, item, ea};
//                model.addRow(arrRow);
//        });
//
//        btnDel.addActionListener( e -> {
//            int row = table.getSelectedRow();
//            if (row == -1) {
//                JOptionPane.showMessageDialog(this,"no Selected Row");
//            return;
//            }
//            model.removeRow(row);
//        });
//
//        arr = new String[]{"IceAmericano","Cappucino","Latte","Cocoa","Milk"};
//        cb = new JComboBox<>(arr);
//        pnl = new JPanel();
//
//        menuBar = new JMenuBar();
//        //메뉴바 요소
//        setJMenuBar(menuBar);
//        mnFile = new JMenu("File");
//        mnFile.setMnemonic('F');
//        mnInfo = new JMenu("Info");
//        mnInfo.setMnemonic('I');
//        mnHelp = new JMenu("Help");
//        mnHelp.setMnemonic('H');
//
//        //메뉴 아이템 요소
//        miNew = new JMenuItem("New");
//        miOpen = new JMenuItem("Open");
//        miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));
//        miOpen.addActionListener( e -> System.out.println("Open"));
//        miSave = new JMenuItem("Save");
//        miInfo = new JMenuItem("Info");
//        miHelp = new JMenuItem("Help");
//
//        mnFile.add(miNew); mnFile.add(miOpen); mnFile.add(miSave);
//        mnInfo.add(miInfo);
//        mnHelp.add(miHelp);
//        menuBar.add(mnFile); menuBar.add(mnInfo); menuBar.add(mnHelp);
//        setJMenuBar(menuBar);
//    }
//
//    @Override
//    public void arrange() {
//        pnl.add(dp); pnl.add(cb); pnl.add(tf); pnl.add(btnAdd); pnl.add(btnDel);
//        add(pnl,"North");
//        add(pane,"Center");
//    }
//}
