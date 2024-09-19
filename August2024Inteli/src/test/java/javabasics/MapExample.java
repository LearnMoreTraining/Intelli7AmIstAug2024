package javabasics;

import io.cucumber.java.hu.Ha;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map <Integer,String > m = new HashMap<Integer,String>();
        m.put(123,"zxc");
        m.put(678,"opi");
        m.put(789,"io");

        System.out.println(m);

        System.out.println(m.get(123));

    }
}
