package dz4.src.ua.com.dolshanskyi.module6.task2;

import java.io.IOException;

class Celsius implements Temperature {

    private Float fahrenheitDegrees;

    public void setFahrenheitDegrees(PointTemperature pointTemperature) {
        try {
            this.fahrenheitDegrees = pointTemperature.pointTemperature();
        } catch (IOException e) {
            System.out.println(e);
        }
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
