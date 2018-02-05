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
    private float value;
    private String Type;
    
    public void toFahrenheit() {
        float fFahrenheit;
        float fCelsius;
        fFahrenheit = (float) (this.value * 1.8 + 32);
    
    }
    
    public void toCelsius(){
        float cCelsius;
        cCelsius = this.value - 32 * (5/9);
    }
}
