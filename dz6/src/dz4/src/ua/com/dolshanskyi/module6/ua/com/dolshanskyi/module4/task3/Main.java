package dz4.src.ua.com.dolshanskyi.module6.ua.com.dolshanskyi.module4.task3;

public class Main {
    public static void main(String[] args){

        Point firstPoint = new Point();
        Point secondPoint = new Point();

        System.out.println("Please, input coordinates of points for calculating distance between them");

        firstPoint.inputValues();
        secondPoint.inputValues();

        double distsnce = Math.sqrt((Math.pow(secondPoint.getY() - firstPoint.getX(), 2)) + (Math.pow(secondPoint.getY() - firstPoint.getY(), 2)));
        System.out.println("Distance between two points : " + distsnce);

    }
}
