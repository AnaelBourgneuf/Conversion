/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperConversions;

/**
 *
 * @author Anael
 */
public class Temperature {
    private static float fahrenheitToCelsius;
    private static float kelvinToCelsius;
    
    public static float ratioTemp(String from, String to) {
        switch (from) {
            case "Fahrenheit":
                switch (to) {
                    case "Fahrenheit":
                        return fahrenheitToCelsius/fahrenheitToCelsius;
                    case "Celsius":
                        return fahrenheitToCelsius;
                    case "Kelvin":
                        return fahrenheitToCelsius/kelvinToCelsius;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "Celsius":
                switch (to) {
                    case "Fahrenheit":
                        return 1/fahrenheitToCelsius;
                    case "Celsius":
                        return 1;
                    case "Kelvin":
                        return 1/kelvinToCelsius;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "Kelvin":
                switch (to) {
                    case "Fahrenheit":
                        return kelvinToCelsius/fahrenheitToCelsius;
                    case "Celsius":
                        return kelvinToCelsius;
                    case "Kelvin":
                        return kelvinToCelsius/kelvinToCelsius;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            default:
                System.out.println("Unité de départ non prise en compte");
        }
        return 0;
    }
}
