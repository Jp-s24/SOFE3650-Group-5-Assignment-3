package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.println("Select an input:" + "\n" + "Enter 1 for Scanner" + "\n" + "Enter 2 for Keyboard" +
                    "\n" + "Enter 3 to exit");

            input = sc.nextInt();

            if(input == 1){
                System.out.println("f");
                input=3;
            }else if (input == 2){
                System.out.println("e");
                input=3;
            }else{
                System.out.println("Invalid entry");

            }

        }while (input!=3);











    }
}
