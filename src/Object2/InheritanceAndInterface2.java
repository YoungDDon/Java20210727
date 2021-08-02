package Object2;

public class InheritanceAndInterface2 {
    public static void main(String[] args) {
        Mammalia[] mammalias = new Mammalia[2];
        Bird[] birds = new Bird[2];
        mammalias[0] =(Mammalia) new Tiger(); //명시적 형변환
        mammalias[1] = new Bat();  //자식이 부모에게 올때는 묵시적 형변환 가능
        //부모는 자식이 가진 부모에게 없는 값들을 초기화 할 수 없기 때문에 부모가 자식에게 갈때는 명시적 형변환이 필요함
        birds[0] = new Eagle();
        birds[1] = new Ostrich();
        //부모 -> 자식 (불가능) / 자식 -> 부모 (가능) / 자식 -> 부모 -> 자식 (가능)
        Iground[] igrounds = new Iground[2];
        Ifly[] iflies = new Ifly[2];
        igrounds[0] = new Tiger();
        igrounds[1] = new Ostrich();
        for (int i = 0; i < iflies.length; i++) {
            igrounds[i].run();
        }
     }
}

class Mammalia { }
class Bird { }

class Tiger extends Mammalia implements Iground{
    @Override
    public void run() {
        System.out.println("호랑이 : 어흥 어흥");
    }
}
class Bat extends Mammalia implements Ifly{
    @Override
    public void fly() {
        System.out.println("박쥐 : 쉭쉭");
    }
}

class Eagle extends Bird implements Ifly{
    @Override
    public void fly() {
        System.out.println("독수리 : 휘익");
    }
}
class Ostrich extends Bird implements Iground{
    @Override
    public void run() {
        System.out.println("타조 타조");
    }
}

interface  Ifly {
    public abstract void fly();
}

interface Iground{
    void run();
}