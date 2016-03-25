package dz4.src.ua.com.dolshanskyi.module6.task2;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        Fahrenheit fahrenheit = new Fahrenheit();
        Celsius celsius = new Celsius();
        File temperatureFile = new File("/home/askold/IdeaProjects/GoJavaOnline/dz6/src/dz4/src/ua/com/dolshanskyi/module6/task2/temperature.data");
        TemperatureFromFile temperatureFromFile = new TemperatureFromFile(temperatureFile);


        fahrenheit.setCelsiusDegrees(temperatureFromFile);
        celsius.setFahrenheitDegrees(temperatureFromFile);

        System.out.println(fahrenheit.getCelsiusDegrees() + " Celsious is " + fahrenheit.convertTemperature() + " Fahrenheit");
        System.out.println(celsius.getFahrenheitDegrees() + " Fahrenheit is " + celsius.convertTemperature() + " Celsious");
    }
}
