/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appbookelandia.view;

import appbookelandia.controler.ControllerCadClientes;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Arthur
 */
public class FrmCadCliente extends javax.swing.JFrame {

    /**
     * Creates new form FrmCadCliente
     */
    
    public FrmCadCliente() {
        initComponents();
        this.cadClientes = new ControllerCadClientes(this);
    }
                
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeCliente = new javax.swing.JTextField();
        btnSalvarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCpfCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelCliente = new javax.swing.JTextField();
        txtEndCliente = new javax.swing.JTextField();
        txtEmailCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSenhaCliente = new javax.swing.JPasswordField();
        btnConsultaCpf = new javax.swing.JButton();
        btnExcluiCliente = new javax.swing.JButton();
        btnAlteraCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        btnSalvarCliente.setText("Cadastrar Cliente");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("NOME DO CLIENTE");

        jLabel2.setText("CPF DO CLIENTE");

        jLabel3.setText("TELEFONE DO CLIENTE");

        jLabel4.setText("ENDERE??O DO CLIENTE");

        jLabel5.setText("EMAIL ");

        jLabel6.setText("SENHA");

        btnConsultaCpf.setText("Consulta Cliente por CPF");
        btnConsultaCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaCpfActionPerformed(evt);
            }
        });

        btnExcluiCliente.setText("Excluir Cliente");

        btnAlteraCliente.setText("Alterar Dados");
        btnAlteraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteraClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 24, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTelCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCpfCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultaCpf)
                            .addComponent(btnExcluiCliente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAlteraCliente)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvarCliente)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEndCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSenhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultaCpf)
                    .addComponent(btnSalvarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluiCliente)
                    .addComponent(btnAlteraCliente))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        // TODO add your handling code here:
        try {
            cadClientes.cadastraCliente();
            JOptionPane.showMessageDialog(this, "Cliente Cadastrado com Sucesso");
            cadClientes.limpaTela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Deu erro!!");
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnConsultaCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaCpfActionPerformed
        // TODO add your handling code here:
        try {
            cadClientes.consultaCliente();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Deu erro!!");
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnConsultaCpfActionPerformed

    /*    */
    
    private void btnAlteraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteraClienteActionPerformed
        // TODO add your handling code here:
        try {
            cadClientes.alteraCliente();
            JOptionPane.showMessageDialog(this, "Update feito com Sucesso");
            cadClientes.limpaTela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Deu erro!!");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAlteraClienteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadCliente().setVisible(true);
            }
        });
    }
    
    private ControllerCadClientes cadClientes;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlteraCliente;
    private javax.swing.JButton btnConsultaCpf;
    private javax.swing.JButton btnExcluiCliente;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCpfCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEndCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JPasswordField txtSenhaCliente;
    private javax.swing.JTextField txtTelCliente;
    // End of variables declaration//GEN-END:variables

    
    /**
     * @return the btnNovoCliente
     */
  
    /**
     * @param btnNovoCliente the btnNovoCliente to set
     */

    /**
     * @return the btnSalvarCliente
     */
    public javax.swing.JButton getBtnSalvarCliente() {
        return btnSalvarCliente;
    }

    /**
     * @param btnSalvarCliente the btnSalvarCliente to set
     */
    public void setBtnSalvarCliente(javax.swing.JButton btnSalvarCliente) {
        this.btnSalvarCliente = btnSalvarCliente;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     * @return the txtCpfCliente
     */
    public javax.swing.JTextField getTxtCpfCliente() {
        return txtCpfCliente;
    }

    /**
     * @param txtCpfCliente the txtCpfCliente to set
     */
    public void setTxtCpfCliente(javax.swing.JTextField txtCpfCliente) {
        this.txtCpfCliente = txtCpfCliente;
    }

    /**
     * @return the txtDataCliente
     */
    public javax.swing.JTextField getTxtDataCliente() {
        return txtEmailCliente;
    }

    /**
     * @param txtDataCliente the txtDataCliente to set
     */
    public void setTxtDataCliente(javax.swing.JTextField txtDataCliente) {
        this.txtEmailCliente = txtDataCliente;
    }

    /**
     * @return the txtEndCliente
     */
    public javax.swing.JTextField getTxtEndCliente() {
        return txtEndCliente;
    }

    /**
     * @param txtEndCliente the txtEndCliente to set
     */
    public void setTxtEndCliente(javax.swing.JTextField txtEndCliente) {
        this.txtEndCliente = txtEndCliente;
    }

    /**
     * @return the txtNomeCliente
     */
    public javax.swing.JTextField getTxtNomeCliente() {
        return txtNomeCliente;
    }

    /**
     * @param txtNomeCliente the txtNomeCliente to set
     */
    public void setTxtNomeCliente(javax.swing.JTextField txtNomeCliente) {
        this.txtNomeCliente = txtNomeCliente;
    }

    /**
     * @return the txtTelCliente
     */
    public javax.swing.JTextField getTxtTelCliente() {
        return txtTelCliente;
    }

    /**
     * @param txtTelCliente the txtTelCliente to set
     */
    public void setTxtTelCliente(javax.swing.JTextField txtTelCliente) {
        this.txtTelCliente = txtTelCliente;
    }

    public JTextField getTxtEmailCliente() {
        return txtEmailCliente;
    }

    public void setTxtEmailCliente(JTextField txtEmailCliente) {
        this.txtEmailCliente = txtEmailCliente;
    }

    public JPasswordField getTxtSenhaCliente() {
        return txtSenhaCliente;
    }

    public void setTxtSenhaCliente(JPasswordField txtSenhaCliente) {
        this.txtSenhaCliente = txtSenhaCliente;
    }

    
    
    
}
