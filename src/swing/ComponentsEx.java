//package swing;
//
//import org.jdatepicker.JDatePanel;
//import org.jdatepicker.JDatePicker;
//
//import javax.swing.*;
//
//public class ComponentsEx {
//    public static void main(String[] args) {
//        new MyComponents(700,500,"Components");
//    }
//}
//
//class MyComponents extends BasicFrm {
//    JPanel pnlCenter, pnlSouth, pnlNorth;
//    JRadioButton[] rbGender;
//    JCheckBox[] cbHobby;
//    ButtonGroup group;
//    JTextArea ta;
//    JScrollPane scp;
//    JDatePanel datePanel;
//    JDatePicker datePicker;
//
//    public MyComponents(int width, int height, String title) {
//        super(width, height, title);
//    }
//
//    @Override
//    public void init() {
//        pnlCenter = new JPanel();
//        pnlSouth = new JPanel();
//        pnlNorth = new JPanel();
//
//        datePicker = new JDatePicker();
//        datePanel = new JDatePanel();
//        datePanel.add(datePicker);
//
//        rbGender = new JRadioButton[2];
//        cbHobby = new JCheckBox[2];
//        group =  new ButtonGroup();
//        String[] genders = {"Female", "Male"};
//        String[] hobbys = {"Reading", "Music"};
//        for (int i = 0; i < genders.length; i++) {
//            rbGender[i] = new JRadioButton(genders[i]);
//            group.add(rbGender[i]);
//            cbHobby[i] = new JCheckBox(hobbys[i]);
//            rbGender[i] = new JRadioButton(genders[i],(i==0?true:false));
//            pnlSouth.add(rbGender[i]);
//            pnlSouth.add(cbHobby[i]);
//        }
//        ta = new JTextArea(10,20);
//        scp = new JScrollPane(ta);
//    }
//
//    @Override
//    public void arrange() {
//        pnlNorth.add(datePanel);
//        pnlNorth.add(datePicker);
//        pnlNorth.add(scp);
//
//        add(pnlNorth, "North");
//        add(pnlCenter, "Center");
//        add(pnlSouth, "South");
//    }
//}
