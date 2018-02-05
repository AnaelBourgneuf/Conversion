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
    
    public float toFahrenheit() {
        //float fFahrenheit;
        //float fCelsius;
        if (this.type == "fahrenheit") {
            return (float) this.value;
        }
        else if (this.type == "celsius") {
            return (float) this.value * 1.8 + 32;
        }
        else if (this.type == "kelvin"){
            return (float) this.value + 459.67 * 5 / 9;
        }
        return 0;
    
    }
    
    public float toCelsius(){
        //float cCelsius;
        if (this.type == "celsius") {
            return (float) this.value;
        }
        else if (this.type == "fahrenheit") {
            return (float) this.value - 32 * (5/9);
        }
        else if (this.type == "kelvin") {
            return (float) this.value + 273.15;
        }
        return 0;
    }

    public float toKelvin(){
        if (this.type == "kelvin"){
            return this.value;
        }
        else if (this.type == "celsius"){
            return (float) (this.value - 273.15);
        }
        else if (this.type == "fahrenheit"){
            return (float) this.value * 9/5 - 459.67;
        }
        return 0;
    }
}
