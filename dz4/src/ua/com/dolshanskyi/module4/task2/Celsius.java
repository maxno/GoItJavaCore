package ua.com.dolshanskyi.module4.task2;
class Celsius implements Temperature{
    private Float fahrenheitDegrees;
    public void setFahrenheitDegrees(Float fahrenheitDegrees) {
        this.fahrenheitDegrees = fahrenheitDegrees;
    }
    public Float getFahrenheitDegrees() {
        return fahrenheitDegrees;
    }
    @Override
    public Double convertTemperature() {
        Double celsiusDegrees = (this.fahrenheitDegrees - 32) / 1.8000;
        return celsiusDegrees;
    }
}
