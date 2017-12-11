/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Maiwenn
 */
public class SdzConnection {

    private static ResultSet lesResultats = null;
    private static String ChaineConnection = "jdbc:mysql://localhost:3333/gsbperso";
    private static Connection laConnection = null;
    private static Statement maRequete;
    private static volatile SdzConnection instance = null;

    public final static Connection getInstance() {
        synchronized (SdzConnection.class) {
            try {
                SdzConnection.laConnection = (Connection) DriverManager.getConnection(SdzConnection.ChaineConnection, "GSBPerso", "toto");
            } catch (SQLException ex) {
                System.out.println("Erreur lors de la connexion " + ex.getMessage());
                SdzConnection.laConnection = null;
            }
        }
        return SdzConnection.laConnection;
    }

    public static ResultSet requeteSelection(String requeteSQL) {
        if (SdzConnection.laConnection == null) {
            SdzConnection.getInstance();
            if (SdzConnection.laConnection == null) {
                System.out.println("Requete selection impossible, la connexion n'est pas active");
                return null;
            }
        }
        try {
            SdzConnection.maRequete = SdzConnection.laConnection.createStatement();
            return SdzConnection.maRequete.executeQuery(requeteSQL);
        } catch (SQLException ex) {
            System.out.println("Erreur lors de l'éxécution de la requête SQL: " + ex.getMessage());
            return null;
        }
    }

    public Integer requeteAction(String requeteSQL) {
        if (SdzConnection.laConnection == null) {
            SdzConnection.getInstance();
            if (SdzConnection.laConnection == null) {
                System.out.println("Requete action impossible, la connexion n'est pas valide");
                return 0;
            }
        }
        try {
            SdzConnection.maRequete = SdzConnection.laConnection.createStatement();
            return SdzConnection.maRequete.executeUpdate(requeteSQL);
        } catch (SQLException ex) {
            System.out.println("Erreur lors de l'éxécution de la requête SQL: " + ex.getMessage());
            return 0;
        }
    }
}
