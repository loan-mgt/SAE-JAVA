/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sae;

import java.awt.event.WindowAdapter;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;
import javax.swing.plaf.FileChooserUI;

/**
 *
 * @author Loan
 */
public class Fenetre extends javax.swing.JFrame {
    
    Map m = new Map();
    JFileChooser fileChooser;
    
    

    /**
     * Creates new form Fenetre
     */
    public Fenetre() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
             
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        myinit();
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        subPanelChanger = new javax.swing.JPanel();
        labelMode = new javax.swing.JLabel();
        modeChooser = new javax.swing.JComboBox<>();
        subPanelInfo = new javax.swing.JPanel();
        colorFileLoading = new javax.swing.JPanel();
        labelFileLoading = new javax.swing.JLabel();
        labelLocating = new javax.swing.JLabel();
        colorLocating = new javax.swing.JPanel();
        labelNbrNoeuds = new javax.swing.JLabel();
        nbrNoeuds = new javax.swing.JLabel();
        labelNbrLiens = new javax.swing.JLabel();
        nbrLiens = new javax.swing.JLabel();
        carte = new sae.Carte();
        menuBar = new javax.swing.JMenuBar();
        menuFichier = new javax.swing.JMenu();
        itemOuvrir = new javax.swing.JMenuItem();
        menuEdition = new javax.swing.JMenu();
        itemRedispose = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidePanel.setLayout(new java.awt.BorderLayout(10, 10));

        subPanelChanger.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 10));
        subPanelChanger.setLayout(new java.awt.GridLayout(1, 2));

        labelMode.setText("jLabel1");
        subPanelChanger.add(labelMode);

        modeChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        subPanelChanger.add(modeChooser);

        sidePanel.add(subPanelChanger, java.awt.BorderLayout.PAGE_START);

        colorFileLoading.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout colorFileLoadingLayout = new javax.swing.GroupLayout(colorFileLoading);
        colorFileLoading.setLayout(colorFileLoadingLayout);
        colorFileLoadingLayout.setHorizontalGroup(
            colorFileLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        colorFileLoadingLayout.setVerticalGroup(
            colorFileLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelFileLoading.setText("Chargement du Fichier");

        labelLocating.setText("Positionnement");

        colorLocating.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout colorLocatingLayout = new javax.swing.GroupLayout(colorLocating);
        colorLocating.setLayout(colorLocatingLayout);
        colorLocatingLayout.setHorizontalGroup(
            colorLocatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        colorLocatingLayout.setVerticalGroup(
            colorLocatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelNbrNoeuds.setText("Nombre de Noeuds");

        nbrNoeuds.setText("0");

        labelNbrLiens.setText("Nombre de Liens");

        nbrLiens.setText("0");

        javax.swing.GroupLayout subPanelInfoLayout = new javax.swing.GroupLayout(subPanelInfo);
        subPanelInfo.setLayout(subPanelInfoLayout);
        subPanelInfoLayout.setHorizontalGroup(
            subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelInfoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelInfoLayout.createSequentialGroup()
                        .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNbrNoeuds)
                            .addComponent(labelNbrLiens))
                        .addGap(32, 32, 32)
                        .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nbrLiens)
                            .addComponent(nbrNoeuds)))
                    .addGroup(subPanelInfoLayout.createSequentialGroup()
                        .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colorFileLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorLocating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLocating)
                            .addComponent(labelFileLoading))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        subPanelInfoLayout.setVerticalGroup(
            subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelInfoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(colorFileLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFileLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(colorLocating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelLocating))
                .addGap(30, 30, 30)
                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNbrNoeuds)
                    .addComponent(nbrNoeuds))
                .addGap(26, 26, 26)
                .addGroup(subPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNbrLiens)
                    .addComponent(nbrLiens))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        sidePanel.add(subPanelInfo, java.awt.BorderLayout.CENTER);

        getContentPane().add(sidePanel, java.awt.BorderLayout.EAST);

        carte.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout carteLayout = new javax.swing.GroupLayout(carte);
        carte.setLayout(carteLayout);
        carteLayout.setHorizontalGroup(
            carteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        carteLayout.setVerticalGroup(
            carteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        getContentPane().add(carte, java.awt.BorderLayout.CENTER);

        menuFichier.setText("Fichier");

        itemOuvrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemOuvrir.setText("Ouvrir csv");
        itemOuvrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOuvrirActionPerformed(evt);
            }
        });
        menuFichier.add(itemOuvrir);

        menuBar.add(menuFichier);

        menuEdition.setText("Edition");

        itemRedispose.setText("Redisposer");
        itemRedispose.setEnabled(false);
        itemRedispose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRedisposeActionPerformed(evt);
            }
        });
        menuEdition.add(itemRedispose);

        menuBar.add(menuEdition);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void myinit(){
        fileChooser = new JFileChooser();
        //fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.setCurrentDirectory(new File("D:/COUR/2022/JAVA/sae-java"));
        
        carte.addColorIndicator(colorLocating);
        m.addColorIndicator(colorFileLoading);
        
        
       
    }
    private void itemOuvrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOuvrirActionPerformed
        
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            
            itemRedispose.setEnabled(true);
            File selectedFile = fileChooser.getSelectedFile();
            m.loadMap(selectedFile.getAbsolutePath());
            carte.setToDraw(m.listeVilles);
            carte.setToDrawLiens(m.listeRoutes);
            Thread newThread = new Thread(() -> {
            carte.init();
            });
            newThread.start();
            nbrLiens.setText(Integer.toString(m.listeVilles.size()));
            nbrNoeuds.setText(Integer.toString(m.listeRoutes.size()));
            
        }
    }//GEN-LAST:event_itemOuvrirActionPerformed

    private void itemRedisposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRedisposeActionPerformed
       
            carte.init();
      
    }//GEN-LAST:event_itemRedisposeActionPerformed
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sae.Carte carte;
    private javax.swing.JPanel colorFileLoading;
    private javax.swing.JPanel colorLocating;
    private javax.swing.JMenuItem itemOuvrir;
    private javax.swing.JMenuItem itemRedispose;
    private javax.swing.JLabel labelFileLoading;
    private javax.swing.JLabel labelLocating;
    private javax.swing.JLabel labelMode;
    private javax.swing.JLabel labelNbrLiens;
    private javax.swing.JLabel labelNbrNoeuds;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdition;
    private javax.swing.JMenu menuFichier;
    private javax.swing.JComboBox<String> modeChooser;
    private javax.swing.JLabel nbrLiens;
    private javax.swing.JLabel nbrNoeuds;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel subPanelChanger;
    private javax.swing.JPanel subPanelInfo;
    // End of variables declaration//GEN-END:variables
}