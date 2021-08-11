package swing;

import javax.swing.*;


public class LoginFrm {
    public static void main(String[] args) {
        new Login(300,200,"Login");
    }
}
class Login extends BasicFrm {

    private JButton btnLogin, btnDel, btnJoin;
    private JPanel pnlCenter, pnlSouth;
    private JLabel lbName, lbPw;
    private JTextField tfName;
    private JPasswordField pfPass;

    public Login(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        lbName = new JLabel("ID");
        tfName = new JTextField(10);

        lbPw = new JLabel("PW");
        pfPass = new JPasswordField(10);

        btnLogin = new JButton("Login");
        btnDel = new JButton("Del");
        btnJoin = new JButton("Join");

        pnlCenter = new JPanel(); pnlSouth = new JPanel();
    }

    @Override
    public void arrange() {
        pnlCenter.add(lbName); pnlCenter.add(tfName);
        pnlCenter.add(lbPw); pnlCenter.add(pfPass);

        pnlSouth.add(btnLogin); pnlSouth.add(btnDel); pnlSouth.add(btnJoin);
        add(pnlCenter,"Center");
        add(pnlSouth,"South");
    }
}