package Object2;

public class InheritanceAndInterface {
    public static void main(String[] args) {

    }
}

class SiegeTank extends Terran {

}
class BattleCruiser extends Terran implements Flyable, Groudable {
    @Override
    public void fly() {

    }
}

interface Flyable {
    static int ENGINE = 4;  // public static final int ENGINE = 4
    void fly();  // public abstract void fly(); 추상메서드
}
interface Groudable {

}