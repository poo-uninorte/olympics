/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Caveirak52
 */
public class PaisView extends javax.swing.JFrame {

    /**
     * Creates new form PaisView
     */
    public PaisView() {
        initComponents();
        txtIdPais.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPais = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdPais = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomePais = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCadastrarPais = new javax.swing.JButton();
        btnLimparPais = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelPais.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Código");

        txtIdPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPaisActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome do País");

        txtNomePais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomePaisKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cadastro de País");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pais.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        btnCadastrarPais.setText("Cadastrar");
        btnCadastrarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPaisActionPerformed(evt);
            }
        });
        btnCadastrarPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCadastrarPaisKeyPressed(evt);
            }
        });

        btnLimparPais.setText("Limpar");
        btnLimparPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparPaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPaisLayout = new javax.swing.GroupLayout(jPanelPais);
        jPanelPais.setLayout(jPanelPaisLayout);
        jPanelPaisLayout.setHorizontalGroup(
            jPanelPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaisLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanelPaisLayout.createSequentialGroup()
                        .addGroup(jPanelPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdPais, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanelPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNomePais, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(btnLimparPais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnCadastrarPais)
                .addGap(42, 42, 42))
        );
        jPanelPaisLayout.setVerticalGroup(
            jPanelPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaisLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(53, 53, 53)
                .addGroup(jPanelPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanelPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPaisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrarPais)
                            .addComponent(btnLimparPais))
                        .addGap(50, 50, 50))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPaisActionPerformed
        
    }//GEN-LAST:event_txtIdPaisActionPerformed

    private void btnCadastrarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPaisActionPerformed
        if(txtNomePais.getText().equals("")){
         JOptionPane.showMessageDialog(null, "Informe um país","País não Digitado",JOptionPane.ERROR_MESSAGE);
        }else{
        JOptionPane.showMessageDialog(null, "O país digitado foi : "+txtNomePais.getText(),"País Digitado",JOptionPane.WARNING_MESSAGE);
        
        }
        
    }//GEN-LAST:event_btnCadastrarPaisActionPerformed

    private void btnLimparPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPaisActionPerformed
        txtNomePais.setText(" ");
       txtNomePais.requestFocus();
    }//GEN-LAST:event_btnLimparPaisActionPerformed

    private void btnCadastrarPaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastrarPaisKeyPressed
       if(evt.getKeyCode() == evt.VK_ENTER){
        if(txtNomePais.getText().equals("")){
         JOptionPane.showMessageDialog(null, "Informe um país","País não Digitado",JOptionPane.ERROR_MESSAGE);
        }else{
        JOptionPane.showMessageDialog(null, "O país digitado foi : "+txtNomePais.getText(),"País Digitado",JOptionPane.WARNING_MESSAGE);
        
        }
        }
    }//GEN-LAST:event_btnCadastrarPaisKeyPressed

    private void txtNomePaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomePaisKeyPressed
       if(evt.getKeyCode() == evt.VK_ENTER){
        if(txtNomePais.getText().equals("")){
         JOptionPane.showMessageDialog(null, "Informe um país","País não Digitado",JOptionPane.ERROR_MESSAGE);
        }else{
        JOptionPane.showMessageDialog(null, "O país digitado foi : "+txtNomePais.getText(),"País Digitado",JOptionPane.WARNING_MESSAGE);
        
        }
        }
    }//GEN-LAST:event_txtNomePaisKeyPressed

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
            java.util.logging.Logger.getLogger(PaisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaisView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarPais;
    private javax.swing.JButton btnLimparPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelPais;
    private javax.swing.JTextField txtIdPais;
    private javax.swing.JTextField txtNomePais;
    // End of variables declaration//GEN-END:variables
}