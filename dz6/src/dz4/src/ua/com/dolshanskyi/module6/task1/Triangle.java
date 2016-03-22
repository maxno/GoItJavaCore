package dz4.src.ua.com.dolshanskyi.module6.task1;

public class Triangle implements Figure{

    private Double side1;
    private Double side2;
    private Double side3;

    public Triangle(Double side1, Double side2, Double side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public Double getSide1() {
        return side1;
    }

    public void setSide1(Double side1) {
        this.side1 = side1;
    }

    public Double getSide2() {
        return side2;
    }

    public void setSide2(Double side2) {
        this.side2 = side2;
    }

    public Double getSide3() {
        return side3;
    }

    public void setSide3(Double side3) {
        this.side3 = side3;
    }

    @Override
    public Double calculateArea() {

        if(side1 <= 0 || side2 <= 0 || side3 <= 0){

            throw new IllegalArgumentException("[ERROR] Incorrect triangle sides " + side1 + " " + side2 + " " + side3 + ".Sides should be > 0");

        }
        Double p = (this.side1 + this.side2 + this.side3) / 2; //area is calculated using Heron's formula
        Double area = Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
        return area;
    }
}
