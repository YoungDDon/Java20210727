package operator;

public class OP_Elvis {
    public static void main(String[] args) {
        int x = -5;
        int absX = x>=0?x:-x;
        System.out.println(+absX);
        char signX = (x>0)?'+':(x==0)?' ':'-';
        System.out.printf("x = %c%d %n",signX,absX);
    }
}
