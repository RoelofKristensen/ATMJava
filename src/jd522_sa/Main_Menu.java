/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jd522_sa;

import javax.swing.JOptionPane;

/**
 *
 * @author rjnkr
 */
public class Main_Menu extends javax.swing.JFrame {

    
    /**
     * Creates new form Main_Menu
     */
    public  Main_Menu() {
        initComponents();
    }
    int globalID;
    public void setUser(int id){
        user.setID(id);
        globalID = id;
    }
    Account user = new Account();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainMenu = new javax.swing.JPanel();
        lblMainMenu = new javax.swing.JLabel();
        pnlBalance = new javax.swing.JPanel();
        btnBalance = new javax.swing.JButton();
        pnlWithdrw = new javax.swing.JPanel();
        btnWithdraw = new javax.swing.JButton();
        pnlBack = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        pnlDeposit = new javax.swing.JPanel();
        btnDeposit = new javax.swing.JButton();
        pnlStatement = new javax.swing.JPanel();
        btnStatement = new javax.swing.JButton();
        pnlExit = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMainMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlMainMenu.setPreferredSize(new java.awt.Dimension(226, 48));

        lblMainMenu.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        lblMainMenu.setForeground(new java.awt.Color(255, 0, 0));
        lblMainMenu.setText("Main Menu\n");
        lblMainMenu.setToolTipText("");

        javax.swing.GroupLayout pnlMainMenuLayout = new javax.swing.GroupLayout(pnlMainMenu);
        pnlMainMenu.setLayout(pnlMainMenuLayout);
        pnlMainMenuLayout.setHorizontalGroup(
            pnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainMenuLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblMainMenu)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        pnlMainMenuLayout.setVerticalGroup(
            pnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainMenuLayout.createSequentialGroup()
                .addComponent(lblMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlBalance.setPreferredSize(new java.awt.Dimension(110, 110));

        btnBalance.setForeground(new java.awt.Color(255, 0, 0));
        btnBalance.setText("Balance");
        btnBalance.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBalance.setMaximumSize(new java.awt.Dimension(84, 22));
        btnBalance.setMinimumSize(new java.awt.Dimension(84, 22));
        btnBalance.setPreferredSize(new java.awt.Dimension(84, 22));
        btnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBalanceLayout = new javax.swing.GroupLayout(pnlBalance);
        pnlBalance.setLayout(pnlBalanceLayout);
        pnlBalanceLayout.setHorizontalGroup(
            pnlBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBalanceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBalanceLayout.setVerticalGroup(
            pnlBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBalanceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlWithdrw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlWithdrw.setPreferredSize(new java.awt.Dimension(110, 110));

        btnWithdraw.setForeground(new java.awt.Color(255, 0, 0));
        btnWithdraw.setText("Withdraw");
        btnWithdraw.setMaximumSize(new java.awt.Dimension(84, 22));
        btnWithdraw.setMinimumSize(new java.awt.Dimension(84, 22));
        btnWithdraw.setPreferredSize(new java.awt.Dimension(84, 22));
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlWithdrwLayout = new javax.swing.GroupLayout(pnlWithdrw);
        pnlWithdrw.setLayout(pnlWithdrwLayout);
        pnlWithdrwLayout.setHorizontalGroup(
            pnlWithdrwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWithdrwLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlWithdrwLayout.setVerticalGroup(
            pnlWithdrwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWithdrwLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlBack.setPreferredSize(new java.awt.Dimension(110, 110));

        btnBack.setForeground(new java.awt.Color(255, 0, 0));
        btnBack.setText("<<Back");
        btnBack.setMaximumSize(new java.awt.Dimension(84, 22));
        btnBack.setMinimumSize(new java.awt.Dimension(84, 22));
        btnBack.setPreferredSize(new java.awt.Dimension(84, 22));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlDeposit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlDeposit.setPreferredSize(new java.awt.Dimension(110, 110));

        btnDeposit.setForeground(new java.awt.Color(255, 0, 0));
        btnDeposit.setText("Deposit");
        btnDeposit.setMaximumSize(new java.awt.Dimension(84, 22));
        btnDeposit.setMinimumSize(new java.awt.Dimension(84, 22));
        btnDeposit.setPreferredSize(new java.awt.Dimension(84, 22));
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDepositLayout = new javax.swing.GroupLayout(pnlDeposit);
        pnlDeposit.setLayout(pnlDepositLayout);
        pnlDepositLayout.setHorizontalGroup(
            pnlDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDepositLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDepositLayout.setVerticalGroup(
            pnlDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDepositLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlStatement.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlStatement.setPreferredSize(new java.awt.Dimension(110, 110));

        btnStatement.setForeground(new java.awt.Color(255, 0, 0));
        btnStatement.setText("Statement");
        btnStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStatementLayout = new javax.swing.GroupLayout(pnlStatement);
        pnlStatement.setLayout(pnlStatementLayout);
        pnlStatementLayout.setHorizontalGroup(
            pnlStatementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStatementLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnStatement, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlStatementLayout.setVerticalGroup(
            pnlStatementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatementLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnStatement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.setMaximumSize(new java.awt.Dimension(84, 22));
        btnExit.setMinimumSize(new java.awt.Dimension(84, 22));
        btnExit.setPreferredSize(new java.awt.Dimension(84, 22));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlExitLayout = new javax.swing.GroupLayout(pnlExit);
        pnlExit.setLayout(pnlExitLayout);
        pnlExitLayout.setHorizontalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlExitLayout.setVerticalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlWithdrw, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(pnlMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(pnlMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlWithdrw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlStatement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Balance btn Code">  
    private void btnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceActionPerformed
        user.setBalance();
        JOptionPane.showMessageDialog(null, "Your current balance is: R"+ user.getBalance());
        
    }//GEN-LAST:event_btnBalanceActionPerformed
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Withdraw btn Code"> 
    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        Withdraw page = new Withdraw();
        page.setVisible(true);
        page.setUsersID(globalID);
        this.dispose();
    }//GEN-LAST:event_btnWithdrawActionPerformed
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Deposit btn Code"> 
    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        Deposit page = new Deposit();
        page.setVisible(true);
        page.setUsersID(globalID);
        this.dispose();  
    }//GEN-LAST:event_btnDepositActionPerformed
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Statement btn Code"> 
    private void btnStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatementActionPerformed
        user.printStatement();
    }//GEN-LAST:event_btnStatementActionPerformed
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Back btn Code"> 
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new ATM_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Exit btn Code"> 
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed
    // </editor-fold> 
    
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
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBalance;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnStatement;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel lblMainMenu;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlBalance;
    private javax.swing.JPanel pnlDeposit;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlMainMenu;
    private javax.swing.JPanel pnlStatement;
    private javax.swing.JPanel pnlWithdrw;
    // End of variables declaration//GEN-END:variables
}
