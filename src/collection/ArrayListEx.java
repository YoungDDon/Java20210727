package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(0);
        list.add("1");
        list.add(false);
        list.add(new Date());
        list.add(4);
        System.out.println(list.toString());
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            // System.out.println(list.get(i) instanceof Date?"0":"X");
        }
        System.out.println(list.indexOf("1"));
        list.remove(3);
        list.set(1,1);
        list.set(2,2);
        System.out.println(list.toString());
        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Comparable&&o2 instanceof Comparable){
                    Comparable c1 = (Comparable) o1;
                    Comparable c2 = (Comparable) o2;
                    return c1.compareTo(c2)*-1;
                }
                return -1;
            }
        });        System.out.println(list.toString());
    }
}