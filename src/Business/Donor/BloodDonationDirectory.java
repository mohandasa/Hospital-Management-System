/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import java.util.ArrayList;

/**
 *
 * @author anita
 */
public class BloodDonationDirectory {
    
    ArrayList<BloodDonation>bloodDonationList;

    public BloodDonationDirectory() {
        bloodDonationList=new ArrayList<>();
    }

    public ArrayList<BloodDonation> getBloodDonationList() {
        return bloodDonationList;
    }

    public void setBloodDonationList(ArrayList<BloodDonation> bloodDonationList) {
        this.bloodDonationList = bloodDonationList;
    }
    
    public BloodDonation addBloodDonation(){
        BloodDonation bd=new BloodDonation();
        bloodDonationList.add(bd);
        return bd;
    }
    
    
    
}
