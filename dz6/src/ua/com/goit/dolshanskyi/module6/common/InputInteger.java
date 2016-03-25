package ua.com.goit.dolshanskyi.module6.common;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputInteger {

    private int value;
    private static Scanner scanner = new Scanner(System.in);

    public int getIntegerFromConsole(){

       try{
           value = scanner.nextInt();
           return value;
       }
       catch (InputMismatchException e){
           System.out.println("[[ERROR]] Value '" + scanner.next() + "' not an Integer");
           System.out.println("Programm is going to be finished. Try again.");
           System.exit(0);
       }
        return 0;
    }

}
