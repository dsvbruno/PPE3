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
import org.eclipse.persistence.internal.jpa.metadata.accessors.classes.InterfaceAccessor;

/**
 *
 * @author bruno
 */
public class GererRoles extends java.awt.Dialog {

    private InterfaceGraphique fenetre;

    /**
     * Creates new form GererRoles
     */
    public GererRoles(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPaneGererRoles = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxRole = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jButtonValider = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jDesktopPaneGererRoles.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setLabelFor(jDesktopPaneGererRoles);
        jLabel1.setText("Gestion des Rôles");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nom: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Rôle: ");

        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employé", "Responsable" }));
        jComboBoxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRoleActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Prénom: ");

        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        jDesktopPaneGererRoles.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneGererRoles.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneGererRoles.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneGererRoles.setLayer(jComboBoxRole, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneGererRoles.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneGererRoles.setLayer(jTextFieldNom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneGererRoles.setLayer(jTextFieldPrenom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneGererRoles.setLayer(jButtonValider, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneGererRolesLayout = new javax.swing.GroupLayout(jDesktopPaneGererRoles);
        jDesktopPaneGererRoles.setLayout(jDesktopPaneGererRolesLayout);
        jDesktopPaneGererRolesLayout.setHorizontalGroup(
            jDesktopPaneGererRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneGererRolesLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jDesktopPaneGererRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPaneGererRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPaneGererRolesLayout.createSequentialGroup()
                            .addGroup(jDesktopPaneGererRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGap(23, 23, 23)
                            .addGroup(jDesktopPaneGererRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxRole, 0, 170, Short.MAX_VALUE)
                                .addComponent(jTextFieldNom)
                                .addComponent(jTextFieldPrenom)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jDesktopPaneGererRolesLayout.setVerticalGroup(
            jDesktopPaneGererRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneGererRolesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jDesktopPaneGererRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jDesktopPaneGererRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jDesktopPaneGererRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonValider)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jDesktopPaneGererRoles);
        jDesktopPaneGererRoles.setBounds(0, 0, 400, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void jComboBoxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRoleActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        if (jTextFieldNom.getText().length() == 0 || jTextFieldPrenom.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Erreur de saisie, tout les champs doivent être renseignés.");
            this.fenetre.deconnecte();
        } else {
            try {
                //mise en place de la connexion à la bdd
                //interrogation de la BD pour savoir si l'identifiant/mot de passe est correct
                //instanciation de la classe Driver du paquetage jdbc de mysql
                Class.forName("com.mysql.jdbc.Driver");
                //Chaine de connexion (prise dans l'onglet services)
                String connexionUrl = "jdbc:mysql://localhost:3333/GSBPerso?user=GSBPerso&password=toto";

                //etablissement de la connexion
                Connection ct = (Connection) DriverManager.getConnection(connexionUrl);
                BddConnect.getInstance();

                //requete
                Statement requete = ct.createStatement();
                String nom = jTextFieldNom.getText();
                String prenom = jTextFieldPrenom.getText();
                int lerole = jComboBoxRole.getSelectedIndex() + 1;
                String requeteSql = "UPDATE utilisateurs SET id_role = " + lerole + " WHERE nom = '" + nom + "' AND prenom = '" + prenom + "'";
                Integer LigneRetournees = BddConnect.requeteAction(requeteSql);
                if (LigneRetournees == 1) {
                    JOptionPane.showMessageDialog(this, "Modification du rôle réussie. ");
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(this, "Un des champs renseignés est faux. ");
                }
            } catch (SQLException ex) {
                Logger.getLogger(GererRoles.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GererRoles.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButtonValiderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GererRoles dialog = new GererRoles(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonValider;
    private javax.swing.JComboBox<String> jComboBoxRole;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPaneGererRoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    // End of variables declaration//GEN-END:variables
}