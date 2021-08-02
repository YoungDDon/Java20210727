package Object2;

public class inheritanceDuplicate {
    public static void main(String[] args) {
        //멤버변수는 부모 메서드는 자식을 따름
//        Parent p = new Parent();
        Child c = new Child();
        c.method();
        System.out.println();
//        Child c1 = new Parent(); //부모 -> 자식 (x)
        Parent p1 = new Child();
        System.out.println("자부의 x : "+p1.x);
        System.out.println();
        p1.method();
    }
}

class Parent{
    public Parent(int x) {
        this.x = x;
    }

    int x = 10;
    void method(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
//    int x = 20;

    public Child() {
        super(20); //super()는 무조건 생성자의 첫줄에 있어야함
        System.out.println("생성자");
    }

    void method(){
        System.out.println("Child");
        System.out.println("x = "+x);
        System.out.println("this.x = "+super.x);
    }
}