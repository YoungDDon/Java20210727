package variable;

import javax.swing.*;
import java.awt.*;

public class BooleanEx {
    boolean power;
    void turn() {
        if(power){
            power = false;
        } else {
            power = true;
        }
        System.out.println("전원이 " + power + " 되었습니다.");
    }
    public static void main(String[] args) {
        BooleanEx b = new BooleanEx();
        b.turn();
        TV tv = new TV();
        tv.turn();

    }
}

class TV{

    int channel;
    boolean power;
    int volume;


    void turn(){
        power = power ? false : true;

    }
    void chanUp(){}
    void chanDown(){}
    void volUp(){}
    void volDown(){}

}