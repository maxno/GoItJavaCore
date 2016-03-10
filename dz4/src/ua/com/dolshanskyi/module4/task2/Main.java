package ua.com.dolshanskyi.module4.task2;
public class Main {
    public static void main(String[] args){
        Fahrenheit fahrenheit = new Fahrenheit();
        Celsius celsius = new Celsius();
        fahrenheit.setCelsiusDegrees(30f);
        celsius.setFahrenheitDegrees(86f);
        System.out.println(fahrenheit.getCelsiusDegrees() + " Celsious is " + fahrenheit.convertTemperature() + " Fahrenheit");
        System.out.println(celsius.getFahrenheitDegrees() + " Fahrenheit is " + celsius.convertTemperature() + " Celsious");
    }
}
