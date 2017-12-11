/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maiwenn
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ResultSet lesEtudiants = SdzConnection.requeteSelection("select * from utilisateurs");
        if (lesEtudiants != null) {
            try {
                while (lesEtudiants.next()) {
                    System.out.println(lesEtudiants.getObject("nom"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(SdzConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
