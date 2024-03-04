/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.*;
import java.awt.event.*;

public class EnterPlayerNames extends javax.swing.JFrame {

    /**
     * Creates new form EnterPlayerNames
     */
    public EnterPlayerNames() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Player1Input = new javax.swing.JTextField();
        Player2Input = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Play_BTN.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, 570, -1));

        Player1Input.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        Player1Input.setForeground(new java.awt.Color(204, 153, 0));
        Player1Input.setText("Enter");
        Player1Input.setBorder(null);
        Player1Input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Player1InputMouseClicked(evt);
            }
        });
        Player1Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player1InputActionPerformed(evt);
            }
        });
        getContentPane().add(Player1Input, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 260, 60));

        Player2Input.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        Player2Input.setForeground(new java.awt.Color(204, 153, 0));
        Player2Input.setText("Enter");
        Player2Input.setBorder(null);
        Player2Input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Player2InputMouseClicked(evt);
            }
        });
        Player2Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player2InputActionPerformed(evt);
            }
        });
        getContentPane().add(Player2Input, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 435, 260, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Player1_Insert name.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, 133));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Player2_insertName.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGG.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, 0, 1600, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Player1InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player1InputActionPerformed
        
    }//GEN-LAST:event_Player1InputActionPerformed

    private void Player2InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player2InputActionPerformed
        
    }//GEN-LAST:event_Player2InputActionPerformed

    private void Player1InputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Player1InputMouseClicked
        Player1Input.setText("");
    }//GEN-LAST:event_Player1InputMouseClicked

    private void Player2InputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Player2InputMouseClicked
        Player2Input.setText("");
    }//GEN-LAST:event_Player2InputMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String player1Name = Player1Input.getText();
        String player2Name = Player2Input.getText();

        // Validate the names (optional)
        // ... (Add validation logic similar to Player 1)

        // Create the SnakeNLadderWindow (assuming it doesn't require the names)
        SnakeNLadderWindow snakenladder = new SnakeNLadderWindow();

        // Optionally pass the names to the SnakeNLadderWindow (if it needs them)
        snakenladder.setPlayer1Name(player1Name);
        snakenladder.setPlayer2Name(player2Name); // Assuming there's a setPlayer2Name method

        // Make the SnakeNLadderWindow visible
        snakenladder.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EnterPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterPlayerNames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnterPlayerNames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Player1Input;
    private javax.swing.JTextField Player2Input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
