package swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class JoinFrm {
    public static void main(String[] args) {
        new Join(600,500,"Join");
    }
}

class Join extends BasicFrm {

    private JPanel pnlSouth, pnlNorth;
    private JTable table;
    private JScrollPane pane;
    private DefaultTableModel model;
    private JLabel lbName, lbPw, lbId;
    private JTextField tfId, tfPw, tfName;
    private JButton btnADD, btnDel;

    public Join(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        model = new DefaultTableModel(new String[]{"ID","PW","NAME"},0);
        table = new JTable(model);
        pane = new JScrollPane(table);
        lbName = new JLabel("NAME");
        tfName = new JTextField(10);
        lbId = new JLabel("ID");
        tfId = new JTextField(10);
        lbPw = new JLabel("PW");
        tfPw = new JPasswordField(10);

        btnADD = new JButton("Add");
        btnADD.addActionListener( e -> {
            String Id = tfId.getText();
            String Pw = tfPw.getText();
            String Name = tfName.getText();
            String[] arrRow = {Id, Pw, Name};
            model.addRow(arrRow);

        });
        btnDel = new JButton("Del");
        btnDel.addActionListener( e -> {
            int row = table.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this,"no Selected Row");
                return;
            }
            model.removeRow(row);
        });

        pnlSouth = new JPanel(); pnlNorth = new JPanel();
    }

    @Override
    public void arrange() {
        pnlNorth.add(lbId); pnlNorth.add(tfId);
        pnlNorth.add(lbPw); pnlNorth.add(tfPw);
        pnlNorth.add(lbName); pnlNorth.add(tfName);
        pnlSouth.add(btnADD); pnlSouth.add(btnDel);
        add(pnlNorth,"North");
        add(pnlSouth,"South");
        add(pane,"Center");
    }
}