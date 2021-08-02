package Object1;

public class InitBlockEx {
    public static void main(String[] args) {
        System.out.println(Bicycle.wheel);
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.gear);
    }
}

class Bicycle {
    static { System.out.println("instance Constructor1"); }
    { System.out.println("instance Constructor2"); }
    String model;
    int gear;
    static int wheel;
    public Bicycle() {
        System.out.println("생성자");
    }
}
