package dz4.src.ua.com.dolshanskyi.module6.task1;

public class Circle implements Figure{

    private Double radius;
    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {

        if(this.radius <= 0){
            throw new IllegalArgumentException("[ERROR] Invalid radius: " + this.radius + " Radius should be > 0");
        }
        return Math.PI * Math.pow(this.radius, 2);
    }
}
