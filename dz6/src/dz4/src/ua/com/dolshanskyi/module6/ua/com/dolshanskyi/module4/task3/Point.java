package dz4.src.ua.com.dolshanskyi.module6.ua.com.dolshanskyi.module4.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Point {

    private int x;
    private int y;

    public void inputValues() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter X:");

        try {
            this.x = scanner.nextInt();

            System.out.println("Please, enter Y:");

            this.y = scanner.nextInt();
        } catch (InputMismatchException e) {

            System.out.println("Entered value " + "'" + scanner.next() + "'" + " not an Integer");
            System.out.println("Program is finished. Try again.");
            System.exit(0);

        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
