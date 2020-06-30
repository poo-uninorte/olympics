/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.AtletaController;
import controller.PaisController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Atleta;

import model.Pais;


/**
 *
 * @author Mateus
 */
public class AtletaView extends javax.swing.JFrame {
    List<Atleta> ListaAtleta = new ArrayList<>();
    AtletaController aController = new AtletaController();
    Atleta atleta = new Atleta();
    /** Creates new form atletaView */
    public AtletaView() {
        initComponents();
        tbBuscaAtletaS.getColumnModel().getColumn(0).setMinWidth(0);
        tbBuscaAtletaS.getColumnModel().getColumn(0).setMaxWidth(0);
        carregarAtleta();
        txtCodAtletas.setEnabled(false);
        txtCodAtletas.setVisible(false);
        txtNomeAtleta.setEnabled(false);
        LotarComboboxPais();
        btnCadastrarAtletas.setEnabled(false);
        btnLimparAtletas.setEnabled(false);
        btnAtulizarAtleta.setEnabled(false);
        btnDeletarAtleta.setEnabled(false);
        cbPaisAtleta.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGeneroAtletaGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLimparAtletas = new javax.swing.JButton();
        btnCadastrarAtletas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbPaisAtleta = new javax.swing.JComboBox<>();
        txtNomeAtleta = new javax.swing.JTextField();
        rbGeneroMascAtleta = new javax.swing.JRadioButton();
        rbGeneroFeminiAtleta = new javax.swing.JRadioButton();
        txtCodAtletas = new javax.swing.JTextField();
        btnNovoAtleta = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBuscaAtletaS = new javax.swing.JTable();
        btnAtulizarAtleta = new javax.swing.JButton();
        btnDeletarAtleta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadadstro de Atletas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastro de Atletas");

        btnLimparAtletas.setText("Limpar");
        btnLimparAtletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparAtletasActionPerformed(evt);
            }
        });

        btnCadastrarAtletas.setText("Cadastrar");
        btnCadastrarAtletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAtletasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nome");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Genero");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("País");

        cbPaisAtleta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Pais" }));
        cbPaisAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPaisAtletaActionPerformed(evt);
            }
        });

        txtNomeAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAtletaActionPerformed(evt);
            }
        });
        txtNomeAtleta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeAtletaKeyReleased(evt);
            }
        });

        rbGeneroAtletaGroup.add(rbGeneroMascAtleta);
        rbGeneroMascAtleta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbGeneroMascAtleta.setText("Maculino");
        rbGeneroMascAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGeneroMascAtletaActionPerformed(evt);
            }
        });

        rbGeneroAtletaGroup.add(rbGeneroFeminiAtleta);
        rbGeneroFeminiAtleta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbGeneroFeminiAtleta.setText("Feminino");

        btnNovoAtleta.setText("Novo");
        btnNovoAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAtletaActionPerformed(evt);
            }
        });

        tbBuscaAtletaS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Genero", "Pais"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBuscaAtletaS.getTableHeader().setReorderingAllowed(false);
        tbBuscaAtletaS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBuscaAtletaSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBuscaAtletaS);
        if (tbBuscaAtletaS.getColumnModel().getColumnCount() > 0) {
            tbBuscaAtletaS.getColumnModel().getColumn(0).setResizable(false);
        }

        btnAtulizarAtleta.setText("Atualizar");
        btnAtulizarAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtulizarAtletaActionPerformed(evt);
            }
        });

        btnDeletarAtleta.setText("Deletar");
        btnDeletarAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarAtletaActionPerformed(evt);
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
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(188, 188, 188)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNomeAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbPaisAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rbGeneroMascAtleta)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbGeneroFeminiAtleta)))))))
                        .addGap(0, 214, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarAtletas)
                .addGap(18, 18, 18)
                .addComponent(btnAtulizarAtleta)
                .addGap(18, 18, 18)
                .addComponent(btnDeletarAtleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimparAtletas)
                .addGap(144, 144, 144))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbGeneroFeminiAtleta)
                            .addComponent(rbGeneroMascAtleta)
                            .addComponent(cbPaisAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoAtleta)
                    .addComponent(btnLimparAtletas)
                    .addComponent(btnCadastrarAtletas)
                    .addComponent(btnAtulizarAtleta)
                    .addComponent(btnDeletarAtleta))
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void btnLimparAtletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparAtletasActionPerformed
        limparCampos();
     
        
    }//GEN-LAST:event_btnLimparAtletasActionPerformed

    private void btnCadastrarAtletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAtletasActionPerformed
       String sexo = ""; 
       
        Pais paisCB = null;
       
        
        paisCB = (Pais) cbPaisAtleta.getSelectedItem();
       
              
        atleta.setNome(txtNomeAtleta.getText());
        
        if(rbGeneroMascAtleta.isSelected()){
            sexo = "Masculino";
        }else if (rbGeneroFeminiAtleta.isSelected()){
            sexo = "Feminino";
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um Sexo!");
            sexo = null;
        }
        
        atleta.setGenero(sexo);
        atleta.setPais(paisCB);
      
        
       
       
        if(txtNomeAtleta.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe um Atleta","Atleta não Digitado",JOptionPane.ERROR_MESSAGE);
        
            }else{
             boolean salvar = aController.Salvar(atleta);
                if(salvar){
                    JOptionPane.showMessageDialog(this, "Atleta: "+txtNomeAtleta.getText()+
                        " salvo com sucesso! ", "Atleta Salvo", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/correct.png"));
                limparCampos();
               }else{
                JOptionPane.showMessageDialog(this, "O Atleta não pode ser salvo! ","Atleta Error",JOptionPane.ERROR_MESSAGE);
                }
        }
        carregarAtleta();
    }//GEN-LAST:event_btnCadastrarAtletasActionPerformed

    private void txtNomeAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAtletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAtletaActionPerformed

    private void rbGeneroMascAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGeneroMascAtletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbGeneroMascAtletaActionPerformed

    private void cbPaisAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPaisAtletaActionPerformed
          if(cbPaisAtleta.getSelectedItem()== "Selecione um Pais"){
                JOptionPane.showMessageDialog(null, "Selecione um País Valido!","Erro na Opção",JOptionPane.ERROR_MESSAGE);
                cbPaisAtleta.setSelectedIndex(1);
        }
        
        
        
    }//GEN-LAST:event_cbPaisAtletaActionPerformed

    private void txtNomeAtletaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeAtletaKeyReleased
         if(0 <= txtNomeAtleta.getText().length()){
                carregarAtletaComNome(txtNomeAtleta.getText()); 
               }
         
       if(3 <= txtNomeAtleta.getText().length()){
            btnCadastrarAtletas.setEnabled(true);
            btnLimparAtletas.setEnabled(true);
             btnAtulizarAtleta.setEnabled(true);
            btnDeletarAtleta.setEnabled(true);
            cbPaisAtleta.setEnabled(true);
            
            
        }else{
            btnCadastrarAtletas.setEnabled(false);
            btnLimparAtletas.setEnabled(false);
             btnAtulizarAtleta.setEnabled(false);
            btnDeletarAtleta.setEnabled(false);
            cbPaisAtleta.setEnabled(false);
            rbGeneroAtletaGroup.clearSelection();
            carregarAtleta();
            
        }
          
          
          
    }//GEN-LAST:event_txtNomeAtletaKeyReleased

    private void btnNovoAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAtletaActionPerformed
       txtNomeAtleta.setEnabled(true);
    }//GEN-LAST:event_btnNovoAtletaActionPerformed

    private void tbBuscaAtletaSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBuscaAtletaSMouseClicked

        if(tbBuscaAtletaS.getSelectedRow() != -1){ 
            txtNomeAtleta.setEnabled(true);
             btnCadastrarAtletas.setEnabled(true);
            btnLimparAtletas.setEnabled(true);
             btnAtulizarAtleta.setEnabled(true);
            btnDeletarAtleta.setEnabled(true);
            cbPaisAtleta.setEnabled(true);
            
         txtCodAtletas.setText(tbBuscaAtletaS.getValueAt(tbBuscaAtletaS.getSelectedRow(), 0).toString());
         txtNomeAtleta.setText(tbBuscaAtletaS.getValueAt(tbBuscaAtletaS.getSelectedRow(), 1).toString());
         if("Masculino".equals(tbBuscaAtletaS.getValueAt(tbBuscaAtletaS.getSelectedRow(), 2).toString())){
             rbGeneroMascAtleta.setSelected(true);
         }else{
             rbGeneroFeminiAtleta.setSelected(true);
             
         }
        
        }else{
             txtNomeAtleta.setEnabled(false);
             btnCadastrarAtletas.setEnabled(false);
            btnLimparAtletas.setEnabled(false);
             btnAtulizarAtleta.setEnabled(false);
            btnDeletarAtleta.setEnabled(false);
            cbPaisAtleta.setEnabled(false);
        }
        
    }//GEN-LAST:event_tbBuscaAtletaSMouseClicked

    private void btnAtulizarAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtulizarAtletaActionPerformed
        if(txtCodAtletas.getText().length()>0){
        String sexo = ""; 
       
        Pais paisCB = null;
       
          if(cbPaisAtleta.getSelectedItem()== "Selecione um Pais"){
                JOptionPane.showMessageDialog(null, "Selecione um Pais Para atualizar o Atleta!","Selecione um Pais",JOptionPane.WARNING_MESSAGE);
                cbPaisAtleta.setSelectedIndex(1);
                }else{
                         paisCB = (Pais) cbPaisAtleta.getSelectedItem();
                     }
          
        atleta.setID(Integer.parseInt(txtCodAtletas.getText()));
        atleta.setNome(txtNomeAtleta.getText());
        
        if(rbGeneroMascAtleta.isSelected()){
            sexo = "Masculino";
        }else if (rbGeneroFeminiAtleta.isSelected()){
            sexo = "Feminino";
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um Sexo!");
            sexo = null;
        }
        
        atleta.setGenero(sexo);
        atleta.setPais(paisCB);
     
       
             boolean editar = aController.Editar(atleta);
                if(editar){
                    JOptionPane.showMessageDialog(this, "Atleta: "+txtNomeAtleta.getText()+
                        " Editado com sucesso! ", "Atleta Editado", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/correct.png"));
                limparCampos();
               }else{
                JOptionPane.showMessageDialog(this, "O Atleta não pode ser Editado! ","Atleta Error",JOptionPane.ERROR_MESSAGE);
                }
        
        carregarAtleta();
        }else{
             JOptionPane.showMessageDialog(this, "Selecione algum Atleta para Editar ","Atleta Error",JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnAtulizarAtletaActionPerformed

    private void btnDeletarAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarAtletaActionPerformed
         int input = JOptionPane.showConfirmDialog(null, "Você Realmente deseja Excluir esse Atleta?","Excluir Atleta",JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
         
        if (input == JOptionPane.YES_OPTION) { 
        if(tbBuscaAtletaS.getSelectedRow() != -1){
       

                 boolean excluir = aController.Excluir((int)tbBuscaAtletaS.getValueAt(tbBuscaAtletaS.getSelectedRow(), 0));

             if(excluir){
                    JOptionPane.showMessageDialog(this, "Atleta Deletado com Sucesso", "Atleta", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/correct.png"));
                carregarAtleta();
                }else{
                    JOptionPane.showMessageDialog(this, "O Atleta não pode ser Deletado! ","Atleta Error",JOptionPane.ERROR_MESSAGE);
                }


           }else{
                JOptionPane.showMessageDialog(this, "Selecione algum Atleta para deletar ","Atleta Error",JOptionPane.ERROR_MESSAGE);
            }

        } 
        
    }//GEN-LAST:event_btnDeletarAtletaActionPerformed

    
    private void LotarComboboxPais(){
        PaisController pController = new PaisController();
        
        pController.Buscar().forEach((p) -> {
            cbPaisAtleta.addItem(p);
        });
    }
    
    
    
    private void carregarAtletaComNome(String nomeAtleta){
      
        DefaultTableModel modeloTbAtleta = (DefaultTableModel) tbBuscaAtletaS.getModel();
        ListaAtleta = aController.BuscarPorNome(nomeAtleta);
        if(ListaAtleta.size()>0){
        modeloTbAtleta.setRowCount(0);
        for(int i = 0; i<ListaAtleta.size(); i++){
        modeloTbAtleta.addRow(new Object[]{
            ListaAtleta.get(i).getID(),
            ListaAtleta.get(i).getNome(),
            ListaAtleta.get(i).getGenero(),
            ListaAtleta.get(i).getPais().getNome(),

                });
        
            }
        }
        
    }
    
    
    
    private void carregarAtleta(){
        DefaultTableModel modeloTbAtleta = (DefaultTableModel) tbBuscaAtletaS.getModel();
        ListaAtleta = aController.Buscar();
        modeloTbAtleta.setRowCount(0);
        
        for(int i = 0; i<ListaAtleta.size(); i++){
        modeloTbAtleta.addRow(new Object[]{
            ListaAtleta.get(i).getID(),
            ListaAtleta.get(i).getNome(),
            ListaAtleta.get(i).getGenero(),
            ListaAtleta.get(i).getPais().getNome(),
    
        
        });
        
        }
        
    
    }
    
         private void limparCampos(){
         txtNomeAtleta.setText("");
         txtCodAtletas.setText("");
        btnCadastrarAtletas.setEnabled(false);
        btnLimparAtletas.setEnabled(false);
        cbPaisAtleta.setEnabled(false);
         btnAtulizarAtleta.setEnabled(false);
            btnDeletarAtleta.setEnabled(false);
        rbGeneroAtletaGroup.clearSelection();
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
            java.util.logging.Logger.getLogger(AtletaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtletaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtletaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtletaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtletaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtulizarAtleta;
    private javax.swing.JButton btnCadastrarAtletas;
    private javax.swing.JButton btnDeletarAtleta;
    private javax.swing.JButton btnLimparAtletas;
    private javax.swing.JToggleButton btnNovoAtleta;
    private javax.swing.JComboBox<Object> cbPaisAtleta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup rbGeneroAtletaGroup;
    private javax.swing.JRadioButton rbGeneroFeminiAtleta;
    private javax.swing.JRadioButton rbGeneroMascAtleta;
    private javax.swing.JTable tbBuscaAtletaS;
    private javax.swing.JTextField txtCodAtletas;
    private javax.swing.JTextField txtNomeAtleta;
    // End of variables declaration//GEN-END:variables

}
