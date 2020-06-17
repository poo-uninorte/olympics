/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MedalhaController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Medalha;

/**
 *
 * @author SESACRE
 */
public class MedalhaBuscarView extends javax.swing.JFrame {
    List<Medalha> ListaMedalha = new ArrayList<>();
    MedalhaController mController = new MedalhaController();
    /**
     * Creates new form MedalhaBuscarView
     */
    public MedalhaBuscarView() {
        initComponents();
        CarregarMedalha();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelMedalhaBuscarView = new javax.swing.JPanel();
        LbPesquisarMedalha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnListarTodasModalidades = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbListaMedalha = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LbPesquisarMedalha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LbPesquisarMedalha.setText("PESQUISAR MEDALHAS");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        BtnListarTodasModalidades.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        BtnListarTodasModalidades.setText("LISTAR TODAS AS MEDALHAS");
        BtnListarTodasModalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarTodasModalidadesActionPerformed(evt);
            }
        });

        tbListaMedalha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbListaMedalha.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbListaMedalha.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jScrollPane2.setViewportView(tbListaMedalha);

        javax.swing.GroupLayout PainelMedalhaBuscarViewLayout = new javax.swing.GroupLayout(PainelMedalhaBuscarView);
        PainelMedalhaBuscarView.setLayout(PainelMedalhaBuscarViewLayout);
        PainelMedalhaBuscarViewLayout.setHorizontalGroup(
            PainelMedalhaBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMedalhaBuscarViewLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(PainelMedalhaBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMedalhaBuscarViewLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelMedalhaBuscarViewLayout.createSequentialGroup()
                        .addGroup(PainelMedalhaBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbPesquisarMedalha)
                            .addComponent(jLabel3))
                        .addGap(141, 141, 141))))
            .addGroup(PainelMedalhaBuscarViewLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(BtnListarTodasModalidades)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelMedalhaBuscarViewLayout.setVerticalGroup(
            PainelMedalhaBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMedalhaBuscarViewLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(LbPesquisarMedalha)
                .addGap(40, 40, 40)
                .addComponent(BtnListarTodasModalidades)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMedalhaBuscarView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelMedalhaBuscarView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnListarTodasModalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarTodasModalidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnListarTodasModalidadesActionPerformed

    private void CarregarMedalha(){
      DefaultTableModel modeloTbMedalha = (DefaultTableModel) tbListaMedalha.getModel();
      ListaMedalha = mController.Buscar();
      modeloTbMedalha.setRowCount(0);
      
      for(int i = 0;i < ListaMedalha.size();i++ ){
          modeloTbMedalha.addRow(new Object[]{
              ListaMedalha.get(i).getID(),
              ListaMedalha.get(i).getNome()
                   
          });
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
            java.util.logging.Logger.getLogger(MedalhaBuscarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedalhaBuscarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedalhaBuscarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedalhaBuscarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedalhaBuscarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnListarTodasModalidades;
    private javax.swing.JLabel LbPesquisarMedalha;
    private javax.swing.JPanel PainelMedalhaBuscarView;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbListaMedalha;
    // End of variables declaration//GEN-END:variables
}
