/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.EsporteController;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Esporte;
/**
 *
 * @author SESACRE
 */
public class EsporteBuscarView extends javax.swing.JFrame {
    List<Esporte> ListaEsporte = new ArrayList<>();
    EsporteController eController = new EsporteController();
    /**
     * Creates new form EsporteBuscarView
     */
    public EsporteBuscarView() {
        initComponents();
         CarregarEsporte();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelEsporteBuscarView = new javax.swing.JPanel();
        LbPesquisarEsporte = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnListarTodosEsportes = new javax.swing.JButton();
        LbBuscarNomeEsporte = new javax.swing.JLabel();
        TxtNomeBuscarEsporte = new javax.swing.JTextField();
        BtnBuscarEsporte = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbListaEsporte = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pódio de Esporte");

        PainelEsporteBuscarView.setBackground(new java.awt.Color(255, 255, 255));

        LbPesquisarEsporte.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LbPesquisarEsporte.setForeground(new java.awt.Color(0, 0, 0));
        LbPesquisarEsporte.setText("PESQUISAR ESPORTE");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        BtnListarTodosEsportes.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        BtnListarTodosEsportes.setText("Listar todos os esportes");
        BtnListarTodosEsportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarTodosEsportesActionPerformed(evt);
            }
        });

        LbBuscarNomeEsporte.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LbBuscarNomeEsporte.setForeground(new java.awt.Color(0, 0, 0));
        LbBuscarNomeEsporte.setText("Buscar um esporte");

        TxtNomeBuscarEsporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeBuscarEsporteActionPerformed(evt);
            }
        });

        BtnBuscarEsporte.setText("OK");
        BtnBuscarEsporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarEsporteActionPerformed(evt);
            }
        });

        tbListaEsporte.setAutoCreateRowSorter(true);
        tbListaEsporte.setModel(new javax.swing.table.DefaultTableModel(
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
        tbListaEsporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbListaEsporte.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbListaEsporte);
        if (tbListaEsporte.getColumnModel().getColumnCount() > 0) {
            tbListaEsporte.getColumnModel().getColumn(0).setResizable(false);
            tbListaEsporte.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout PainelEsporteBuscarViewLayout = new javax.swing.GroupLayout(PainelEsporteBuscarView);
        PainelEsporteBuscarView.setLayout(PainelEsporteBuscarViewLayout);
        PainelEsporteBuscarViewLayout.setHorizontalGroup(
            PainelEsporteBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEsporteBuscarViewLayout.createSequentialGroup()
                .addGroup(PainelEsporteBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEsporteBuscarViewLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(PainelEsporteBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbBuscarNomeEsporte)
                            .addGroup(PainelEsporteBuscarViewLayout.createSequentialGroup()
                                .addGroup(PainelEsporteBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtNomeBuscarEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbPesquisarEsporte))
                                .addGap(18, 18, 18)
                                .addComponent(BtnBuscarEsporte))))
                    .addGroup(PainelEsporteBuscarViewLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(BtnListarTodosEsportes, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelEsporteBuscarViewLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(PainelEsporteBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelEsporteBuscarViewLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelEsporteBuscarViewLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        PainelEsporteBuscarViewLayout.setVerticalGroup(
            PainelEsporteBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEsporteBuscarViewLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(LbPesquisarEsporte)
                .addGap(34, 34, 34)
                .addComponent(BtnListarTodosEsportes)
                .addGap(27, 27, 27)
                .addComponent(LbBuscarNomeEsporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelEsporteBuscarViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomeBuscarEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarEsporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelEsporteBuscarView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelEsporteBuscarView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnListarTodosEsportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarTodosEsportesActionPerformed
       
    }//GEN-LAST:event_BtnListarTodosEsportesActionPerformed

    private void TxtNomeBuscarEsporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeBuscarEsporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeBuscarEsporteActionPerformed

    private void BtnBuscarEsporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarEsporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarEsporteActionPerformed

    private void CarregarEsporte(){
        DefaultTableModel modeloTbEsporte = (DefaultTableModel) tbListaEsporte.getModel();
        
        ListaEsporte = eController.Buscar();
        modeloTbEsporte.setRowCount(0);
        
        for(int i = 0; i < ListaEsporte.size();i++){
            modeloTbEsporte.addRow(new Object[]{
            ListaEsporte.get(i).getID(),
            ListaEsporte.get(i).getNome()  
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
                new EsporteBuscarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarEsporte;
    private javax.swing.JButton BtnListarTodosEsportes;
    private javax.swing.JLabel LbBuscarNomeEsporte;
    private javax.swing.JLabel LbPesquisarEsporte;
    private javax.swing.JPanel PainelEsporteBuscarView;
    private javax.swing.JTextField TxtNomeBuscarEsporte;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbListaEsporte;
    // End of variables declaration//GEN-END:variables
}
