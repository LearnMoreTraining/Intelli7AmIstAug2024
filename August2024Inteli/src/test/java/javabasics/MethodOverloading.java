package javabasics;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading overloading = new MethodOverloading();
        overloading.m1(1,"xyz");
    }

    public void m1(int a){

        System.out.println(a);
    }

    public void m1(String a){
        System.out.println(a);
    }

    public void m1(String a,  String b){
        System.out.println(a);
        System.out.println(b);
    }

    public void m1(int a , String b){
        System.out.println(a);
        System.out.println(b);
    }



}
