package Object2;

public class CarEx {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        FireCar fireCar = new FireCar();
        fireCar.drive();
        fireCar.stop();
        SportsCar sportsCar = new SportsCar();

        System.out.println(fireCar instanceof Car?"상속관계":"관계 없음");
        System.out.println(sportsCar instanceof Car?"상속관계":"관계 없음");
        System.out.println(new Car() instanceof Car?"상속관계":"관계 없음");
        System.out.println(fireCar instanceof Object?"상속관계":"관계 없음");
        System.out.println(sportsCar instanceof Object?"상속관계":"관계 없음");
        System.out.println(car instanceof Object?"상속관계":"관계 없음");

        car = fireCar;
        //fireCar = (FireCar) sportsCar; 수직관계 형성 안됨
        fireCar = (FireCar) car; //자부자는 가능
    }
}

class Engine {}
class Car {
    int wheel;
    void drive() {}
    void stop() {}
    Engine engine;

    @Override
    public String toString() {
        return getClass().getName();
    }
}

class FireCar extends Car {
    void waterGun(){}
}
//class FireCar extends Car, Engine {   다중 상속 안됨
//    void waterGun(){}
//}

class SportsCar extends Car {
    int turbo;
}