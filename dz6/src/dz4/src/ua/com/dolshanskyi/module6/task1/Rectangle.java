package dz4.src.ua.com.dolshanskyi.module6.task1;

class Rectangle implements Figure{

    private Double length;
    private  Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double calculateArea() {

        if(length <= 0 || width <= 0){

            throw new IllegalArgumentException("[ERROR] Incorrect rectangle sides " + length + " " + width + ".Sides should be > 0");

        }

        return getLength() * getWidth();
    }

    public Double getLength() {
        return length;
    }

    public void setLength(final Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(final Double width) {
        this.width = width;
    }
}
