/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import Business.Employee.Employee;

/**
 *
 * @author anita
 */
public class Donor extends Employee {
  
    private  BloodDonationDirectory bloodDonationDirectory;
    public Donor(){
        bloodDonationDirectory=new BloodDonationDirectory();
    }
            
    
    public BloodDonationDirectory getBloodDonationDirectory() {
        return bloodDonationDirectory;
    }

    public void setBloodDonationDirectory(BloodDonationDirectory bloodDonationDirectory) {
        this.bloodDonationDirectory = bloodDonationDirectory;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
    
    
    
}
