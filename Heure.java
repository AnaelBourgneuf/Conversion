/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperConversions;

import static SuperConversions.JsonReader.readJsonFromUrl;
import java.sql.Time;

/**
 *
 * @author Anael
 */
public class Heure {
    private Time value;
    private String fromAPI;
    private String toAPI;
    private final String API = "http://api.timezonedb.com/v2/convert-time-zone?key=FTP5ETSY54DO&format=json&from="+fromAPI+"&to="+toAPI;
    long unixTime = System.currentTimeMillis() / 1000L;
    
    public Time getValue(){
        return this.value;
    }
    
    public int convertTime(){
        int result = readJsonFromUrl(API);
        //Lignes à continuer
        return result;
        
    }



}
