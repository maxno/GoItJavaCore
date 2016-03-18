package ua.com.dolshanskyi.module4.task1;

public class Main {

    public static void main(String[] args){

        Triangle triangle = new Triangle(7.0, 4.0, 6.0);
        Rectangle rectangle = new Rectangle(4.0, 7.0);
        Circle circle = new Circle(6.0);

        System.out.println("Triangle area : " + triangle.calculateArea());
        System.out.println("Rectangle area : " + rectangle.calculateArea());
        System.out.println("Circle area : " + circle.calculateArea());
    }
}
