/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EsporteController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Esporte;

/**
 *
 * @author Caveirak52
 */
public class EsporteView extends javax.swing.JFrame {
    List<Esporte> ListaEsporte = new ArrayList<>();
    EsporteController eController = new EsporteController();
    Esporte esporte = new Esporte();
    /**
     * Creates new form EsporteView
     */
    public EsporteView() {
        initComponents();
        txtCodEsporte.setVisible(false);
        txtCodEsporte.setEnabled(false);
        tbEsporte.getColumnModel().getColumn(0).setMinWidth(0);
        tbEsporte.getColumnModel().getColumn(0).setMaxWidth(0);
        txtNomeEsporte.setEnabled(false);
        btnAtualizarEsporte.setEnabled(false);
        btnDeletarEsporte.setEnabled(false);
        btnCadastrarEsporte.setEnabled(false);
        CarregarEsporte();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLimparEsporte = new javax.swing.JButton();
        btnCadastrarEsporte = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnNovoEsporte = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbEsporte = new javax.swing.JTable();
        btnAtualizarEsporte = new javax.swing.JButton();
        btnDeletarEsporte = new javax.swing.JButton();
        txtCodEsporte = new javax.swing.JTextField();
        txtNomeEsporte = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Esportes");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastro de Esportes");

        btnLimparEsporte.setText("Limpar");
        btnLimparEsporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparEsporteActionPerformed(evt);
            }
        });

        btnCadastrarEsporte.setText("Cadastrar");
        btnCadastrarEsporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarEsporteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Esporte");

        btnNovoEsporte.setText("Novo");
        btnNovoEsporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoEsporteActionPerformed(evt);
            }
        });

        tbEsporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do Esporte"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEsporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEsporteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbEsporte);
        if (tbEsporte.getColumnModel().getColumnCount() > 0) {
            tbEsporte.getColumnModel().getColumn(0).setResizable(false);
            tbEsporte.getColumnModel().getColumn(1).setResizable(false);
        }

        btnAtualizarEsporte.setText("Atualizar");
        btnAtualizarEsporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarEsporteActionPerformed(evt);
            }
        });

        btnDeletarEsporte.setText("Deletar");
        btnDeletarEsporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarEsporteActionPerformed(evt);
            }
        });

        txtNomeEsporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeEsporteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnNovoEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCadastrarEsporte)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizarEsporte)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletarEsporte)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimparEsporte))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(txtNomeEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoEsporte)
                    .addComponent(btnCadastrarEsporte)
                    .addComponent(btnAtualizarEsporte)
                    .addComponent(btnDeletarEsporte)
                    .addComponent(btnLimparEsporte))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparEsporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparEsporteActionPerformed
       txtNomeEsporte.setText("");
    }//GEN-LAST:event_btnLimparEsporteActionPerformed

    private void btnNovoEsporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoEsporteActionPerformed
        txtNomeEsporte.setEnabled(true);
    }//GEN-LAST:event_btnNovoEsporteActionPerformed

    private void btnCadastrarEsporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarEsporteActionPerformed
        
          if(txtNomeEsporte.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Informe um Esporte","Esporte não Digitado",JOptionPane.ERROR_MESSAGE);
        }else{
               esporte.setNome(txtNomeEsporte.getText());
                boolean salvar = eController.Salvar(esporte);
            if(salvar){
                JOptionPane.showMessageDialog(this, "Esporte: "+txtNomeEsporte.getText()+
                        " salvo com sucesso! ", "Esporte Salvo", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/correct.png"));
            CarregarEsporte();
            limparCampos();
            }else{
                JOptionPane.showMessageDialog(this, "O Esporte não pode ser salvo! ","País Error",JOptionPane.ERROR_MESSAGE);
            }
        }
         
    }//GEN-LAST:event_btnCadastrarEsporteActionPerformed

    private void tbEsporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEsporteMouseClicked
        if(tbEsporte.getSelectedRow() != -1){
             btnDeletarEsporte.setEnabled(true);
             btnCadastrarEsporte.setEnabled(true);
             btnAtualizarEsporte.setEnabled(true);
             txtNomeEsporte.setEnabled(true);
             txtCodEsporte.setText(tbEsporte.getValueAt(tbEsporte.getSelectedRow(), 0).toString());
              txtNomeEsporte.setText(tbEsporte.getValueAt(tbEsporte.getSelectedRow(), 1).toString());
        }else{
             btnDeletarEsporte.setEnabled(false);
             btnCadastrarEsporte.setEnabled(false);
             btnAtualizarEsporte.setEnabled(false);
             txtNomeEsporte.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_tbEsporteMouseClicked

    private void btnAtualizarEsporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarEsporteActionPerformed
         if(txtCodEsporte.getText().length()>0){
             esporte.setID(Integer.parseInt(txtCodEsporte.getText()));
             esporte.setNome(txtNomeEsporte.getText());
             boolean Editar = eController.Editar(esporte);
             
              if(Editar){
                JOptionPane.showMessageDialog(this, "Esporte: "+txtNomeEsporte.getText()+
                        " Editado com sucesso! ", "Esporte Editado", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/correct.png"));
            CarregarEsporte();
            limparCampos();
            }else{
                JOptionPane.showMessageDialog(this, "O Esporte não pode ser Editado! ","Esporte Error",JOptionPane.ERROR_MESSAGE);
            }
             
         }else{
             JOptionPane.showMessageDialog(this, "Selecione algum Esporte para Editar ","Esporte Error",JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnAtualizarEsporteActionPerformed

    private void txtNomeEsporteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeEsporteKeyReleased
        if(0<=txtNomeEsporte.getText().length()){ 
        CarregarEsporteComNome(txtNomeEsporte.getText());
        }
        
        if(3 <= txtNomeEsporte.getText().length()){
            btnCadastrarEsporte.setEnabled(true);
            btnLimparEsporte.setEnabled(true);
            btnAtualizarEsporte.setEnabled(true);
            btnDeletarEsporte.setEnabled(true);
        }else{
            btnCadastrarEsporte.setEnabled(false);
              btnLimparEsporte.setEnabled(false);
              btnAtualizarEsporte.setEnabled(false);
                btnDeletarEsporte.setEnabled(false);
                CarregarEsporte();
        }
    }//GEN-LAST:event_txtNomeEsporteKeyReleased

    private void btnDeletarEsporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarEsporteActionPerformed
         int input = JOptionPane.showConfirmDialog(null, "Você Realmente deseja Excluir esse Esporte?","Esporte ",JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
         
        if (input == JOptionPane.YES_OPTION) {
        if(tbEsporte.getSelectedRow() != -1){
                 boolean excluir = eController.Excluir((int)tbEsporte.getValueAt(tbEsporte.getSelectedRow(), 0));

             if(excluir){
                    JOptionPane.showMessageDialog(this, "Esporte Deletado com Sucesso", "Esporte", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/correct.png"));
                CarregarEsporte();
                limparCampos();
                }else{
                    JOptionPane.showMessageDialog(this, "O Esporte não pode ser Deletado! ","Esporte Error",JOptionPane.ERROR_MESSAGE);
                }


           }else{
                JOptionPane.showMessageDialog(this, "Selecione algum País para deletar ","País Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeletarEsporteActionPerformed

    private void CarregarEsporteComNome(String NomeEsporte){
       DefaultTableModel EsporteTB = (DefaultTableModel) tbEsporte.getModel();
       ListaEsporte = eController.BuscarBuscarPorNome(NomeEsporte);
        if(ListaEsporte.size()>0){
       EsporteTB.setRowCount(0);
       
       for(int i = 0; i<ListaEsporte.size();i++){
           EsporteTB.addRow(new Object[]{
              ListaEsporte.get(i).getID(),
               ListaEsporte.get(i).getNome()
           });
       
       }
        }
       
    }
    
    private void CarregarEsporte(){
       DefaultTableModel EsporteTB = (DefaultTableModel) tbEsporte.getModel();
       ListaEsporte = eController.Buscar();
       EsporteTB.setRowCount(0);
       
       for(int i = 0; i<ListaEsporte.size();i++){
           EsporteTB.addRow(new Object[]{
              ListaEsporte.get(i).getID(),
               ListaEsporte.get(i).getNome()
           });
       
       }
       
       
    }
    
    public void limparCampos(){
    txtNomeEsporte.setText("");
    txtCodEsporte.setText("");
    txtNomeEsporte.requestFocus();
    
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
            java.util.logging.Logger.getLogger(EsporteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EsporteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EsporteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EsporteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EsporteView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarEsporte;
    private javax.swing.JButton btnCadastrarEsporte;
    private javax.swing.JButton btnDeletarEsporte;
    private javax.swing.JButton btnLimparEsporte;
    private javax.swing.JToggleButton btnNovoEsporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbEsporte;
    private javax.swing.JTextField txtCodEsporte;
    private javax.swing.JTextField txtNomeEsporte;
    // End of variables declaration//GEN-END:variables
}
