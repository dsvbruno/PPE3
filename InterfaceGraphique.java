/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import javax.swing.JOptionPane;

/**
 *
 * @author nc
 */
public class InterfaceGraphique extends javax.swing.JFrame {

    /**
     * attribut qui indique si l'etudiant est connecté ou non
     */
    private boolean connecte;
    private Etudiants infoEtudiant;

    /**
     * interface graphique
     */
    private Connexion fenConnexion;
    private Deconnexion fenDeconnexion;
    private Inscription fenInscription;

    /**
     * constructeur : Creates new form InterfaceGraphique
     *
     */
    public InterfaceGraphique() {
        initComponents();
        //par defaut, la connexion est inactive
        this.connecte = false;
        //element du menu de deconnexion grisé
        this.majConnexion();
        //centrage
        this.setLocationRelativeTo(null);
        //titre 
        this.setTitle("Gestion des étudiants du bts sio");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        jButtonInscription = new javax.swing.JButton();
        jButtonConnexion = new javax.swing.JButton();
        nomMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItemInscription = new javax.swing.JMenuItem();
        connexionMenuItem = new javax.swing.JMenuItem();
        deconnexionMenuItem = new javax.swing.JMenuItem();
        SortieMenuItem = new javax.swing.JMenuItem();
        aideMenu = new javax.swing.JMenu();
        aproposMenuItem = new javax.swing.JMenuItem();
        nomjMenu = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setBorder(new javax.swing.border.MatteBorder(null));

        jButtonInscription.setText("S'inscrire");
        jButtonInscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInscriptionActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonInscription);
        jButtonInscription.setBounds(150, 40, 130, 23);

        jButtonConnexion.setText("Se connecter");
        jButtonConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnexionActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonConnexion);
        jButtonConnexion.setBounds(150, 80, 130, 23);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Etudiants");

        jMenuItemInscription.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemInscription.setText("Inscription");
        jMenuItemInscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInscriptionActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItemInscription);

        connexionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        connexionMenuItem.setMnemonic('o');
        connexionMenuItem.setText("Connexion");
        connexionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connexionMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(connexionMenuItem);

        deconnexionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        deconnexionMenuItem.setMnemonic('s');
        deconnexionMenuItem.setText("Déconnexion");
        deconnexionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnexionMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(deconnexionMenuItem);

        SortieMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SortieMenuItem.setMnemonic('x');
        SortieMenuItem.setText("Sortie");
        SortieMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortieMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(SortieMenuItem);

        nomMenuBar.add(fileMenu);

        aideMenu.setMnemonic('h');
        aideMenu.setText("Aide");

        aproposMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        aproposMenuItem.setMnemonic('c');
        aproposMenuItem.setText("A propos");
        aideMenu.add(aproposMenuItem);

        nomMenuBar.add(aideMenu);
        nomMenuBar.add(nomjMenu);

        setJMenuBar(nomMenuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SortieMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortieMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SortieMenuItemActionPerformed

    private void connexionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connexionMenuItemActionPerformed
        /**
         * création de la fenetre de connexion et attachement de cette dernière
         * à l'interface maj de connecte en retour
         */
        this.fenConnexion = new Connexion(this, true);
        this.fenConnexion.setVisible(true);
    }//GEN-LAST:event_connexionMenuItemActionPerformed

    private void deconnexionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnexionMenuItemActionPerformed
        // TODO add your handling code here:
        fenDeconnexion = new Deconnexion(this, true);
        this.fenDeconnexion.setVisible(true);
    }//GEN-LAST:event_deconnexionMenuItemActionPerformed

    private void jMenuItemInscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInscriptionActionPerformed
        fenInscription = new Inscription(this, true);
        this.fenInscription.setVisible(true);
    }//GEN-LAST:event_jMenuItemInscriptionActionPerformed

    private void jButtonConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnexionActionPerformed
        this.fenConnexion = new Connexion(this, true);
        this.fenConnexion.setVisible(true);
    }//GEN-LAST:event_jButtonConnexionActionPerformed

    private void jButtonInscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInscriptionActionPerformed
        fenInscription = new Inscription(this, true);
        this.fenInscription.setVisible(true);
    }//GEN-LAST:event_jButtonInscriptionActionPerformed
   
    public void connecte(String leNom) {
        //maj de l'etat de la connexion
        this.connecte = true;
        //ajout du nom dans la fenetre
        this.nomjMenu.setText("Connecté en tant que : " + leNom);
        this.nomjMenu.setEnabled(false);
    }

    public void deconnecte() {
        this.connecte = false;
        this.nomjMenu.setText(null);
    }

    public void majConnexion() {
        deconnexionMenuItem.setEnabled(this.connecte);
        connexionMenuItem.setEnabled(!this.connecte);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGraphique().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SortieMenuItem;
    private javax.swing.JMenu aideMenu;
    private javax.swing.JMenuItem aproposMenuItem;
    private javax.swing.JMenuItem connexionMenuItem;
    private javax.swing.JMenuItem deconnexionMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButtonConnexion;
    private javax.swing.JButton jButtonInscription;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemInscription;
    private javax.swing.JMenuBar nomMenuBar;
    private javax.swing.JMenu nomjMenu;
    // End of variables declaration//GEN-END:variables
}