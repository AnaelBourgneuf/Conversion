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
public class Volume {
    private static double cubicFootToCubicMetter = 0.02831685;
    private static double cubicInchToCubicMetter = 0.00001638706;
    private static long cubicMileToCubicMetter = 4168182*1000;
    private static double cubicYardToCubicMetter = 0.7645549;
    private static double cupToCubicMetter = 0.0002365882;
    private static double imperialGallonToCubicMetter = 0.00454609;
    private static double usGallonToCubicMetter = 0.003785412;
    private static double milliliterToCubicMetter = 0.000001;
    private static double literToCubicMetter = 0.001;
    
    public static double ratioVol(String from, String to){
        switch (from) {
            case "foot³(feet³)":
                switch (to) {
                    case "foot³(feet³)":
                        return cubicFootToCubicMetter/cubicFootToCubicMetter;
                    case "inch(s)³":
                        return cubicFootToCubicMetter/cubicInchToCubicMetter;
                    case "mile(s)³":
                        return cubicFootToCubicMetter/cubicMileToCubicMetter;
                    case "yard(s)³":
                        return cubicFootToCubicMetter/cubicYardToCubicMetter;
                    case "cup(s)":
                        return cubicFootToCubicMetter/cupToCubicMetter;
                    case "imperial gallon(s)":
                        return cubicFootToCubicMetter/imperialGallonToCubicMetter;
                    case "us gallon(s)":
                        return cubicFootToCubicMetter/usGallonToCubicMetter;
                    case "millilitre(s)":
                        return cubicFootToCubicMetter/milliliterToCubicMetter;
                    case "litre(s)":
                        return cubicFootToCubicMetter/literToCubicMetter;
                    case "m³":
                        return cubicFootToCubicMetter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "inch(s)³":
                switch (to) {
                    case "foot(feet)³":
                        return cubicInchToCubicMetter/cubicFootToCubicMetter;
                    case "inch(s)³":
                        return cubicInchToCubicMetter/cubicInchToCubicMetter;
                    case "mile(s)³":
                        return cubicInchToCubicMetter/cubicMileToCubicMetter;
                    case "yard(s)³":
                        return cubicInchToCubicMetter/cubicYardToCubicMetter;
                    case "cup(s)":
                        return cubicInchToCubicMetter/cupToCubicMetter;
                    case "imperial gallon(s)":
                        return cubicInchToCubicMetter/imperialGallonToCubicMetter;
                    case "us gallon(s)":
                        return cubicInchToCubicMetter/usGallonToCubicMetter;
                    case "millilitre(s)":
                        return cubicInchToCubicMetter/milliliterToCubicMetter;
                    case "litre(s)":
                        return cubicInchToCubicMetter/literToCubicMetter;
                    case "m³":
                        return cubicInchToCubicMetter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "mile(s)³":
                switch (to) {
                    case "foot(feet)³":
                        return cubicMileToCubicMetter/cubicFootToCubicMetter;
                    case "inch(s)³":
                        return cubicMileToCubicMetter/cubicInchToCubicMetter;
                    case "mile(s)³":
                        return cubicMileToCubicMetter/cubicMileToCubicMetter;
                    case "yard(s)³":
                        return cubicMileToCubicMetter/cubicYardToCubicMetter;
                    case "cup(s)":
                        return cubicMileToCubicMetter/cupToCubicMetter;
                    case "imperial gallon(s)":
                        return cubicMileToCubicMetter/imperialGallonToCubicMetter;
                    case "us gallon(s)":
                        return cubicMileToCubicMetter/usGallonToCubicMetter;
                    case "millilitre(s)":
                        return cubicMileToCubicMetter/milliliterToCubicMetter;
                    case "litre(s)":
                        return cubicMileToCubicMetter/literToCubicMetter;
                    case "m³":
                        return cubicMileToCubicMetter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "yard(s)³":
                switch (to) {
                    case "foot(feet)³":
                        return cubicYardToCubicMetter/cubicFootToCubicMetter;
                    case "inch(s)³":
                        return cubicYardToCubicMetter/cubicInchToCubicMetter;
                    case "mile(s)³":
                        return cubicYardToCubicMetter/cubicMileToCubicMetter;
                    case "yard(s)³":
                        return cubicYardToCubicMetter/cubicYardToCubicMetter;
                    case "cup(s)":
                        return cubicYardToCubicMetter/cupToCubicMetter;
                    case "imperial gallon(s)":
                        return cubicYardToCubicMetter/imperialGallonToCubicMetter;
                    case "us gallon(s)":
                        return cubicYardToCubicMetter/usGallonToCubicMetter;
                    case "millilitre(s)":
                        return cubicYardToCubicMetter/milliliterToCubicMetter;
                    case "litre(s)":
                        return cubicYardToCubicMetter/literToCubicMetter;
                    case "m³":
                        return cubicYardToCubicMetter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "cup(s)":
                switch (to) {
                    case "foot(feet)³":
                        return cupToCubicMetter/cubicFootToCubicMetter;
                    case "inch(s)³":
                        return cupToCubicMetter/cubicInchToCubicMetter;
                    case "mile(s)³":
                        return cupToCubicMetter/cubicMileToCubicMetter;
                    case "yard(s)³":
                        return cupToCubicMetter/cubicYardToCubicMetter;
                    case "cup(s)":
                        return cupToCubicMetter/cupToCubicMetter;
                    case "imperial gallon(s)":
                        return cupToCubicMetter/imperialGallonToCubicMetter;
                    case "us gallon(s)":
                        return cupToCubicMetter/usGallonToCubicMetter;
                    case "millilitre(s)":
                        return cupToCubicMetter/milliliterToCubicMetter;
                    case "litre(s)":
                        return cupToCubicMetter/literToCubicMetter;
                    case "m³":
                        return cupToCubicMetter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "imperial gallon(s)":
                switch (to) {
                    case "foot(feet)³":
                        return imperialGallonToCubicMetter/cubicFootToCubicMetter;
                    case "inch(s)³":
                        return imperialGallonToCubicMetter/cubicInchToCubicMetter;
                    case "mile(s)³":
                        return imperialGallonToCubicMetter/cubicMileToCubicMetter;
                    case "yard(s)³":
                        return imperialGallonToCubicMetter/cubicYardToCubicMetter;
                    case "cup(s)":
                        return imperialGallonToCubicMetter/cupToCubicMetter;
                    case "imperial gallon(s)":
                        return imperialGallonToCubicMetter/imperialGallonToCubicMetter;
                    case "us gallon(s)":
                        return imperialGallonToCubicMetter/usGallonToCubicMetter;
                    case "millilitre(s)":
                        return imperialGallonToCubicMetter/milliliterToCubicMetter;
                    case "litre(s)":
                        return imperialGallonToCubicMetter/literToCubicMetter;
                    case "m³":
                        return imperialGallonToCubicMetter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "us gallon(s)":
                switch (to) {
                    case "foot(feet)³":
                        return usGallonToCubicMetter/cubicFootToCubicMetter;
                    case "inch(s)³":
                        return usGallonToCubicMetter/cubicInchToCubicMetter;
                    case "mile(s)³":
                        return usGallonToCubicMetter/cubicMileToCubicMetter;
                    case "yard(s)³":
                        return usGallonToCubicMetter/cubicYardToCubicMetter;
                    case "cup(s)":
                        return usGallonToCubicMetter/cupToCubicMetter;
                    case "imperial gallon(s)":
                        return usGallonToCubicMetter/imperialGallonToCubicMetter;
                    case "us gallon(s)":
                        return usGallonToCubicMetter/usGallonToCubicMetter;
                    case "millilitre(s)":
                        return usGallonToCubicMetter/milliliterToCubicMetter;
                    case "litre(s)":
                        return usGallonToCubicMetter/literToCubicMetter;
                    case "m³":
                        return usGallonToCubicMetter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "millilitre(s)":
                switch (to) {
                    case "foot(feet)³":
                        return milliliterToCubicMetter/cubicFootToCubicMetter;
                    case "inch(s)³":
                        return milliliterToCubicMetter/cubicInchToCubicMetter;
                    case "mile(s)³":
                        return milliliterToCubicMetter/cubicMileToCubicMetter;
                    case "yard(s)³":
                        return milliliterToCubicMetter/cubicYardToCubicMetter;
                    case "cup(s)":
                        return milliliterToCubicMetter/cupToCubicMetter;
                    case "imperial gallon(s)":
                        return milliliterToCubicMetter/imperialGallonToCubicMetter;
                    case "us gallon(s)":
                        return milliliterToCubicMetter/usGallonToCubicMetter;
                    case "millilitre(s)":
                        return milliliterToCubicMetter/milliliterToCubicMetter;
                    case "litre(s)":
                        return milliliterToCubicMetter/literToCubicMetter;
                    case "m³":
                        return milliliterToCubicMetter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "litre(s)":
                switch (to) {
                    case "foot(feet)³":
                        return literToCubicMetter/cubicFootToCubicMetter;
                    case "inch(s)³":
                        return literToCubicMetter/cubicInchToCubicMetter;
                    case "mile(s)³":
                        return literToCubicMetter/cubicMileToCubicMetter;
                    case "yard(s)³":
                        return literToCubicMetter/cubicYardToCubicMetter;
                    case "cup(s)":
                        return literToCubicMetter/cupToCubicMetter;
                    case "imperial gallon(s)":
                        return literToCubicMetter/imperialGallonToCubicMetter;
                    case "us gallon(s)":
                        return literToCubicMetter/usGallonToCubicMetter;
                    case "millilitre(s)":
                        return literToCubicMetter/milliliterToCubicMetter;
                    case "litre(s)":
                        return literToCubicMetter/literToCubicMetter;
                    case "m³":
                        return literToCubicMetter;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            case "m³":
                switch (to) {
                    case "foot(feet)³":
                        return 1/cubicFootToCubicMetter;
                    case "inch(s)³":
                        return 1/cubicInchToCubicMetter;
                    case "mile(s)³":
                        return 1/cubicMileToCubicMetter;
                    case "yard(s)³":
                        return 1/cubicYardToCubicMetter;
                    case "cup(s)":
                        return 1/cupToCubicMetter;
                    case "imperial gallon(s)":
                        return 1/imperialGallonToCubicMetter;
                    case "us gallon(s)":
                        return 1/usGallonToCubicMetter;
                    case "millilitre(s)":
                        return 1/milliliterToCubicMetter;
                    case "litre(s)":
                        return 1/literToCubicMetter;
                    case "m³":
                        return 1;
                    default:
                        System.out.println("Unité d'arrivée non prise en compte");
                }   break;
            default:
                System.out.println("Unité de départ non prise en compte");
        }
        return 0;
    }
}
