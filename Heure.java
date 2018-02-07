/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperConversions;

import java.sql.Time;

/**
 *
 * @author Anael
 */
public class Heure {
    private Time value;
    private String APIkey = "FTP5ETSY54DO";

    public Time getValue(){
        return this.value;
    }

    long unixTime = System.currentTimeMillis() / 1000L;



}
