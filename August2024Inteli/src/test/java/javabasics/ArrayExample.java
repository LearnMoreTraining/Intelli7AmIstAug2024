package javabasics;

public class ArrayExample {

    public static void main(String[] args) {

       int [] a = {10,20,30,40,50}; //0,1,2,3

        for(int j =0; j < a.length ;j++ ){

            System.out.println(a[j]);
        }

        String [] name = {"lmti","learn more"};

        for(int k=0 ; k < name.length ; k++){
            System.out.println(name[k]);
        }

    }

}
