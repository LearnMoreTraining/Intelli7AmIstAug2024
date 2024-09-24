package javabasics;

import java.util.NoSuchElementException;

public class ExceptionHandlingExample {

    public static void main(String[] args) {

        try{
            int a = 10 ;
            String b = "$200";
            int c = Integer.parseInt(b);
        }
        catch (NoSuchElementException e){
            String b = "$200";
            String c = b.substring(1);
            int d = Integer.parseInt(c);
            System.out.println(10+d);
        }
        catch(NumberFormatException a){

        }




    }
}
