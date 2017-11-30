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
public class DonorDirectory {
    
     ArrayList<Donor>donorList;

    public DonorDirectory() {
        donorList=new ArrayList<>();
    }

    public ArrayList<Donor> getDonorList() {
        return donorList;
    }

    public void setDonorList(ArrayList<Donor> donorList) {
        this.donorList = donorList;
    }
    public Donor addDonor(){
        Donor d=new Donor();
        donorList.add(d);
        return d;
    }
    
}
