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
    
    public static double convertTemp(String from, String to, double value) {
        switch (from) {
            case "Fahrenheit":
                switch (to) {
                    case "Fahrenheit":
                        return value;
                    case "Celsius":
                        return (value-32)*5/9;
                    case "Kelvin":
                        return ((value-32)*5/9)-273.15;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "Celsius":
                switch (to) {
                    case "Fahrenheit":
                        return value*9/5+32;
                    case "Celsius":
                        return value;
                    case "Kelvin":
                        return value+273.15;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "Kelvin":
                switch (to) {
                    case "Fahrenheit":
                        return (value-273.15)*9/5+32;
                    case "Celsius":
                        return value-273.15;
                    case "Kelvin":
                        return value;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            default:
                System.out.println("Unité de départ non prise en compte");
        }
        return 0;
    }
}
