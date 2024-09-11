package javabasics;

import org.checkerframework.checker.units.qual.C;

public class ConstructorExample {

    static int a ;
    static String b;
    public ConstructorExample(){
        a = 5 ;
    }

    public ConstructorExample(String b){
        this.b = b;
    }

    public ConstructorExample(int h){

    }

    public static void main(String[] args) {
        ConstructorExample c = new ConstructorExample();
        System.out.println(a);
        System.out.println(b);
    }
}
