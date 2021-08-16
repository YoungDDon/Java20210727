package swing;

import javax.swing.*;
import java.awt.*;

public class join {
    public static void main(String[] args) {
        new MyJoin(300, 285, "회원가입").setResizable(false);;
    }
}

class MyJoin extends BasicFrm {
    JPanel pnlNorth, pnlSouth, pnlCenter, idpnl, pwPnl, pw2Pnl, namepnl, pnlG, pnlH,Checkpnl;
    JLabel title, idTxt, pwTxt,pw2Txt, nameTxt, genderTxt, HobbyTxt;
    JTextField name, id;
    JPasswordField pw, pw2;
    JRadioButton[] rbGender;
    JCheckBox[] cbHobby;
    ButtonGroup group;
    JButton cancelBtn;
    JButton joinBtn;

    public MyJoin(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        title = new JLabel("< 회 원 가 입 >",JLabel.CENTER);
        pnlSouth = new JPanel();
        pnlNorth = new JPanel();
        name = new JTextField(10);
        id = new JTextField(10);
        pw = new JPasswordField(10);
        pw2 = new JPasswordField(10);
        pnlCenter = new JPanel(new GridLayout(6,2));
        nameTxt = new JLabel(" 이   름 ",JLabel.CENTER);
        namepnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namepnl.add(name,JTextField.CENTER);
        idTxt = new JLabel("아 이 디",JLabel.CENTER);
        idpnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idpnl.add(id,JTextField.CENTER);
        pwTxt = new JLabel("비밀번호",JLabel.CENTER);
        pwPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pwPnl.add(pw,JTextField.CENTER);
        pw2Txt = new JLabel("비밀번호 확인",JLabel.CENTER);
        pw2Pnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pw2Pnl.add(pw2,JTextField.CENTER);
        pnlG = new JPanel();
        pnlH = new JPanel();
        Checkpnl = new JPanel(new GridLayout(2,2));
        rbGender = new JRadioButton[2];
        cbHobby = new JCheckBox[2];
        group = new ButtonGroup();
        String[] genders = {"여자", "남자"};
        String[] hobbys = {"독서", "운동"};
        genderTxt = new JLabel(" 성    별 ",JLabel.CENTER);
        for (int i = 0; i < genders.length; i++) {
            rbGender[i] = new JRadioButton(genders[i],(i==0)?true:false);
            group.add(rbGender[i]);
            pnlG.add(rbGender[i]);
        }
        HobbyTxt = new JLabel(" 취    미 ",JLabel.CENTER);
        for (int i = 0; i < genders.length; i++) {
            cbHobby[i] = new JCheckBox(hobbys[i]);
            pnlH.add(cbHobby[i]);
        }
        joinBtn = new JButton("회원가입");
        joinBtn.addActionListener( e -> {
            char[] pass = pw.getPassword();
            String pswd = new String(pass);
            char[] pass2 = pw2.getPassword();
            String pswd2 = new String(pass2);
            if (name.getText().equals("")) {
                JOptionPane.showMessageDialog(name,"이름을 입력하세요");
                return;
            } else if (id.getText().equals("")) {
                JOptionPane.showMessageDialog(id,"아이디를 입력하세요");
                return;
            } else if (pswd.equals("")) {
                JOptionPane.showMessageDialog(pw,"비밀번호를 입력하세요");
                return;
            }else if (pswd2.equals("")) {
                JOptionPane.showMessageDialog(pw,"비밀번호를 확인하세요");
                return;
            }else if (!pswd.equalsIgnoreCase(pswd2)) {
                JOptionPane.showMessageDialog(pw,"비밀번호가 다릅니다");
                pw.setText("");
                pw2.setText("");
                return;
            }else{
                JOptionPane.showMessageDialog(this,"회원가입 완료");
            }
        });

        cancelBtn = new JButton("취소");
        cancelBtn.addActionListener( e -> {
            name.setText("");
            id.setText("");
            pw.setText("");
            pw2.setText("");
        });

    }

    @Override
    public void arrange() {
        pnlNorth.add(title);
        add(pnlNorth,"North");
        pnlCenter.add(nameTxt); pnlCenter.add(namepnl); pnlCenter.add(idTxt);
        pnlCenter.add(idpnl); pnlCenter.add(pwTxt); pnlCenter.add(pwPnl);
        pnlCenter.add(pw2Txt); pnlCenter.add(pw2Pnl);
        pnlCenter.add(genderTxt); pnlCenter.add(pnlG);
        pnlCenter.add(HobbyTxt); pnlCenter.add(pnlH);
        add(pnlCenter);
        pnlSouth.add(joinBtn);
        pnlSouth.add(cancelBtn);
        this.add(pnlSouth,"South");
    }
}