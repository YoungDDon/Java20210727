package lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorMethodEx {
    public static void main(String[] args) {
        MyClass obj = new MyClass(1);
        Function<MyClass, Boolean> func = (a) -> obj.equals(a);
        System.out.println(func.apply(new MyClass(5)));


        Supplier<MyClass> supplier = () -> new MyClass(1);
        MyClass myClass = supplier.get();
        System.out.println(myClass.num);

        Supplier<MyClass> supplier2 = MyClass::new;
    }
}

class MyClass {
    int num;
    public MyClass(int num) {this.num = num;}
    public MyClass() {this.num = 5;}

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  MyClass) {
            if(((MyClass) obj).num == this.num) return true;
        }
        return false;


    }
}

