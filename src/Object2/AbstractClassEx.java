package Object2;

public class AbstractClassEx {
    public static void main(String[] args) {
        Units units = new Units() {
            @Override
            void move(int x, int y) {
                System.out.println(x+","+y+"로 이동했습니다.");
            }
        };
        Zerg zerg = new Zerg();
    }
}


abstract class Units {      //인스턴트를 만들 수 없음
    int x,y;
    abstract void move(int x, int y);
    void stop() {}
}
class Zerg extends Units {
    @Override
    void move(int x, int y) {

    }
}