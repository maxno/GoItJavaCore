package ua.com.dolshanskyi.module4.ua.com.dolshanskyi.module4.task3;
public class Main {
    public static void main(String[] args){
        Point firstPoint = new Point(3, 6);
        Point secondPoint = new Point(5, 9);
        double distsnce = Math.sqrt((Math.pow(secondPoint.getX() - firstPoint.getX(), 2)) + (Math.pow(secondPoint.getY() - firstPoint.getY(), 2)));
        System.out.println("Distance between two points : " + distsnce);
    }
}
