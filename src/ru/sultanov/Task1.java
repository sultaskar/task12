package ru.sultanov;

public class Task1 {

    static void method(){
        throw new NullPointerException("NullPointerException");
    }

    public static void main(String[] args) {

        try {
            method();
            System.out.println("Hello World!");
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}
