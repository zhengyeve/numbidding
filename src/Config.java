/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class Config extends javax.swing.JFrame {

  /**
   * Creates new form Config
   */
  public Config() {
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

    titleLabelConfig = new javax.swing.JLabel();
    buttonPanel = new javax.swing.JPanel();
    startButton = new javax.swing.JButton();
    cancelButton = new javax.swing.JButton();
    okButton = new javax.swing.JButton();
    configItemPanel = new javax.swing.JPanel();
    maxBidderLabel = new javax.swing.JLabel();
    margin2 = new javax.swing.JPanel();
    margin1 = new javax.swing.JPanel();
    maxBidderField = new javax.swing.JTextField();
    timerLabel = new javax.swing.JLabel();
    margin3 = new javax.swing.JPanel();
    margin4 = new javax.swing.JPanel();
    timerField = new javax.swing.JTextField();
    placementLabel = new javax.swing.JLabel();
    margin5 = new javax.swing.JPanel();
    margin6 = new javax.swing.JPanel();
    bidPlacement1Field = new javax.swing.JTextField();
    margin7 = new javax.swing.JPanel();
    bidPlacement2Field = new javax.swing.JTextField();
    margin8 = new javax.swing.JPanel();
    bidPlacement3Field = new javax.swing.JTextField();
    margin9 = new javax.swing.JPanel();
    bidPlacement4Field = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    titleLabelConfig.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    titleLabelConfig.setText("Configuration");
    getContentPane().add(titleLabelConfig, java.awt.BorderLayout.PAGE_START);

    startButton.setText("Start Bidding");
    startButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        startButtonMouseClicked(evt);
      }
    });

    cancelButton.setText("Cancel");

    okButton.setText("OK");

    javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
    buttonPanel.setLayout(buttonPanelLayout);
    buttonPanelLayout.setHorizontalGroup(
      buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
        .addContainerGap(55, Short.MAX_VALUE)
        .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );
    buttonPanelLayout.setVerticalGroup(
      buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
        .addContainerGap(173, Short.MAX_VALUE)
        .addComponent(okButton)
        .addGap(18, 18, 18)
        .addComponent(cancelButton)
        .addGap(18, 18, 18)
        .addComponent(startButton)
        .addContainerGap())
    );

    getContentPane().add(buttonPanel, java.awt.BorderLayout.LINE_END);

    configItemPanel.setLayout(new java.awt.GridLayout(9, 2));

    maxBidderLabel.setText("Set Max Bidder Number");
    configItemPanel.add(maxBidderLabel);

    javax.swing.GroupLayout margin2Layout = new javax.swing.GroupLayout(margin2);
    margin2.setLayout(margin2Layout);
    margin2Layout.setHorizontalGroup(
      margin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 159, Short.MAX_VALUE)
    );
    margin2Layout.setVerticalGroup(
      margin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 32, Short.MAX_VALUE)
    );

    configItemPanel.add(margin2);

    javax.swing.GroupLayout margin1Layout = new javax.swing.GroupLayout(margin1);
    margin1.setLayout(margin1Layout);
    margin1Layout.setHorizontalGroup(
      margin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 159, Short.MAX_VALUE)
    );
    margin1Layout.setVerticalGroup(
      margin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 32, Short.MAX_VALUE)
    );

    configItemPanel.add(margin1);

    maxBidderField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    maxBidderField.setText("10");
    configItemPanel.add(maxBidderField);

    timerLabel.setText("Set Timer (second)");
    configItemPanel.add(timerLabel);

    javax.swing.GroupLayout margin3Layout = new javax.swing.GroupLayout(margin3);
    margin3.setLayout(margin3Layout);
    margin3Layout.setHorizontalGroup(
      margin3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 159, Short.MAX_VALUE)
    );
    margin3Layout.setVerticalGroup(
      margin3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 32, Short.MAX_VALUE)
    );

    configItemPanel.add(margin3);

    javax.swing.GroupLayout margin4Layout = new javax.swing.GroupLayout(margin4);
    margin4.setLayout(margin4Layout);
    margin4Layout.setHorizontalGroup(
      margin4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 159, Short.MAX_VALUE)
    );
    margin4Layout.setVerticalGroup(
      margin4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 32, Short.MAX_VALUE)
    );

    configItemPanel.add(margin4);

    timerField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    timerField.setText("10");
    configItemPanel.add(timerField);

    placementLabel.setText("Set Bidding Placement Options ($)");
    configItemPanel.add(placementLabel);

    javax.swing.GroupLayout margin5Layout = new javax.swing.GroupLayout(margin5);
    margin5.setLayout(margin5Layout);
    margin5Layout.setHorizontalGroup(
      margin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 159, Short.MAX_VALUE)
    );
    margin5Layout.setVerticalGroup(
      margin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 32, Short.MAX_VALUE)
    );

    configItemPanel.add(margin5);

    javax.swing.GroupLayout margin6Layout = new javax.swing.GroupLayout(margin6);
    margin6.setLayout(margin6Layout);
    margin6Layout.setHorizontalGroup(
      margin6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 159, Short.MAX_VALUE)
    );
    margin6Layout.setVerticalGroup(
      margin6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 32, Short.MAX_VALUE)
    );

    configItemPanel.add(margin6);

    bidPlacement1Field.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    bidPlacement1Field.setText("10");
    configItemPanel.add(bidPlacement1Field);

    javax.swing.GroupLayout margin7Layout = new javax.swing.GroupLayout(margin7);
    margin7.setLayout(margin7Layout);
    margin7Layout.setHorizontalGroup(
      margin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 159, Short.MAX_VALUE)
    );
    margin7Layout.setVerticalGroup(
      margin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 32, Short.MAX_VALUE)
    );

    configItemPanel.add(margin7);

    bidPlacement2Field.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    bidPlacement2Field.setText("20");
    configItemPanel.add(bidPlacement2Field);

    javax.swing.GroupLayout margin8Layout = new javax.swing.GroupLayout(margin8);
    margin8.setLayout(margin8Layout);
    margin8Layout.setHorizontalGroup(
      margin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 159, Short.MAX_VALUE)
    );
    margin8Layout.setVerticalGroup(
      margin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 32, Short.MAX_VALUE)
    );

    configItemPanel.add(margin8);

    bidPlacement3Field.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    bidPlacement3Field.setText("30");
    configItemPanel.add(bidPlacement3Field);

    javax.swing.GroupLayout margin9Layout = new javax.swing.GroupLayout(margin9);
    margin9.setLayout(margin9Layout);
    margin9Layout.setHorizontalGroup(
      margin9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 159, Short.MAX_VALUE)
    );
    margin9Layout.setVerticalGroup(
      margin9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 32, Short.MAX_VALUE)
    );

    configItemPanel.add(margin9);

    bidPlacement4Field.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    bidPlacement4Field.setText("40");
    configItemPanel.add(bidPlacement4Field);

    getContentPane().add(configItemPanel, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseClicked

  }//GEN-LAST:event_startButtonMouseClicked

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
      java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Config().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField bidPlacement1Field;
  private javax.swing.JTextField bidPlacement2Field;
  private javax.swing.JTextField bidPlacement3Field;
  private javax.swing.JTextField bidPlacement4Field;
  private javax.swing.JPanel buttonPanel;
  private javax.swing.JButton cancelButton;
  private javax.swing.JPanel configItemPanel;
  private javax.swing.JPanel margin1;
  private javax.swing.JPanel margin2;
  private javax.swing.JPanel margin3;
  private javax.swing.JPanel margin4;
  private javax.swing.JPanel margin5;
  private javax.swing.JPanel margin6;
  private javax.swing.JPanel margin7;
  private javax.swing.JPanel margin8;
  private javax.swing.JPanel margin9;
  private javax.swing.JTextField maxBidderField;
  private javax.swing.JLabel maxBidderLabel;
  private javax.swing.JButton okButton;
  private javax.swing.JLabel placementLabel;
  private javax.swing.JButton startButton;
  private javax.swing.JTextField timerField;
  private javax.swing.JLabel timerLabel;
  private javax.swing.JLabel titleLabelConfig;
  // End of variables declaration//GEN-END:variables
}
