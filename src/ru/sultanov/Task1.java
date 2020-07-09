package ru.sultanov;

public class Task1 {

    public static void main(String[] args) {

        try {
            MyClass myClass = new MyClass();
            myClass.myMethod();
            System.out.println("Hello World!");
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}
