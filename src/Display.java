/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class Display extends javax.swing.JPanel {

  /**
   * Creates new form Display
   */
  public Display() {
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

    biddingPanel = new javax.swing.JPanel();
    placement1Label = new javax.swing.JLabel();
    palcement2Label = new javax.swing.JLabel();
    placement3Label = new javax.swing.JLabel();
    placement4Label = new javax.swing.JLabel();
    displayPanel = new javax.swing.JPanel();
    priceInfoLabel = new javax.swing.JLabel();
    bidderInfoLabel = new javax.swing.JLabel();
    timeInfoLabel = new javax.swing.JLabel();
    titlePanel = new javax.swing.JPanel();
    biddingInfoLabel = new javax.swing.JLabel();
    biddingItemLabel = new javax.swing.JLabel();

    setLayout(new java.awt.BorderLayout());

    biddingPanel.setLayout(new java.awt.GridLayout());

    placement1Label.setText("BP1");
    biddingPanel.add(placement1Label);

    palcement2Label.setText("BP2");
    biddingPanel.add(palcement2Label);

    placement3Label.setText("BP3");
    biddingPanel.add(placement3Label);

    placement4Label.setText("BP3");
    biddingPanel.add(placement4Label);

    add(biddingPanel, java.awt.BorderLayout.PAGE_END);

    displayPanel.setLayout(new java.awt.GridLayout(3, 2));

    priceInfoLabel.setText("Current Price:");
    displayPanel.add(priceInfoLabel);

    bidderInfoLabel.setText("Highest Bidder:");
    displayPanel.add(bidderInfoLabel);

    timeInfoLabel.setText("Time Remaining:");
    displayPanel.add(timeInfoLabel);

    add(displayPanel, java.awt.BorderLayout.CENTER);

    titlePanel.setLayout(new java.awt.GridLayout());

    biddingInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    biddingInfoLabel.setText("Currently Bidding on:");
    titlePanel.add(biddingInfoLabel);

    biddingItemLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    biddingItemLabel.setText("650-777-777");
    titlePanel.add(biddingItemLabel);

    add(titlePanel, java.awt.BorderLayout.NORTH);
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel bidderInfoLabel;
  private javax.swing.JLabel biddingInfoLabel;
  private javax.swing.JLabel biddingItemLabel;
  private javax.swing.JPanel biddingPanel;
  private javax.swing.JPanel displayPanel;
  private javax.swing.JLabel palcement2Label;
  private javax.swing.JLabel placement1Label;
  private javax.swing.JLabel placement3Label;
  private javax.swing.JLabel placement4Label;
  private javax.swing.JLabel priceInfoLabel;
  private javax.swing.JLabel timeInfoLabel;
  private javax.swing.JPanel titlePanel;
  // End of variables declaration//GEN-END:variables
}
