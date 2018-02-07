/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperConversions;

import static SuperConversions.JsonReader.readJsonFromUrl;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Anael
 */
public class Devise {
    private String type;
    private float value;
    private final String urlApi = "https://api.devises.zone/v1/full/EUR/json?key=51%7CXyXBB~swhTX%5EkguJkHjSj~mZ0WA4c9rt";
    
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
    
    public Map<String, List<String>> callAPI() throws UnirestException{
        
        GetRequest request = Unirest.get(urlApi);
        Map<String, List<String>> api = request.getHeaders();
        return api;
    }
    
    public static void loadRateFromJSON(String from, String to) throws IOException, ParseException, JSONException{
        JSONArray json = (JSONArray) readJsonFromUrl("https://api.devises.zone/v1/full/"+from+"/json?key=51%7CXyXBB~swhTX%5EkguJkHjSj~mZ0WA4c9rt").getJSONObject("result").get("conversion");
        //JSONArray jsonarray = json.toJSONArray(new JSONArray());
        //ArrayList array = new ArrayList();
        String monnaie = "";
        int i = 0;
        while (!monnaie.equals(to)){
            JSONArray array = json.getJSONArray(i);
            monnaie = array.
            i++;
        }
        
        //while (!monnaie.equals(json.get("result")))
        System.out.println(json.get(0));
    }
    
    public static void main(String[] args){
        try {
            loadRateFromJSON("EUR", "USD");
        } catch (IOException | ParseException | JSONException ex) {
            Logger.getLogger(Devise.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
