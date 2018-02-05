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
    
    public toFahrenheit(fCelsius) {
        float fFahrenheit;
        float fCelsius;
        fFahrenheit = fCelsius * 1.8 + 32;
        return fFahrenheit;
    
}
    public toCelsius(cFahrenheit){
        float cCelsius;
        cCelsius = cFahrenheit - 32 * (5/9);
        return cCelsius;
        
    }
}
