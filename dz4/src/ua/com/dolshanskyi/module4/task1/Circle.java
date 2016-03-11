package ua.com.dolshanskyi.module4.task1;
public class Circle implements Figure{
    private Double radius;
    public Circle(Double radius) {
        this.radius = radius;
    }
    @Override
    public Double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
