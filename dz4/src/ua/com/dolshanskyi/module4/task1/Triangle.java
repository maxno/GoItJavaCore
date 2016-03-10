package ua.com.dolshanskyi.module4.task1;
public class Triangle implements Figure{
    private Double side1;
    private Double side2;
    private Double side3;

    public Triangle(Double side1, Double side2, Double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public Double calculateArea() {
        Double p = (this.side1 + this.side2 + this.side3) / 2; //area is calculated using Heron's formula
        Double area = Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
        return area;
    }
}
