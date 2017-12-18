/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import com.mysql.jdbc.Connection;
import java.security.NoSuchAlgorithmException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class BddConnect {

    private static String connexionUrl = "jdbc:mysql://localhost:3333/GSBPerso?user=GSBPerso&password=toto";
    private static Connection connect;

    public BddConnect() {
    }

    public static Connection getInstance() {
        if (connect == null) {
            try {
                connect = (Connection) DriverManager.getConnection(connexionUrl);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connect;
    }

    public static Statement getRequete(Connection instance) {
        Statement requete = null;
        try {
            requete = instance.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return requete;
    }

    public static ResultSet requeteSelection(String requeteSql) {
        if (connect == null) {
            BddConnect.getInstance();
            if (connect == null) {
                System.out.println("Requete impossible , la connexion n'est pas active");
                return null;
            }
        }
        try {
            Statement requete = BddConnect.getRequete(connect);
            return requete.executeQuery(requeteSql);
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'execution de la resquete SQL " + e.getMessage());
            return null;
        }

    }

    public static Integer requeteAction(String requeteSql) {
        if (connect == null) {
            BddConnect.getInstance();
            if (connect == null) {
                System.out.println("Requete impossible , la connexion n'est pas active");
                return 0;
            }
        }
        try {
            Statement requete = BddConnect.getRequete(connect);
            return requete.executeUpdate(requeteSql);
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'execution de la requète SQL \n Requete : " + requeteSql + "\n Erreur : " + e.getMessage());
            return 0;
        }

    }

}
