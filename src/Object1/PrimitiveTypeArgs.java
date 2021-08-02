package Object1;

public class PrimitiveTypeArgs {
    public static void main(String[] args) {
        Data d = new Data();
        System.out.println(d.x);  //0
        change(d.x);   //1000
        d.x = 10;
        System.out.println(d.x);  //10
        //1번 매서드 호출
        change(d.x);    //일반값 넘김  1000
        System.out.println(d.x);   //10
        //2번 매서드 호출
        change(d);      //주소값 넘김   1000
        System.out.println(d.x);    //1000
        //3번 메서드 호출
        Data d2 = copy(d);
        System.out.println("d2.x :"+d2.x);
        System.out.println(d2);
    }

    static void change(int x) {  //1번
        x= 1000;
        System.out.printf("change() : %d %n",x);
    }
    static void change(Data d) {   //2번
        d.x = 1000;
        System.out.printf("change() : %d %n",d.x);
    }
    static Data copy(Data d) {    //3번
        Data tmp = new Data(); tmp.x = d.x;
        System.out.println("d의 주소값:"+d);
        System.out.println("tmp의 주소값:"+tmp);
        return tmp;
    }
}
class Data{
    int x;
}
