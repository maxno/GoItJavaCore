package dz4.src.ua.com.dolshanskyi.module6.task2;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args){

        Fahrenheit fahrenheit = new Fahrenheit();
        Celsius celsius = new Celsius();
        File temperatureFile = new File("/home/askold/IdeaProjects/GoJavaOnline/dz6/src/dz4/src/ua/com/dolshanskyi/module6/task2/temperature.data");
        TemperatureFromFile temperatureFromFile = new TemperatureFromFile(temperatureFile);

        try {
            fahrenheit.setCelsiusDegrees(temperatureFromFile);
            celsius.setFahrenheitDegrees(temperatureFromFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(fahrenheit.getCelsiusDegrees() + " Celsious is " + fahrenheit.convertTemperature() + " Fahrenheit");
        System.out.println(celsius.getFahrenheitDegrees() + " Fahrenheit is " + celsius.convertTemperature() + " Celsious");
    }
}
