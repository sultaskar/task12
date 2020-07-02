package ru.sultanov;

public class Task2 {

    static String[] b = {"H","e","l","l","o"," ","W","o","r","l","d"};

    public static void main(String[] args) {

        try{
            b[12] = "!";
            for(int i=0;i<b.length;i++){
                System.out.print(b[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException:" + e.getMessage());
        }

    }
}
