package ru.sultanov;

public class Task3 {

    static String helloWorld = "Hello World!";

    public static void main(String[] args) {

        try {
            System.out.println(helloWorld);
            throw new HelloWorldException("Hello World Exception");
        } catch (HelloWorldException e) {
            System.out.println(e.getMessage());
        }
    }
}
