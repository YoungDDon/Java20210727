package generics;

import java.util.ArrayList;

public class GenericsEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //collection 모든 원소는 Object
        //list.add(Object object) 매개변수의 타입은 Object
        list.add(new Tv());  // Tv => Object (자부)
        //list.get(0).power(); 부모에서 자식의 메서드를 찾을 수 없다
        Tv tv =(Tv) list.get(0);  //Object => Tv (부자)
        tv.power();

        ArrayList<Tv> tvList = new ArrayList<>();  //ArrayList<E> 선언하면
        tvList.add(new Tv());  //add(E e) 를 사용할 수 있다
        tvList.get(0).power();
    }
}

class Tv{
    void power() { System.out.println("power"); }
}
