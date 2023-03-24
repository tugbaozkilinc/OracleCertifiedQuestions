package oraclecertifiedquestions;

import java.io.IOException;

public class Product {

    double price;

    public static void main(String[] args) {
        try {
            method();
        }catch (MyException e){
            System.out.println("A");
        } // I

    }

    public static void method(){
        try{
            throw 3>10 ? new MyException() : new IOException();

        }catch (IOException e){
            System.out.println("I");
        }catch (Exception e){
            System.out.println("B");
        }
    }

}
