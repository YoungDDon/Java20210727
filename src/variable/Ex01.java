package variable;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("1"+"2"); //12
        System.out.println(true+""); //true
        System.out.println('A'+'B'); //131
        System.out.println('1'+ 2); //51
        System.out.println('1'+'2'); //99
        System.out.println('j'+"ava"); //java
        // System.out.println(true+null); //오류

        int x = 1;
        int y = 2;
        int z = 3;
        int tmp = x;
        x = y;
        y = z;
        z = tmp;


        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}
