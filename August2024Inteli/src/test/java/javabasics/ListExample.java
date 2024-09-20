package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(24);
        System.out.println(l);
        l.add(100);
        System.out.println(l);
        l.add(500);
        System.out.println(l);
        System.out.println(l.get(3));
        l.add(24);
        System.out.println(l);

        List <String> l2 = new ArrayList<String>();
        l2.add("lmti");
        l2.add("learnmore");
        System.out.println(l2);
        l2.add(1,"abc");
        System.out.println(l2);

    }
}
