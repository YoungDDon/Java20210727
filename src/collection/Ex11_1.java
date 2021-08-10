package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Ex11_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);

        HashSet set = new HashSet(list);
        TreeSet test = new TreeSet(set);
        Stack stack = new Stack();
        stack.addAll(test);

        while (!stack.empty()) System.out.println(stack.pop());
    }
}
