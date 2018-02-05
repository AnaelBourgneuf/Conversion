/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperConversions;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.ArrayList;

/**
 *
 * @author Anael
 */
public class Devise {
    private String type;
    private float value;
    private String urlApi = "https://api.devises.zone/v1/full/EUR/json?key=51%7CXyXBB~swhTX%5EkguJkHjSj~mZ0WA4c9rt";
    
    public String getType(){
        return type;
    }
    
    public float getValue(){
        return value;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public void setValue(float value){
        this.value = value;
    }
    
    public ArrayList callAPI() throws UnirestException{
        
        Unirest.post(this.urlApi)
        .queryString("name", "Mark")
        .field("last", "Polo")
        .asJson();
                
        return new ArrayList();
    }
}
