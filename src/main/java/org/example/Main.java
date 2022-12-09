package org.example;

public class Main {
    public static void main(String[] args) {
        int number = 50;
        for(int i = 1; i <= number; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print("ka-ching!");
            }else if (i % 3 == 0){
                System.out.print("ka");
            } else if (i % 5 == 0) {
                System.out.print("ching");
            }else{
                System.out.print(i);
            }
            System.out.print(","+" ");
        }
    }
}