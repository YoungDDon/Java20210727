package loop;

public class GugudanEx {
    //세로 구구단
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
//                System.out.printf(j+"*"+i+"="+i*j);
                System.out.printf("%d x %d = %2d %n",i,j,i*j);
            }
            System.out.println();
        }

        //가로 구구단
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
//                System.out.printf(j+"*"+i+"="+i*j);
                System.out.printf("%d x %d = %2d   ",j,i,i*j);
            }
            System.out.println();
        }
        //234, 456, 789
        for (int i = 2; i < 10; i+=3) {
            System.out.println();
            for (int j = 1; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i+k != 10){
                    System.out.printf("%d x %d = %2d   ",i+k,j,(i+k)*j);
                    }
                }
                System.out.println();
            }
        }
    }
}
