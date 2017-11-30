/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;
import userinterface.ReceptionistRole.ReceptionistWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ReceptionistRole extends Role{
    
    private ReceptionistOrganization receptionistOrganization;
    
    DonorDirectory donorDirectory;
    @Override
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        if (donorDirectory==null){
            donorDirectory=new DonorDirectory();
        }
                    
        return new ReceptionistWorkAreaJPanel(userProcessContainer, account, (ReceptionistOrganization)organization, enterprise,donorDirectory);
    }
    
    
}
