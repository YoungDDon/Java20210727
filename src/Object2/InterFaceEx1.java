package Object2;

public class InterFaceEx1 {
    public static void main(String[] args) {
        Fightable fightable = new FireBat(); //큰범위 -> 좁은범위
        fightable.attack();
//        System.out.println(fightable.name); 안됨!! 인터페이스는 메서드만 공유 가능 변수 공유 x

        Fightable fightable1 = new Fightable() {
            @Override
            public void attack() { }
        };
        //명시적 형변환(인터페이스->클래스) 이지만 안됨 : 부자관계이기 때문
        //FireBat fireBat = (FireBat) fightable1; //좁은 범위 -> 큰범위 (에러)

        FireBat fireBat = (FireBat) fightable; //자부자 관계 형변환 가능
        fireBat.attack();
        System.out.println(fireBat.name);  //됨!!

    }
}


interface Fightable {
    void attack();
}

class FireBat extends Terran implements Fightable {
    String name = "FireBat";
    @Override
    public void attack() {
        System.out.println("name: "+name+" / 체력: "+hp+" / 위치: "+x+","+y);
    }
}

class Dragoon extends Protoss implements Fightable {
    @Override
    public void attack() {
        System.out.println("hp : "+hp);
    }
}