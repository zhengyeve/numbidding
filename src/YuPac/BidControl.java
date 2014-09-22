/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YuPac;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author yufan
 */
public class BidControl extends javax.swing.JFrame {

    private int currentPrice = 20;
    private int currentBid = 0;
    private int highestBidder;
    
    /**
     * Timeout for biding
     */
    public static int timeout = 30;
    private Timer tmr;
    
    private boolean pausedflag;
    /**
     * Creates new form BidControl
     */
    public BidControl() {
        initComponents();
        tmr = new Timer(1000, new TimerListener());
        pausedflag=false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pauseButton = new javax.swing.JButton();
        endButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();
        redoButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        currentPriceLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbHighBidder = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        placementValue1 = new javax.swing.JButton();
        placementValue2 = new javax.swing.JButton();
        placementValue3 = new javax.swing.JButton();
        placementValue4 = new javax.swing.JButton();
        placementValue5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfBidderID = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pauseButton.setText("Pause");
        pauseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pauseButtonMouseClicked(evt);
            }
        });

        endButton.setText("End");
        endButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                endButtonMouseClicked(evt);
            }
        });

        undoButton.setText("Undo");

        redoButton.setText("Redo");

        settingsButton.setText("Settings");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pauseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(undoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(settingsButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pauseButton)
                    .addComponent(endButton)
                    .addComponent(undoButton)
                    .addComponent(redoButton)
                    .addComponent(settingsButton))
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.GridLayout(4, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("800-BUY-HOME");
        jPanel2.add(jLabel2);

        currentPriceLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        currentPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentPriceLabel.setText("$20.00");
        jPanel2.add(currentPriceLabel);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("00:00:30");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);

        lbHighBidder.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbHighBidder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHighBidder.setText("Highest Bidder: ");
        jPanel2.add(lbHighBidder);

        placementValue1.setText("$10");
        placementValue1.setBorderPainted(false);
        placementValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placementValue1ActionPerformed(evt);
            }
        });

        placementValue2.setText("$20");
        placementValue2.setToolTipText("");
        placementValue2.setBorderPainted(false);
        placementValue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placementValue2ActionPerformed(evt);
            }
        });

        placementValue3.setText("$30");
        placementValue3.setBorderPainted(false);
        placementValue3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placementValue3ActionPerformed(evt);
            }
        });

        placementValue4.setText("$40");
        placementValue4.setBorderPainted(false);
        placementValue4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placementValue4ActionPerformed(evt);
            }
        });

        placementValue5.setText("$50");
        placementValue5.setBorderPainted(false);
        placementValue5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placementValue5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placementValue2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placementValue3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placementValue4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placementValue5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(placementValue1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(placementValue1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placementValue2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placementValue3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placementValue4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placementValue5)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Bid For Your Business");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Enter Bidder ID");

        tfBidderID.setText("ID");
        tfBidderID.setEnabled(false);
        tfBidderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBidderIDActionPerformed(evt);
            }
        });

        btnSubmit.setText("OK");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenu3.setText("jMenu3");
        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfBidderID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfBidderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSubmit)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void endButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_endButtonMouseClicked
    // TODO add your handling code here:
    endBid();
  }//GEN-LAST:event_endButtonMouseClicked

  private void endBid() {
    this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    this.setVisible(false);
    this.dispose();
    javax.swing.JFrame result = new ResultDisplay(currentPrice, highestBidder);
    result.setVisible(true);
  }
  
  private void tfBidderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBidderIDActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tfBidderIDActionPerformed

    private void placementValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placementValue1ActionPerformed
        // TODO add your handling code here:
        enableTfBidderID(10, (JButton)evt.getSource());
        renewTimer();
        placementValue1.setSelected(true);
    }//GEN-LAST:event_placementValue1ActionPerformed

    private void placementValue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placementValue2ActionPerformed
        // TODO add your handling code here:
        enableTfBidderID(20, (JButton)evt.getSource());
        renewTimer();
    }//GEN-LAST:event_placementValue2ActionPerformed

    private void placementValue3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placementValue3ActionPerformed
        // TODO add your handling code here:
        enableTfBidderID(30, (JButton)evt.getSource());
        renewTimer();
    }//GEN-LAST:event_placementValue3ActionPerformed

    private void placementValue4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placementValue4ActionPerformed
        // TODO add your handling code here:
        enableTfBidderID(40, (JButton)evt.getSource());
        renewTimer();
    }//GEN-LAST:event_placementValue4ActionPerformed

    private void placementValue5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placementValue5ActionPerformed
        // TODO add your handling code here:
        enableTfBidderID(50, (JButton)evt.getSource());
        renewTimer();
    }//GEN-LAST:event_placementValue5ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (currentBid > 0)
        {
            if (isInteger(tfBidderID.getText()))
            {
                currentPrice += currentBid;
                currentPriceLabel.setText("$"+currentPrice+".00");
                highestBidder = Integer.parseInt(tfBidderID.getText());
                lbHighBidder.setText("Highest Bidder: "+ highestBidder);
                // reset
                currentBid = 0;
                tfBidderID.setEnabled(false);
                tfBidderID.setText("ID");
                resetBtnPlacementColor();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Bidder ID must be a number.");
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private class TimerListener implements ActionListener{
 
        @Override
        public void actionPerformed(ActionEvent event) {
            // TODO Auto-generated method stub
             timeout--;
             String timeoutStr = String.valueOf(timeout);
             if(timeout < 10) {
                 timeoutStr = "0" + timeoutStr;
             }
             jLabel4.setText("00:00:" +timeoutStr);
             if (timeout == 0) {
                 renewTimer();
                 endBid();
             }
        }
         
    }
    
    private void renewTimer() {
        timeout=30;
        tmr.stop();
        jLabel4.setText("00:00:" +timeout);
        jLabel4.setEnabled(true);
    }
    
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if(jLabel4.isEnabled()) {
            jLabel4.setEnabled(false);
            tmr.start();
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void pauseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseButtonMouseClicked
        // TODO add your handling code here:
        if(!pausedflag && jLabel4.isEnabled() == false) {
           tmr.stop();
           pausedflag = true;
        }else if(pausedflag && jLabel4.isEnabled() == false) {
            tmr.start();
            pausedflag = false;
        }
    }//GEN-LAST:event_pauseButtonMouseClicked

    private void enableTfBidderID(int bid, JButton btnPlacement)
    {
        currentBid = bid;
        
        resetBtnPlacementColor();
        btnPlacement.setBackground(Color.white);
        tfBidderID.setEnabled(true);
        tfBidderID.requestFocus();
        tfBidderID.setText(null);
    }
    
    private void resetBtnPlacementColor()
    {
        placementValue1.setBackground(null);
        placementValue2.setBackground(null);
        placementValue3.setBackground(null);
        placementValue4.setBackground(null);
        placementValue5.setBackground(null);
    }
    
    public boolean isInteger(String input)  
    {
        try
        {
            Integer.parseInt(input);
            return true;
        }
        catch(Exception e)
        {  
            return false;  
        }  
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
            java.util.logging.Logger.getLogger(BidControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BidControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BidControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BidControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BidControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel currentPriceLabel;
    private javax.swing.JButton endButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbHighBidder;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton placementValue1;
    private javax.swing.JButton placementValue2;
    private javax.swing.JButton placementValue3;
    private javax.swing.JButton placementValue4;
    private javax.swing.JButton placementValue5;
    private javax.swing.JButton redoButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JTextField tfBidderID;
    private javax.swing.JButton undoButton;
    // End of variables declaration//GEN-END:variables
}
