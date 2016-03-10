package ua.com.dolshanskyi.module4.task1;
class Rectangle implements Figure{
    private Double length;
    private  Double width;
    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double calculateArea() {
        Double area = this.length * this.width;
        return area;
    }
}
