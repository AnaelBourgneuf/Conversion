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
    private float fahrenheitToCelsius;
    private float kelvinToCelsius;
    
    public float ratioTemp(String from, String to) {
        switch (from) {
            case "fahrenheit":
                switch (to) {
                    case "fahrenheit":
                        return fahrenheitToCelsius/fahrenheitToCelsius;
                    case "celsius":
                        return fahrenheitToCelsius;
                    case "kelvin":
                        return fahrenheitToCelsius/kelvinToCelsius;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "celsius":
                switch (to) {
                    case "fahrenheit":
                        return 1/fahrenheitToCelsius;
                    case "celsius":
                        return 1;
                    case "kelvin":
                        return 1/kelvinToCelsius;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "kelvin":
                switch (to) {
                    case "fahrenheit":
                        return kelvinToCelsius/fahrenheitToCelsius;
                    case "celsius":
                        return kelvinToCelsius;
                    case "kelvin":
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
