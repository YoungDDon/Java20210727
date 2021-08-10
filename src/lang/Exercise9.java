package lang;
//9-1
public class Exercise9 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);

        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        System.out.println("c1.equals(c2):"+c1.equals(c2));
    }
}
class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString(){
        return num + (isKwang ? "K" : "");
    }
}



       // package lang;
////9-2
//public class Ex_01 {
//    public static void main(String[] args) {
//        Point3D p1 = new Point3D(1,2,3);
//        Point3D p2 = new Point3D(1,2,3);
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println("p1==p2?" + (p1 == p2));
//        System.out.println("p1.equals(p2)?" + (p1.equals(p2)));
//    }
//}
//
//class Point 3D {
//        int x, y, z;
//
//        point3D(int x, int y, int z){
//        this.x = x;
//        this.y = y;
//        this.z = z;
//        }
//        point3D {
//        this(0,0,0);
//        }
//public boolean equals(Onject obj){
//
//        }
//public String toString(){
//
//        }
//        }
//
//        --------------------------------
//
//        package lang;
////9-3
//public class Ex_01 {
//    public static int count(String src, String target) {
//        int count = 0;
//        int pos = 0;
//    }
//    public static void main(String[] args) {
//        System.out.println(count("12345AB12AB345AB", "AB"));
//        System.out.println(count("12345", "AB"));
//    }
//}