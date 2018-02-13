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
public class Longueur {
    private static double millimeterToMeter = 0.001;
    private static double centimeterToMeter = 0.01;
    private static double decimeterToMeter = 0.1;
    private static float meterToMeter = 1;
    private static float kilometerToMeter = 1000;
    private static double footToMeter = 0.3048;
    private static double inchToMeter = 0.0254;
    private static double mileToMeter = 1609.344;
    private static double yardToMeter = 0.9144;
    private static double lightSecondToMeter = 299792458;
    private static double lightYearToMeter = 299792458*3600*24*365;
    
    
    public static double ratioDist(String from, String to){
        switch (from) {
            case "millimètre(s)":
                switch (to) {
                    case "millimètre(s)":
                        return millimeterToMeter/millimeterToMeter;
                    case "centimètre(s)":
                        return millimeterToMeter/centimeterToMeter;
                    case "décimètre(s)":
                        return millimeterToMeter/decimeterToMeter;
                    case "mètre(s)":
                        return millimeterToMeter;
                    case "kilomètre(s)":
                        return millimeterToMeter/kilometerToMeter;
                    case "foot(feet)":
                        return millimeterToMeter/footToMeter;
                    case "inch(es)":
                        return millimeterToMeter/inchToMeter;
                    case "mile(s)":
                        return millimeterToMeter/mileToMeter;
                    case "yard(s)":
                        return millimeterToMeter/yardToMeter;
                    case "light year(s)":
                        return millimeterToMeter/lightYearToMeter;
                    case "light second(s)":
                        return millimeterToMeter/lightSecondToMeter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "centimètre(s)":
                switch (to) {
                    case "millimètre(s)":
                        return centimeterToMeter/millimeterToMeter;
                    case "centimètre(s)":
                        return centimeterToMeter/centimeterToMeter;
                    case "décimètre(s)":
                        return centimeterToMeter/decimeterToMeter;
                    case "mètre(s)":
                        return centimeterToMeter;
                    case "kilomètre(s)":
                        return centimeterToMeter/kilometerToMeter;
                    case "foot(feet)":
                        return centimeterToMeter/footToMeter;
                    case "inch(es)":
                        return centimeterToMeter/inchToMeter;
                    case "mile(s)":
                        return centimeterToMeter/mileToMeter;
                    case "yard(s)":
                        return centimeterToMeter/yardToMeter;
                    case "light year(s)":
                        return centimeterToMeter/lightYearToMeter;
                    case "light second(s)":
                        return centimeterToMeter/lightSecondToMeter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "décimètre(s)":
                switch (to) {
                    case "millimètre(s)":
                        return decimeterToMeter/millimeterToMeter;
                    case "centimètre(s)":
                        return decimeterToMeter/centimeterToMeter;
                    case "décimètre(s)":
                        return decimeterToMeter/decimeterToMeter;
                    case "mètre(s)":
                        return decimeterToMeter;
                    case "kilomètre(s)":
                        return decimeterToMeter/kilometerToMeter;
                    case "foot(feet)":
                        return decimeterToMeter/footToMeter;
                    case "inch(es)":
                        return decimeterToMeter/inchToMeter;
                    case "mile(s)":
                        return decimeterToMeter/mileToMeter;
                    case "yard(s)":
                        return decimeterToMeter/yardToMeter;
                    case "light year(s)":
                        return decimeterToMeter/lightYearToMeter;
                    case "light second(s)":
                        return decimeterToMeter/lightSecondToMeter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "mètre(s)":
                switch (to) {
                    case "millimètre(s)":
                        return 1/millimeterToMeter;
                    case "centimètre(s)":
                        return 1/centimeterToMeter;
                    case "décimètre(s)":
                        return 1/decimeterToMeter;
                    case "mètre(s)":
                        return 1;
                    case "kilomètre(s)":
                        return 1/kilometerToMeter;
                    case "foot(feet)":
                        return 1/footToMeter;
                    case "inch(es)":
                        return 1/inchToMeter;
                    case "mile(s)":
                        return 1/mileToMeter;
                    case "yard(s)":
                        return 1/yardToMeter;
                    case "light year(s)":
                        return 1/lightYearToMeter;
                    case "light second(s)":
                        return 1/lightSecondToMeter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "kilomètre(s)":
                switch (to) {
                    case "millimètre(s)":
                        return kilometerToMeter/millimeterToMeter;
                    case "centimètre(s)":
                        return kilometerToMeter/centimeterToMeter;
                    case "décimètre(s)":
                        return kilometerToMeter/decimeterToMeter;
                    case "mètre(s)":
                        return kilometerToMeter;
                    case "kilomètre(s)":
                        return kilometerToMeter/kilometerToMeter;
                    case "foot(feet)":
                        return kilometerToMeter/footToMeter;
                    case "inch(es)":
                        return kilometerToMeter/inchToMeter;
                    case "mile(s)":
                        return kilometerToMeter/mileToMeter;
                    case "yard(s)":
                        return kilometerToMeter/yardToMeter;
                    case "light year(s)":
                        return kilometerToMeter/lightYearToMeter;
                    case "light second(s)":
                        return kilometerToMeter/lightSecondToMeter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "foot(feet)":
                switch (to) {
                    case "millimètre(s)":
                        return footToMeter/millimeterToMeter;
                    case "centimètre(s)":
                        return footToMeter/centimeterToMeter;
                    case "décimètre(s)":
                        return footToMeter/decimeterToMeter;
                    case "mètre(s)":
                        return footToMeter;
                    case "kilomètre(s)":
                        return footToMeter/kilometerToMeter;
                    case "foot(feet)":
                        return footToMeter/footToMeter;
                    case "inch(es)":
                        return footToMeter/inchToMeter;
                    case "mile(s)":
                        return footToMeter/mileToMeter;
                    case "yard(s)":
                        return footToMeter/yardToMeter;
                    case "light year(s)":
                        return footToMeter/lightYearToMeter;
                    case "light second(s)":
                        return footToMeter/lightSecondToMeter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "inch(es)":
                switch (to) {
                    case "millimètre(s)":
                        return inchToMeter/millimeterToMeter;
                    case "centimètre(s)":
                        return inchToMeter/centimeterToMeter;
                    case "décimètre(s)":
                        return inchToMeter/decimeterToMeter;
                    case "mètre(s)":
                        return inchToMeter;
                    case "kilomètre(s)":
                        return inchToMeter/kilometerToMeter;
                    case "foot(feet)":
                        return inchToMeter/footToMeter;
                    case "inch(es)":
                        return inchToMeter/inchToMeter;
                    case "mile(s)":
                        return inchToMeter/mileToMeter;
                    case "yard(s)":
                        return inchToMeter/yardToMeter;
                    case "light year(s)":
                        return inchToMeter/lightYearToMeter;
                    case "light second(s)":
                        return inchToMeter/lightSecondToMeter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "mile(s)":
                switch (to) {
                    case "millimètre(s)":
                        return mileToMeter/millimeterToMeter;
                    case "centimètre(s)":
                        return mileToMeter/centimeterToMeter;
                    case "décimètre(s)":
                        return mileToMeter/decimeterToMeter;
                    case "mètre(s)":
                        return mileToMeter;
                    case "kilomètre(s)":
                        return mileToMeter/kilometerToMeter;
                    case "foot(feet)":
                        return mileToMeter/footToMeter;
                    case "inch(es)":
                        return mileToMeter/inchToMeter;
                    case "mile(s)":
                        return mileToMeter/mileToMeter;
                    case "yard(s)":
                        return mileToMeter/yardToMeter;
                    case "light year(s)":
                        return mileToMeter/lightYearToMeter;
                    case "light second(s)":
                        return mileToMeter/lightSecondToMeter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "yard(s)":
                switch (to) {
                    case "millimètre(s)":
                        return yardToMeter/millimeterToMeter;
                    case "centimètre(s)":
                        return yardToMeter/centimeterToMeter;
                    case "décimètre(s)":
                        return yardToMeter/decimeterToMeter;
                    case "mètre(s)":
                        return yardToMeter;
                    case "kilomètre(s)":
                        return yardToMeter/kilometerToMeter;
                    case "foot(feet)":
                        return yardToMeter/footToMeter;
                    case "inch(es)":
                        return yardToMeter/inchToMeter;
                    case "mile(s)":
                        return yardToMeter/mileToMeter;
                    case "yard(s)":
                        return yardToMeter/yardToMeter;
                    case "light year(s)":
                        return yardToMeter/lightYearToMeter;
                    case "light second(s)":
                        return yardToMeter/lightSecondToMeter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "light year(s)":
                switch (to) {
                    case "millimètre(s)":
                        return lightYearToMeter/millimeterToMeter;
                    case "centimètre(s)":
                        return lightYearToMeter/centimeterToMeter;
                    case "décimètre(s)":
                        return lightYearToMeter/decimeterToMeter;
                    case "mètre(s)":
                        return lightYearToMeter;
                    case "kilomètre(s)":
                        return lightYearToMeter/kilometerToMeter;
                    case "foot(feet)":
                        return lightYearToMeter/footToMeter;
                    case "inch(es)":
                        return lightYearToMeter/inchToMeter;
                    case "mile(s)":
                        return lightYearToMeter/mileToMeter;
                    case "yard(s)":
                        return lightYearToMeter/yardToMeter;
                    case "light year(s)":
                        return lightYearToMeter/lightYearToMeter;
                    case "light second(s)":
                        return lightYearToMeter/lightSecondToMeter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "light second(s)":
                switch (to) {
                    case "millimètre(s)":
                        return lightSecondToMeter/millimeterToMeter;
                    case "centimètre(s)":
                        return lightSecondToMeter/centimeterToMeter;
                    case "décimètre(s)":
                        return lightSecondToMeter/decimeterToMeter;
                    case "mètre(s)":
                        return lightSecondToMeter;
                    case "kilomètre(s)":
                        return lightSecondToMeter/kilometerToMeter;
                    case "foot(feet)":
                        return lightSecondToMeter/footToMeter;
                    case "inch(es)":
                        return lightSecondToMeter/inchToMeter;
                    case "mile(s)":
                        return lightSecondToMeter/mileToMeter;
                    case "yard(s)":
                        return lightSecondToMeter/yardToMeter;
                    case "light year(s)":
                        return lightSecondToMeter/lightYearToMeter;
                    case "light second(s)":
                        return lightSecondToMeter/lightSecondToMeter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            default:
                System.out.println("Unité de départ non prise en compte");
        }
        return 0;
    }
}
