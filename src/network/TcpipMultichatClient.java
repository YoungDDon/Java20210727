package network;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpipMultichatClient {
    public static void main(String[] args) {
        String nickName = JOptionPane.showInputDialog("채팅할 대화명을 입력하세요.");
        String ip = JOptionPane.showInputDialog("서버 IP를 입력하세요.");
        try {
            Socket socket = new Socket(ip, 7777);
            System.out.println("서버에 접속됐습니다.");
            Sender sender = new Sender(socket, nickName);
            sender.start();
            Receiver receiver = new Receiver(socket);
            receiver.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static class Sender extends Thread {      //초기화 시키기 위한 구문
        Socket socket;         //네트워크를 사용하기 위한 통로
        DataOutputStream out;  //입출력 스트림(socket으로부터 획득 그래야 그 네트워크로 보낼 수 있음)
        String nickName;       //통신할 때 구분되는 ID같은 개념

        //위의 변수들을 생성자를 통해서 초기화
        public Sender(Socket socket, String nickName) {
            this.socket = socket; this.nickName = nickName;
            try {
                //소켓으로부터 출력스트림을 획득
                out = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        @Override
        public void run() {
            try {
                if (out != null) out.writeUTF(nickName);
                while (out != null) { out.writeUTF("["+nickName+"]"+JOptionPane.showInputDialog("메시지 입력."));}
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    static class Receiver extends Thread {
        Socket socket;
        DataInputStream in;
        Receiver(Socket socket){
            this.socket = socket;
            try {in = new DataInputStream(socket.getInputStream());}
            catch (IOException e) {}
        }

        @Override
        public void run() {
            while(in != null) {
                try {
                    System.out.println(in.readUTF());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
