package ua.com.dolshanskyi.module4.task2;

public class Fahrenheit implements Temperature{

    private Float celsiusDegrees;

    public void setCelsiusDegrees(Float celsiusDegrees) {
        this.celsiusDegrees = celsiusDegrees;
    }

    public Float getCelsiusDegrees() {
        return celsiusDegrees;
    }

    @Override
    public Double convertTemperature() {
        Double fahrenheitDegrees = (this.celsiusDegrees * 1.8000) + 32;
        return fahrenheitDegrees;
    }
}
