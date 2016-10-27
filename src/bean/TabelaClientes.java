/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import ControleBanco.ControlaBd;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Leticia
 */
public class TabelaClientes extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form TabelaClientes
     * @throws java.lang.ClassNotFoundException
     */
    public TabelaClientes() throws ClassNotFoundException {
        initComponents();
        this.getContentPane().setBackground(new Color (255,204,204));
        con = ControlaBd.conectaBd();
    }
    
    
    public void pesquisarClientes(){
        String sql = "select * from clientes where NomeDono like ?";
        
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,lblPesquisarCliente.getText()+"%");
            rs = pst.executeQuery();
            tblClientes.setModel(DbUtils.resultSetToTableModel(rs));
            
                       
        } catch(SQLException error){
            JOptionPane.showMessageDialog(null, error);
        }
    }
    
    public void mostrarInformacoes(){
        int seleciona = tblClientes.getSelectedRow();
        lblIdClientes.setText(tblClientes.getModel().getValueAt(seleciona,0).toString());
        lblNomeDono.setText(tblClientes.getModel().getValueAt(seleciona,1).toString());
        lblTelefone.setText(tblClientes.getModel().getValueAt(seleciona,2).toString());
        lblCelular.setText(tblClientes.getModel().getValueAt(seleciona,3).toString());
        lblRg.setText(tblClientes.getModel().getValueAt(seleciona,4).toString());
        lblCpf.setText(tblClientes.getModel().getValueAt(seleciona,5).toString());
        lblCnpj.setText(tblClientes.getModel().getValueAt(seleciona,6).toString());
        lblEmail.setText(tblClientes.getModel().getValueAt(seleciona,7).toString());
        lblRua.setText(tblClientes.getModel().getValueAt(seleciona,8).toString());
        lblNumero.setText(tblClientes.getModel().getValueAt(seleciona,9).toString());
        lblComplemento.setText(tblClientes.getModel().getValueAt(seleciona,10).toString());
        lblBairro.setText(tblClientes.getModel().getValueAt(seleciona,11).toString());
        lblMunicipio.setText(tblClientes.getModel().getValueAt(seleciona,12).toString());
        lblEstado.setText(tblClientes.getModel().getValueAt(seleciona,13).toString());
        lblCep.setText(tblClientes.getModel().getValueAt(seleciona,14).toString());
        lblPontoRef.setText(tblClientes.getModel().getValueAt(seleciona,15).toString());   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("dbPet?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        clientesQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Clientes c");
        clientesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clientesQuery.getResultList();
        lblPesquisarCliente = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        complementoLabel = new javax.swing.JLabel();
        bairroLabel = new javax.swing.JLabel();
        municipioLabel = new javax.swing.JLabel();
        estadoLabel = new javax.swing.JLabel();
        cepLabel = new javax.swing.JLabel();
        pontoReferenciaLabel = new javax.swing.JLabel();
        lblIdClientes = new javax.swing.JTextField();
        lblNomeDono = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JTextField();
        lblCelular = new javax.swing.JTextField();
        lblCpf = new javax.swing.JTextField();
        lblRg = new javax.swing.JTextField();
        idClientesLabel = new javax.swing.JLabel();
        lblCnpj = new javax.swing.JTextField();
        nomeDonoLabel = new javax.swing.JLabel();
        lblEmail = new javax.swing.JTextField();
        telefoneLabel = new javax.swing.JLabel();
        telefone2Label = new javax.swing.JLabel();
        lblRua = new javax.swing.JTextField();
        lblNumero = new javax.swing.JTextField();
        cpfLabel = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JTextField();
        rgLabel = new javax.swing.JLabel();
        lblBairro = new javax.swing.JTextField();
        cnpjLabel = new javax.swing.JLabel();
        lblMunicipio = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        lblEstado = new javax.swing.JTextField();
        ruaLabel = new javax.swing.JLabel();
        lblCep = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        lblPontoRef = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        lblPesquisarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblPesquisarClienteKeyReleased(evt);
            }
        });

        jLabel1.setText("Pesquisar:");

        tblClientes.setBackground(new java.awt.Color(255, 204, 204));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        complementoLabel.setText("Complemento:");

        bairroLabel.setText("Bairro:");

        municipioLabel.setText("Município:");

        estadoLabel.setText("Estado:");

        cepLabel.setText("CEP:");

        pontoReferenciaLabel.setText("Ponto de Referência:");

        idClientesLabel.setText("Código Cliente:");

        nomeDonoLabel.setText("Nome:");

        telefoneLabel.setText("Telefone:");

        telefone2Label.setText("Celular:");

        cpfLabel.setText("Cpf:");

        rgLabel.setText("Rg:");

        cnpjLabel.setText("Cnpj:");

        emailLabel.setText("Email:");

        ruaLabel.setText("Rua:");

        numeroLabel.setText("Número:");

        btnVoltar.setBackground(new java.awt.Color(255, 204, 204));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rgLabel)
                                            .addComponent(telefoneLabel)
                                            .addComponent(emailLabel)
                                            .addComponent(ruaLabel)
                                            .addComponent(complementoLabel)
                                            .addComponent(bairroLabel)
                                            .addComponent(estadoLabel)
                                            .addComponent(pontoReferenciaLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(idClientesLabel)
                                        .addGap(2, 2, 2)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblComplemento)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(municipioLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMunicipio))
                                    .addComponent(lblPontoRef)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblRg, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(telefone2Label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cpfLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cnpjLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblCnpj))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(numeroLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cepLabel)))
                                        .addGap(0, 78, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblIdClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nomeDonoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNomeDono))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idClientesLabel)
                    .addComponent(lblIdClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeDonoLabel)
                    .addComponent(lblNomeDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneLabel)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone2Label)
                    .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rgLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cpfLabel)
                        .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cnpjLabel)
                        .addComponent(lblCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruaLabel)
                    .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLabel)
                    .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(complementoLabel)
                    .addComponent(lblComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bairroLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(municipioLabel)
                        .addComponent(lblMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoLabel)
                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepLabel)
                    .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pontoReferenciaLabel)
                    .addComponent(lblPontoRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPesquisarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPesquisarClienteKeyReleased
        pesquisarClientes();
    }//GEN-LAST:event_lblPesquisarClienteKeyReleased

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        mostrarInformacoes();
    }//GEN-LAST:event_tblClientesMouseClicked

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
            java.util.logging.Logger.getLogger(TabelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new TabelaClientes().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TabelaClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel cepLabel;
    private java.util.List<bean.Clientes> clientesList;
    private javax.persistence.Query clientesQuery;
    private javax.swing.JLabel cnpjLabel;
    private javax.swing.JLabel complementoLabel;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel emailLabel;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JLabel idClientesLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblBairro;
    private javax.swing.JTextField lblCelular;
    private javax.swing.JTextField lblCep;
    private javax.swing.JTextField lblCnpj;
    private javax.swing.JTextField lblComplemento;
    private javax.swing.JTextField lblCpf;
    private javax.swing.JTextField lblEmail;
    private javax.swing.JTextField lblEstado;
    private javax.swing.JTextField lblIdClientes;
    private javax.swing.JTextField lblMunicipio;
    private javax.swing.JTextField lblNomeDono;
    private javax.swing.JTextField lblNumero;
    private javax.swing.JFormattedTextField lblPesquisarCliente;
    private javax.swing.JTextField lblPontoRef;
    private javax.swing.JTextField lblRg;
    private javax.swing.JTextField lblRua;
    private javax.swing.JTextField lblTelefone;
    private javax.swing.JLabel municipioLabel;
    private javax.swing.JLabel nomeDonoLabel;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JLabel pontoReferenciaLabel;
    private javax.swing.JLabel rgLabel;
    private javax.swing.JLabel ruaLabel;
    private javax.swing.JTable tblClientes;
    private javax.swing.JLabel telefone2Label;
    private javax.swing.JLabel telefoneLabel;
    // End of variables declaration//GEN-END:variables
}
