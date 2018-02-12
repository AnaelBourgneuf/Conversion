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
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            default:
                System.out.println("Unité de départ non prise en compte");
        }
        return 0;
    }
}
