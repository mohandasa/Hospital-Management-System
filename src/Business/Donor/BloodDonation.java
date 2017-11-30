/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import java.util.Date;

/**
 *
 * @author anita
 */
public class BloodDonation {
    
    private String bloodType;
    private  int barCode;
    private Date timestamp;
    public static int count=1000;
    
    public BloodDonation(){
        barCode=count++;
        timestamp=new Date();
    }
    
    
    
    

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return String.valueOf(barCode);
    }
    
    
    
}
