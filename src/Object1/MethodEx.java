package Object1;

public class MethodEx {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println(mm.add(10,20));;
    }
}

class MyMath {
    //return type void, 기본형 8가지, 참조형 1가지, 리턴타입 10가지
    void add() {
        System.out.println();
    }
    //로버로딩 규칙 이: 이름이 같다, 매: 매개변수 다르다, 리: 리턴타입(10가지) 상관 없다
    boolean add(boolean arg) {
        boolean result = false;
        return result;}
    char add(char arg) {return ' ';}
    byte add(byte arg) {return 0;}
    short add(short arg) {return 0;}
    int add(int arg) {return 0;}
    long add(long arg) {return 0l;}
    float add(float arg) {return 0.0f;}
    double add(double arg) {return 0.0;}
    int[] add(int[] arg) {return new int[]{0};}
    String add(String arg) {return "";}
    Car add(Car arg) {return new Car();}
    Car[] add(Car[] arg) {return new Car[]{new Car()};}
    int subtract(){return 0;}

    public long add(int i, int i1) {
        long result;
        result = (long)i + i1;
        return result;
    }

    //리턴타입 메서드명() {   }
}

class Car {}