package dz4.src.ua.com.dolshanskyi.module6.task2;

import java.io.IOException;

class Celsius implements Temperature{

    private Float fahrenheitDegrees;

    public void setFahrenheitDegrees(PointTemperature pointTemperature) throws IOException {
        this.fahrenheitDegrees = pointTemperature.pointTemperature();
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
