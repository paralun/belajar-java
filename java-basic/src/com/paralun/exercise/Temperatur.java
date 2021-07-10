package com.paralun.exercise;

public class Temperatur {

    private final double KONST_FAHR = 32.0;

    public double toFahrenheit(double suhuCelcius) {
        double fahrenheit = KONST_FAHR + (9.0 / 5.0) * suhuCelcius;
        return fahrenheit;
    }

    public double toCelcius(double suhuFahrenheit) {
        double celcius = (suhuFahrenheit - KONST_FAHR) * (5.0 / 9.0);
        return celcius;
    }

    public static void main(String[] args) {
        Temperatur temperatur = new Temperatur();

        System.out.println("37.0 derajat celcius = " + temperatur.toFahrenheit(37.0) + " derajat fahrenheit");
        System.out.println("145.0 derajat fahrenheit = " + temperatur.toCelcius(145.0) + " derajat celcius");

    }
}
