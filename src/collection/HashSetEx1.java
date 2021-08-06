package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(1);

        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(set.contains(3));
        set.clear();
        System.out.println(set);
    }
}
