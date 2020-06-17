/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author SESACRE
 */
public class AtletaBuscarView extends javax.swing.JFrame {

    /**
     * Creates new form AtletaBuscarView
     */
    public AtletaBuscarView() {
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

        PainelAtletaBuscarView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnListarTodosAtletas = new javax.swing.JButton();
        LbBuscarNomeAtleta = new javax.swing.JLabel();
        TxtNomeAtleta = new javax.swing.JTextField();
        BtnBuscarAtleta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaListaAtleta = new javax.swing.JTable();
        LbInformarNomeAtleta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("PESQUISAR ATLETAS");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        BtnListarTodosAtletas.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        BtnListarTodosAtletas.setText("Listar todos os atletas");
        BtnListarTodosAtletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarTodosAtletasActionPerformed(evt);
            }
        });

        LbBuscarNomeAtleta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LbBuscarNomeAtleta.setText("Buscar por atleta");

        TxtNomeAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeAtletaActionPerformed(evt);
            }
        });

        BtnBuscarAtleta.setText("OK");
        BtnBuscarAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarAtletaActionPerformed(evt);
            }
        });

        TabelaListaAtleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome", "Gênero   ", "Ouro", "Prata", "Bronze", "Total"
            }
        ));
        TabelaListaAtleta.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TabelaListaAtleta.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jScrollPane2.setViewportView(TabelaListaAtleta);

        LbInformarNomeAtleta.setText("Informe o nome ");

        javax.swing.GroupLayout PainelAtletaBuscarViewLayout = new javax.swing.GroupLayout(PainelAtletaBuscarView);
        PainelAtletaBuscarView.setLayout(PainelAtletaBuscarViewLayout);
        PainelAtletaBuscarViewLayout.setHorizontalGroup(
            PainelAtletaBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAtletaBuscarViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(141, 141, 141))
            .addGroup(PainelAtletaBuscarViewLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(PainelAtletaBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbBuscarNomeAtleta)
                    .addGroup(PainelAtletaBuscarViewLayout.createSequentialGroup()
                        .addComponent(LbInformarNomeAtleta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelAtletaBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(PainelAtletaBuscarViewLayout.createSequentialGroup()
                                .addComponent(TxtNomeAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnBuscarAtleta)))))
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(PainelAtletaBuscarViewLayout.createSequentialGroup()
                .addGroup(PainelAtletaBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAtletaBuscarViewLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(BtnListarTodosAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelAtletaBuscarViewLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelAtletaBuscarViewLayout.setVerticalGroup(
            PainelAtletaBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAtletaBuscarViewLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(BtnListarTodosAtletas)
                .addGap(27, 27, 27)
                .addComponent(LbBuscarNomeAtleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelAtletaBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomeAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarAtleta)
                    .addComponent(LbInformarNomeAtleta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelAtletaBuscarView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelAtletaBuscarView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNomeAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeAtletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeAtletaActionPerformed

    private void BtnListarTodosAtletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarTodosAtletasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnListarTodosAtletasActionPerformed

    private void BtnBuscarAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarAtletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarAtletaActionPerformed

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
            java.util.logging.Logger.getLogger(AtletaBuscarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtletaBuscarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtletaBuscarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtletaBuscarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtletaBuscarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarAtleta;
    private javax.swing.JButton BtnListarTodosAtletas;
    private javax.swing.JLabel LbBuscarNomeAtleta;
    private javax.swing.JLabel LbInformarNomeAtleta;
    private javax.swing.JPanel PainelAtletaBuscarView;
    private javax.swing.JTable TabelaListaAtleta;
    private javax.swing.JTextField TxtNomeAtleta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
