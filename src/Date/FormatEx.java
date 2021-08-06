package Date;

import java.text.DecimalFormat;

public class FormatEx {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.#");
        System.out.println(df.format(1234));
        //패턴에 소수점이 없을 때 0은 갯수만큼 가수부분을 표현 0E0 => 1E6
        //패턴에 소수점이 없을 때 #은 갯수가 많더라도 정수 한 자리만 가수부분으로 표현 0E0 => .1E7
    }
}
