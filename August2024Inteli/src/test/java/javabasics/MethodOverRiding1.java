package javabasics;

public class MethodOverRiding1 extends MethodOverRiding2 {

    public static void main(String[] args) {

        MethodOverRiding2 riding1 = new MethodOverRiding2();
        riding1.m1();
    }

    public void m1(){
        System.out.println("ride1");
    }
}
