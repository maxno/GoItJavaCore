package dz4.src.ua.com.dolshanskyi.module6.task2;

import java.io.IOException;

public class Fahrenheit implements Temperature {

    private Float celsiusDegrees;

    public void setCelsiusDegrees(PointTemperature pointTemperature) {
        try {
            this.celsiusDegrees = pointTemperature.pointTemperature();
        } catch (IOException e) {
            System.out.println(e);
        }
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
