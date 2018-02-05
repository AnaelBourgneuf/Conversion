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
    private String type;
    
    public float getValue(){
        return this.value;
    }
    
    public String getType(){
        return this.type;
    }
    
    public void setValue(float value){
        this.value = value;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public void toFahrenheit() {
        float fFahrenheit;
        float fCelsius;
        fFahrenheit = (float) (this.value * 1.8 + 32);
    
    }
    
    public void toCelsius(){
        float cCelsius;
        cCelsius = this.value - 32 * (5/9);
    }

    public float toKelvin(){
        if (this.type == "kelvin"){
            return this.value;
        }
        else if (this.type == "celsius"){
            return (float) (this.value + 273.15);
        }
        else if (this.type == "fahrenheit"){
            return (float) 0.0; //formule a trouver
        }
        return 0;
    }
}
