package dz4.src.ua.com.dolshanskyi.module6.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TemperatureFromFile implements PointTemperature {

    private File temperatureFile;

    public TemperatureFromFile(File temperatureFile) {
        this.temperatureFile = temperatureFile;
    }

    @Override
    public float pointTemperature() throws IOException {

        // Reading input by lines:
        BufferedReader in = new BufferedReader(
                new FileReader(temperatureFile));
        Float temperature;
        String fileString = "";
        StringBuilder sb = new StringBuilder();
        if ((fileString = in.readLine()) != null) {
            sb.append(fileString);
            try {
                temperature = Float.parseFloat(sb.toString());
                return temperature;
            } catch (NumberFormatException e) {
                System.out.println("[[ERROR]] " + sb + " not a temperature.");
            } finally {
                in.close();

            }
        }
        return 0;
    }
}
