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
        if (null != this.type) //float fFahrenheit;
        //float fCelsius;
        switch (this.type) {
            case "fahrenheit":
                return (float) this.value;
            case "celsius":
                return (float) (this.value * 1.8 + 32);
            case "kelvin":
                return (float) (this.value + 459.67 * 5 / 9);
            default:
                break;
        }
        return 0;
    }
    
    public float toCelsius(){
        if (null != this.type) //float cCelsius;
        switch (this.type) {
            case "celsius":
                return (float) (this.value);
            case "fahrenheit":
                return (float) (this.value - 32 * (5/9));
            case "kelvin":
                return (float) (this.value + 273.15);
            default:
                break;
        }
        return 0;
    }

    public float toKelvin(){
        if (null != this.type)switch (this.type) {
            case "kelvin":
                return this.value;
            case "celsius":
                return (float) (this.value - 273.15);
            case "fahrenheit":
                return (float) (this.value * 9/5 - 459.67);
            default:
                break;
        }
        return 0;
    }
}
