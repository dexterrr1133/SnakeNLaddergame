/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.HashMap;
import javax.swing.Timer;


public class SnakeNLadderWindow extends javax.swing.JFrame {
    private String player1Name;
    private String player2Name;
    private static final int BOARD_SIZE = 30;
    private int[] playerPositions = new int[2];
    private int currentPlayer = 1;
    private int animationStep = 0;
    private Timer timer;
    private HashMap<Integer, Integer> snakePositions = new HashMap<>();
    private HashMap<Integer, Integer> ladderPositions = new HashMap<>();
    private ImageIcon[] diceImages = new ImageIcon[6];
    String path = "Dice\\";
    
    public SnakeNLadderWindow() {

        initComponents();
        
        playerPositions[0] = 1;
        playerPositions[1] = 1;
        
        timer = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            updatePlayerPositionAnimation();
            animationStep++;

            // Check if animation is complete and stop the timer
            if (animationStep >= 50) { // Adjust based on desired animation duration
                timer.stop();
                if (currentPlayer == 1){
                    currentPlayer = 2;
                } else{
                  currentPlayer = 1; 
                }// Switch player now
                
                String currentPlayerName;
                
                if (currentPlayer == 1){
                    currentPlayerName = player1Name;
                } else {
                    currentPlayerName = player2Name;
                }
                
                animationStep = 0; // Reset animation step for next time
                PlayerPositionDisplay.setText(currentPlayerName + "'s Turn"); // Update display
            }
        }
    });
        
        for (int i = 1; i <= 6; i++) {
            diceImages[i - 1] = createImageIcon(path + "Dice" + i + ".png");
        }
        /*Hashmaps for the Snake and Ladder Positions */
        snakePositions.put(17, 4);
        snakePositions.put(19, 7);
        snakePositions.put(21, 9);
        snakePositions.put(25, 13);
        snakePositions.put(27, 1);
        ladderPositions.put(3, 16);
        ladderPositions.put(5, 8);
        ladderPositions.put(11, 26);
        ladderPositions.put(20, 29);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Player1 = new javax.swing.JLabel();
        Player2 = new javax.swing.JLabel();
        Board = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Player1DisplayName = new JLabel("Player 1");
        DiceLabel = new javax.swing.JLabel();
        Indicator = new javax.swing.JLabel();
        Player2DisplayName = new javax.swing.JLabel();
        PlayerPositionDisplay = new javax.swing.JLabel();
        RollButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1110, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        Player1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Players/Player1_New.png"))); // NOI18N
        Player1.setFocusable(false);
        jPanel1.add(Player1);
        Player1.setBounds(30, 550, 60, 74);

        Player2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Players/Player2_New.png"))); // NOI18N
        jPanel1.add(Player2);
        Player2.setBounds(40, 550, 50, 80);

        Board.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Snakes And Ladders.jpg"))); // NOI18N
        jPanel1.add(Board);
        Board.setBounds(0, 0, 736, 654);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 736, 660));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(null);

        Player1DisplayName.setBackground(new java.awt.Color(102, 102, 102));
        Player1DisplayName.setFont(new java.awt.Font("MS Gothic", 0, 24)); // NOI18N
        Player1DisplayName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(Player1DisplayName);
        Player1DisplayName.setBounds(130, 320, 190, 60);

        DiceLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dice/Dice1.png"))); // NOI18N
        jPanel2.add(DiceLabel);
        DiceLabel.setBounds(90, 40, 240, 210);

        Indicator.setBackground(new java.awt.Color(0, 0, 0));
        Indicator.setText("Indicator");
        Indicator.setOpaque(true);
        jPanel2.add(Indicator);
        Indicator.setBounds(270, 560, 47, 16);

        Player2DisplayName.setFont(new java.awt.Font("MS Gothic", 0, 24)); // NOI18N
        Player2DisplayName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Player2DisplayName.setText("Player 2");
        jPanel2.add(Player2DisplayName);
        Player2DisplayName.setBounds(160, 550, 96, 25);

        PlayerPositionDisplay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PlayerPositionDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerPositionDisplay.setText("PlayerPositionDisplay");
        PlayerPositionDisplay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(PlayerPositionDisplay);
        PlayerPositionDisplay.setBounds(10, 710, 380, 70);

        RollButton.setBackground(new java.awt.Color(204, 204, 204));
        RollButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Roll_Button.png"))); // NOI18N
        RollButton.setBorder(null);
        RollButton.setBorderPainted(false);
        RollButton.setDefaultCapable(false);
        RollButton.setFocusPainted(false);
        RollButton.setFocusable(false);
        RollButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RollButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        RollButton.setOpaque(true);
        RollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollButtonActionPerformed(evt);
            }
        });
        jPanel2.add(RollButton);
        RollButton.setBounds(60, 880, 285, 80);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 0, 400, 1080));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BGG.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 0, 1920, 1080));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void RollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollButtonActionPerformed

        if (RollButton.isEnabled()){
            
        int diceValue = (int) (Math.random() * 6 + 1);
        
        for (int i = 0; i < 20; i++) {
            int randomIndex = (int) (Math.random() * 6);
            DiceLabel.setIcon(diceImages[randomIndex]);
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        DiceLabel.setIcon(diceImages[diceValue - 1]);
        
        int newPosition = playerPositions[currentPlayer - 1] + diceValue;
        
        String currentPlayerName;
        if (currentPlayer == 1){
            currentPlayerName = player1Name;
        } else {
            currentPlayerName = player2Name;
        }
        
        // Check for snake and ladder positions
        if (snakePositions.containsKey(newPosition)) {
            newPosition = snakePositions.get(newPosition);
            PlayerPositionDisplay.setText(currentPlayerName + " - Snake bite! Moved to: " + newPosition);
        } else if (ladderPositions.containsKey(newPosition)) {
            newPosition = ladderPositions.get(newPosition);
            PlayerPositionDisplay.setText(currentPlayerName + " - Ladder climb! Moved to: " + newPosition);
        } else {
            PlayerPositionDisplay.setText(currentPlayerName+ " - Moved to: " + newPosition);
        }

        playerPositions[currentPlayer - 1] = newPosition;

        if (playerPositions[0] == BOARD_SIZE) {
            PlayerPositionDisplay.setText(currentPlayerName + " wins!");
            RollButton.setEnabled(false);
            WinnerWindow();
        }
        else if (playerPositions[1] == BOARD_SIZE){
            PlayerPositionDisplay.setText(currentPlayerName + " wins!");
            RollButton.setEnabled(false);
            WinnerWindow();
            
        }
        timer.start();
        } else {
            PlayerPositionDisplay.setText("Player " + currentPlayer + ", wait for your turn!!");
        }
    }//GEN-LAST:event_RollButtonActionPerformed
    
    private void updatePlayerPositionAnimation() {
        int targetX = 0;
        int targetY = 0;
    
        if (currentPlayer == 1){
            switch(playerPositions[0]){
                    case 1:
                        targetX = 30;
                        targetY = 550;
                        break;
                    case 2:
                        targetX = 160;
                        targetY = 550;
                        break;
                    case 3:
                        targetX = 290;
                        targetY = 550;
                        break;
                    case 4:
                        targetX = 400;
                        targetY = 550;
                        break;
                    case 5:
                        targetX = 520;
                        targetY = 420;
                        break;
                    case 6:
                        targetX = 650;
                        targetY = 550;
                        break;
                    case 7:
                        targetX = 650;
                        targetY = 420;
                        break;
                    case 8:
                        targetX = 520;
                        targetY = 420;
                        break;
                    case 9:
                        targetX = 400;
                        targetY = 420;
                        break;
                    case 10:
                        targetX = 290;
                        targetY = 420;
                        break;
                    case 11:
                        targetX = 160;
                        targetY = 420;
                        break;
                    case 12:
                        targetX = 30;
                        targetY = 420;
                        break;
                    case 13:
                        targetX = 30;
                        targetY = 290;
                        break;
                    case 14:
                        targetX = 160;
                        targetY = 290;
                        break;
                    case 15:
                        targetX = 290;
                        targetY = 290;
                        break;
                    case 16:
                        targetX = 400;
                        targetY = 290;
                        break;
                    case 17:
                        targetX = 520;
                        targetY = 290;
                        break;
                    case 18:
                        targetX = 650;
                        targetY = 290;
                        break;
                    case 19:
                        targetX = 650;
                        targetY = 160;
                        break;
                    case 20:
                        targetX = 520;
                        targetY = 160;
                        break;
                    case 21:
                        targetX = 400;
                        targetY = 160;
                        break;
                    case 22:
                        targetX = 290;
                        targetY = 160;
                        break;
                    case 23:
                        targetX = 160;
                        targetY = 160;
                        break;
                    case 24:
                        targetX = 30;
                        targetY = 160;
                        break;
                    case 25:
                        targetX = 30;
                        targetY = 30;
                        break;
                    case 26:
                        targetX = 160;
                        targetY = 30;
                        break;
                    case 27:
                        targetX = 290;
                        targetY = 30;
                        break;
                    case 28:
                        targetX = 400;
                        targetY = 30;
                        break;
                    case 29:
                        targetX = 520;
                        targetY = 30;
                        break;
                    case 30:
                        targetX = 645;
                        targetY = 30;
                        break;
                    default:
                        if (playerPositions[0] > 30){
                        playerPositions[0] = 1;
                        }
                        break;
                }

            int currentX = Player1.getLocation().x;
            int currentY = Player1.getLocation().y;
            
            int steps = animationStep * 2;
            int newX = (int) (currentX + ((targetX - currentX) * (double) steps / 100));
            int newY = (int) (currentY + ((targetY - currentY) * (double) steps / 100));

            Player1.setLocation(newX, newY);
        } else {
            switch(playerPositions[1]){
                case 1:
                    targetX = 40;
                    targetY = 550;
                    break;
                case 2:
                    targetX = 160;
                    targetY = 550;
                    break;
                case 3:
                    targetX = 290;
                    targetY = 550;
                    break;
                case 4:
                    targetX = 400;
                    targetY = 550;
                    break;
                case 5:
                    targetX = 520;
                    targetY = 420;
                    break;
                case 6:
                    targetX = 650;
                    targetY = 550;
                    break;
                case 7:
                    targetX = 650;
                    targetY = 420;
                    break;
                case 8:
                    targetX = 520;
                    targetY = 420;
                    break;
                case 9:
                    targetX = 400;
                    targetY = 420;
                    break;
                case 10:
                    targetX = 290;
                    targetY = 420;
                    break;
                case 11:
                    targetX = 160;
                    targetY = 420;
                    break;
                case 12:
                    targetX = 30;
                    targetY = 420;
                    break;
                case 13:
                    targetX = 30;
                    targetY = 290;
                    break;
                case 14:
                    targetX = 160;
                    targetY = 290;
                    break;
                case 15:
                    targetX = 290;
                    targetY = 290;
                    break;
                case 16:
                    targetX = 400;
                    targetY = 290;
                    break;
                case 17:
                    targetX = 520;
                    targetY = 290;
                    break;
                case 18:
                    targetX = 650;
                    targetY = 290;
                    break;
                case 19:
                    targetX = 650;
                    targetY = 160;
                    break;
                case 20:
                    targetX = 520;
                    targetY = 160;
                    break;
                case 21:
                    targetX = 400;
                    targetY = 160;
                    break;
                case 22:
                    targetX = 290;
                    targetY = 160;
                    break;
                case 23:
                    targetX = 160;
                    targetY = 160;
                    break;
                case 24:
                    targetX = 30;
                    targetY = 160;
                    break;
                case 25:
                    targetX = 30;
                    targetY = 30;
                    break;
                case 26:
                    targetX = 160;
                    targetY = 30;
                    break;
                case 27:
                    targetX = 290;
                    targetY = 30;
                    break;
                case 28:
                    targetX = 400;
                    targetY = 30;
                    break;
                case 29:
                    targetX = 520;
                    targetY = 30;
                    break;
                case 30:
                    targetX = 645;
                    targetY = 30;
                    break;
                default:
                    if (playerPositions[1] > 30){
                    playerPositions[1] = 1;
                    }
                    break;
            }
    
        int currentX = Player2.getLocation().x;
        int currentY = Player2.getLocation().y;
    
        // Calculate intermediate position based on animation step
        int steps = animationStep * 2;
        int newX = (int) (currentX + ((targetX - currentX) * (double) steps / 100));
        int newY = (int) (currentY + ((targetY - currentY) * (double) steps / 100));
        Player2.setLocation(newX, newY);
        }
    }
    
    public void setPlayer1Name(String name) {
        this.player1Name = name;
        // Update label text after receiving the name
        Player1DisplayName.setText(name);
    }

    public void setPlayer2Name(String name) {
        this.player2Name = name;
        // Update label text after receiving the name
        Player2DisplayName.setText(name);
    }
    
    private void WinnerWindow(){
        WinnerWindow jf3 = new WinnerWindow();
        jf3.setVisible(true);
        dispose();
    }
    
    private ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SnakeNLadderWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Board;
    private javax.swing.JLabel DiceLabel;
    private javax.swing.JLabel Indicator;
    private javax.swing.JLabel Player1;
    private javax.swing.JLabel Player1DisplayName;
    private javax.swing.JLabel Player2;
    private javax.swing.JLabel Player2DisplayName;
    private javax.swing.JLabel PlayerPositionDisplay;
    public javax.swing.JButton RollButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
