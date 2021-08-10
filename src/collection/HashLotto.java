package collection;

import java.util.*;


public class HashLotto {
    public static void main(String[] args) {
        HashSet lotto = new HashSet();
        while(lotto.size() < 6) {
            lotto.add((int)(Math.random() * 45) + 1);
        }
        List list = new LinkedList(lotto);
        Collections.sort(list);
        System.out.println(list);
    }
}
